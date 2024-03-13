package in.vishal.generators;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.engine.jdbc.connections.spi.JdbcConnectionAccess;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class PaintIdGenerator implements IdentifierGenerator{

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		String prefix="PAO64";
		String suffix="";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
          Statement st = connection.createStatement();
			String sql="select paint_seq.nextval from dual";
			ResultSet rs = st.executeQuery(sql);
			if(rs.next())
			{
				int seqval =rs.getInt(1);
				suffix= String.valueOf(seqval);
			}
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return prefix + suffix ;
	}

}
