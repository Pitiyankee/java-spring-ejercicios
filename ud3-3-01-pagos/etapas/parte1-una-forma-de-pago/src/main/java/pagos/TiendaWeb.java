package pagos;

import org.springframework.stereotype.Component;

@Component
public class TiendaWeb {

    // El método de pago que usa
    private MetodoPago pago;

    // Lo recibe desde fuera
    public TiendaWeb(MetodoPago pago) {
        this.pago = pago;
    }

    // Registra el pedido y lo cobra
    public void comprar(int euros) {
        System.out.println("Tienda web: pedido de " + euros + " €");
        pago.pagar(euros);
    }
}