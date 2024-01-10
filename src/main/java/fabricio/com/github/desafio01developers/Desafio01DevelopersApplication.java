package fabricio.com.github.desafio01developers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Desafio01DevelopersApplication {

	public static void main(String[] args) {

		SpringApplication.run(Desafio01DevelopersApplication.class, args);
	}

}
