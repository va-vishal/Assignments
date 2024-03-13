package in.vishal.generators;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class PaintIdGenerator implements IdentifierGenerator {

	@Override
    public Object generate(SharedSessionContractImplementor session, Object object) {
        String prefix = "PAO64";
        String suffix = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring", "root", "160103");
            Statement st = connection.createStatement();

            String sql = "SELECT LAST_INSERT_ID()";
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                long lastId = rs.getLong(1);
                suffix = String.valueOf(lastId + 1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return prefix + suffix;
    }
}
		
