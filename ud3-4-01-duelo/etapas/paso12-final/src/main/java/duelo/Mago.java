package duelo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mago {

    // El ataque que usa
    private Ataque ataque;

    // Lo recibe desde fuera: pide la bola de fuego, no la opción habitual
    public Mago(@Qualifier("ataqueBolaDeFuego") Ataque ataque) {
        this.ataque = ataque;
    }

    // Ataca y devuelve el daño
    public int atacar() {
        System.out.println("Mago ataca con " + ataque.nombre() + ": " + ataque.dano() + " de daño");
        return ataque.dano();
    }
}