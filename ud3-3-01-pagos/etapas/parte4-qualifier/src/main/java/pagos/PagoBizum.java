package pagos;

import org.springframework.stereotype.Component;

@Component
public class PagoBizum implements MetodoPago {

    // Paga con Bizum
    @Override
    public void pagar(int euros) {
        System.out.println("Pagado con Bizum: " + euros + " €");
    }
}