package oficina;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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

    // Carga inicial: se ejecuta una vez, justo después de crear el objeto
    @PostConstruct
    public void abrir() {
        ultimo = 100;
        System.out.println("Dispensador abierto: los turnos empiezan en el " + (ultimo + 1));
    }

    // Se ejecuta una vez, justo antes de cerrar el contexto
    @PreDestroy
    public void cerrar() {
        System.out.println("Dispensador cerrado: último turno entregado, el " + ultimo);
    }
}
