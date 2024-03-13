package in.vishal;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.vishal.entity.PaintEntity;
import in.vishal.repository.PaintRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=SpringApplication.run(Application.class, args);
		
		PaintRepo bean = con.getBean(PaintRepo.class);
		
		PaintEntity py= new PaintEntity();
		
		py.setName("vishal");
		py.setManDate(new Date());
		py.setQun(10);
		bean.save(py);
		con.close();
	}

}
