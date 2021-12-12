#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@EnableFeignClients
@EnableCaching
@OpenAPIDefinition
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
