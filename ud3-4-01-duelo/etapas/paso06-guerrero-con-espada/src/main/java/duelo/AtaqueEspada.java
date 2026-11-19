package duelo;

import org.springframework.stereotype.Component;

@Component
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