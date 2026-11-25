package tienda;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {

    // El tipo de IVA, en porcentaje
    private int iva = 21;

    // Devuelve el precio con el IVA incluido
    public double conIva(double precio) {
        return precio * (100 + iva) / 100;
    }
}
