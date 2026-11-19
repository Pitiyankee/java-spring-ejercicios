package cartas;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")
public class Mano {

    private List<String> cartas;

    public Mano(Baraja baraja) {
        this.cartas = baraja.repartir(3);
    }

    public List<String> getCartas() {
        return cartas;
    }
}