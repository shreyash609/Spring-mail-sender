package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.UserService;

@SpringBootApplication
public class SpringMailSenderApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(SpringMailSenderApplication.class, args);
		
		UserService bean = ctxt.getBean(UserService.class);
		
		bean.sendEmail("shreyash.sarve14@gmail.com");
	}

}
