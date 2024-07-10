package one.digitalinnovation.gof.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI DocApi(){
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Spring Web API Swagger")
                                .description("API CRUD")
                                .version("V1.0")
                                .contact(new Contact().name(": Bruno da Silva Garbero - email: bruno_garbero@hotmail.com").email("bruno_garbero@hotmail.com"))
                );
    }
}
