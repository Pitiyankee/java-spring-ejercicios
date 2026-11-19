package oficina;

import org.springframework.stereotype.Component;

@Component
public class Turno {

    // Número de este turno
    private int numero;

    // Al crearse, pide su número al dispensador
    public Turno(Dispensador dispensador) {
        this.numero = dispensador.siguiente();
    }

    public int getNumero() {
        return numero;
    }
}
