package tienda;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Calculadora {

    // El tipo de IVA, en porcentaje
    private int iva;

    // Spring le entrega el valor de tienda.iva, tomado del fichero
    public Calculadora(@Value("${tienda.iva}") int iva) {
        this.iva = iva;
    }

    // Devuelve el precio con el IVA incluido
    public double conIva(double precio) {
        return precio * (100 + iva) / 100;
    }
}
