package bicicletas;

import org.springframework.stereotype.Component;

@Component
public class AvisoSms implements Aviso {

    @Override
    public String avisar(String usuario, String bicicleta) {
        return "SMS a " + usuario + ": recoge la bicicleta " + bicicleta;
    }
}
