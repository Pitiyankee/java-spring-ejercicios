package cafeteria;

import org.springframework.stereotype.Component;

@Component
public class MaquinaCafe {

    // Prepara la bebida que le piden y la devuelve
    public String preparar(String pedido) {
        return pedido + " recién hecho";
    }
}
