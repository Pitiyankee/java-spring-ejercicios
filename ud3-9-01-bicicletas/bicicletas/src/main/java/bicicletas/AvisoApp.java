package bicicletas;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// Es el aviso por defecto
@Component
@Primary
public class AvisoApp implements Aviso {

    @Override
    public String avisar(String usuario, String bicicleta) {
        return "Aviso en la aplicación a " + usuario + ": recoge la bicicleta " + bicicleta;
    }
}
