package in.vishal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.vishal.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=SpringApplication.run(Application.class, args);
		
		EmployeeService bean = con.getBean(EmployeeService.class);
		bean.saveDate();
	}

}
