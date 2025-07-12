package jbackend.ConfigureInstruction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConfigureInstructionApplication {

	@Bean
	@Profile("dev")
	public RestTemplate getTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(ConfigureInstructionApplication.class, args);
	}

}
