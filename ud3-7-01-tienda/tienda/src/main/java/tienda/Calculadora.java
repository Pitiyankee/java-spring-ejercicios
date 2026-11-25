package tienda;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Calculadora {

    // El tipo de IVA, en porcentaje
    private int iva;
    private String nombre;

    // Spring le entrega los valores de tienda.iva y tienda.nombre, tomados del fichero
    public Calculadora(@Value("${tienda.iva}") int iva, @Value("${tienda.nombre:Mi tienda}") String nombre) {
        this.iva = iva;
        this.nombre = nombre;
    }

    // Devuelve el precio con el IVA incluido
    public double conIva(double precio) {
        return precio * (100 + iva) / 100;
    }

    public String getNombre() {
        return nombre;
    }
}
