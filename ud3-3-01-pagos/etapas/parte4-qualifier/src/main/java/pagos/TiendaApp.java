package pagos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TiendaApp {

    // El método de pago que usa
    private MetodoPago pago;

    // Lo recibe desde fuera
    public TiendaApp(@Qualifier("pagoBizum") MetodoPago pago) {
        this.pago = pago;
    }

    // Registra el pedido y lo cobra
    public void comprar(int euros) {
        System.out.println("Tienda app: pedido de " + euros + " €");
        pago.pagar(euros);
    }
}