package bicicletas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Random;

@Configuration
@ComponentScan("bicicletas")
@PropertySource(value = "classpath:bicicletas.properties", encoding = "UTF-8")
public class Configuracion {

    // Random es de Java, no se puede anotar: lo declara la configuración para que Spring lo gestione
    @Bean
    public Random random(@Value("${bicicletas.semilla}") long semilla) {
        return new Random(semilla);
    }
}
