package edu.vedev404.gestaodeestoque;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server url")})
@SpringBootApplication
public class GestaodeestoqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaodeestoqueApplication.class, args);
	}

}
