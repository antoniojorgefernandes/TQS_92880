package tqs.Assignment;


import org.springframework.web.client.RestTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.*;
import org.springframework.boot.autoconfigure.*;

@ComponentScan(basePackageClasses = AirQualityController.class)

@EnableAutoConfiguration 
@SpringBootApplication
public class AssignmentApplication {

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) throws Exception{
		SpringApplication.run(AssignmentApplication.class, args);
	}


	
}
