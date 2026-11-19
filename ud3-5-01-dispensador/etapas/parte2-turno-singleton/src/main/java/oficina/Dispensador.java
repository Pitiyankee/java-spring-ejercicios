package oficina;

import org.springframework.stereotype.Component;

@Component
public class Dispensador {

    // Último turno entregado
    private int ultimo;

    // Entrega el siguiente turno
    public int siguiente() {
        ultimo++;
        return ultimo;
    }
}
