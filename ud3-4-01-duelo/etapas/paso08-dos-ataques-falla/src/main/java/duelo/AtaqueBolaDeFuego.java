package duelo;

import org.springframework.stereotype.Component;

@Component
public class AtaqueBolaDeFuego implements Ataque {

    @Override
    public String nombre() {
        return "bola de fuego";
    }

    @Override
    public int dano() {
        return 20;
    }
}