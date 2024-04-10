package com.bank.dbank;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
				info = @Info(
								title = "D-Bank App",
								description = "Backend Rest APIs for D-Bank",
								version = "v1.0",
								contact = @Contact(
												name = "Krishanjit Rajbongshi",
												email = "krishanjit31122001@gmail.com",
												url = ""
								),
								license = @License(
												name = "D-Bank",
												url = ""
								)
				),
				externalDocs = @ExternalDocumentation(
								description = "D-Bank Application Documentation",
								url = ""
				)

)
public class DbankApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbankApplication.class, args);

	}

}
