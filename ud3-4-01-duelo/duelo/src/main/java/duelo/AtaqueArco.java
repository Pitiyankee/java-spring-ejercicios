package duelo;

import org.springframework.stereotype.Component;

@Component
public class AtaqueArco implements Ataque {

    @Override
    public String nombre() {
        return "arco";
    }

    @Override
    public int dano() {
        return 9;
    }
}