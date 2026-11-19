package duelo;

import org.springframework.stereotype.Component;

@Component
public class Guerrero {

    // El ataque que usa
    private Ataque ataque;

    // Lo recibe desde fuera
    public Guerrero(Ataque ataque) {
        this.ataque = ataque;
    }

    // Ataca y devuelve el daño
    public int atacar() {
        System.out.println("Guerrero ataca con " + ataque.nombre() + ": " + ataque.dano() + " de daño");
        return ataque.dano();
    }
}