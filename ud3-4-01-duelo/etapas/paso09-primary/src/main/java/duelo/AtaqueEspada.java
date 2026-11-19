package duelo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AtaqueEspada implements Ataque {

    @Override
    public String nombre() {
        return "espada";
    }

    @Override
    public int dano() {
        return 12;
    }
}