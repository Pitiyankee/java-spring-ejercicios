package pagos;

import org.springframework.stereotype.Component;

@Component
public class PagoTarjeta implements MetodoPago {

    // Paga con tarjeta
    @Override
    public void pagar(int euros) {
        System.out.println("Pagado con tarjeta: " + euros + " €");
    }
}