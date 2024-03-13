package in.vishal;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import in.vishal.entity.PaintEntity;
import in.vishal.repo.PaintRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=SpringApplication.run(Application.class, args);
		
		PaintRepo repo = con.getBean(PaintRepo.class);
		
		PaintEntity p = new PaintEntity();
	
		
		p.setName("tractor");
		p.setQun(50);
		p.setManDate(new Date());
		repo.save(p);
		con.close();
		
		 
		
	}

}
