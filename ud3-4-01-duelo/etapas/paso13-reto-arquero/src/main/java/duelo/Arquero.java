package duelo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Arquero {

    // El ataque que usa
    private Ataque ataque;

    // Lo recibe desde fuera: pide el arco, no la opción habitual
    public Arquero(@Qualifier("ataqueArco") Ataque ataque) {
        this.ataque = ataque;
    }

    // Ataca y devuelve el daño
    public int atacar() {
        System.out.println("Arquero ataca con " + ataque.nombre() + ": " + ataque.dano() + " de daño");
        return ataque.dano();
    }
}