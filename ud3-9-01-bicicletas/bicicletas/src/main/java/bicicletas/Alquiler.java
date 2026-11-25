package bicicletas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Cada vez que se pide uno, Spring crea un objeto nuevo
@Component
@Scope("prototype")
public class Alquiler {

    private int tarifa;
    private String usuario;
    private String bicicleta;
    private int horas;

    public Alquiler(@Value("${bicicletas.tarifa}") int tarifa) {
        this.tarifa = tarifa;
    }

    public void abrir(String usuario, String bicicleta, int horas) {
        this.usuario = usuario;
        this.bicicleta = bicicleta;
        this.horas = horas;
    }

    public int importe() {
        return horas * tarifa;
    }

    public String resumen() {
        return usuario + ": bicicleta " + bicicleta + ", " + horas + " horas, " + importe() + " €";
    }
}
