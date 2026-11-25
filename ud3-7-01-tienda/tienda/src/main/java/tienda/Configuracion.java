package tienda;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:tienda.properties", encoding = "UTF-8")
public class Configuracion {
}
