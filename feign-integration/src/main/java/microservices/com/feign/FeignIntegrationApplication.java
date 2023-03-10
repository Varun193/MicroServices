package microservices.com.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignIntegrationApplication.class, args);
	}
}