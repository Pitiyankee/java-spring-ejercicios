package pagos;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PagoTarjeta implements MetodoPago {

    // Paga con tarjeta
    @Override
    public void pagar(int euros) {
        System.out.println("Pagado con tarjeta: " + euros + " €");
    }
}