package in.vishal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.vishal.repo.BooksRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	 ConfigurableApplicationContext c = SpringApplication.run(Application.class, args);
	 
	 
	 BooksRepository bean = c.getBean(BooksRepository.class);
	 bean.InsertRecord( 2,"harrypotter","jkrollings", 1500);
	 
	 
	}

}
