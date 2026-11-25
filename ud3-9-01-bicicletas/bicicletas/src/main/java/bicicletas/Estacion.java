package bicicletas;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Estacion {

    private String nombre;
    private Flota flota;
    private Random random;
    private Aviso avisoApp;
    private Aviso avisoSms;

    // Sin calificador llega el aviso @Primary (la aplicación); el SMS se pide por su nombre
    public Estacion(@Value("${bicicletas.estacion:Estación}") String nombre, Flota flota, Random random,
                    Aviso avisoApp, @Qualifier("avisoSms") Aviso avisoSms) {
        this.nombre = nombre;
        this.flota = flota;
        this.random = random;
        this.avisoApp = avisoApp;
        this.avisoSms = avisoSms;
    }

    public String getNombre() {
        return nombre;
    }

    // Alquila avisando por la aplicación
    public void alquilar(Alquiler alquiler, String usuario, int horas) {
        String bicicleta = abrir(alquiler, usuario, horas);
        System.out.println(avisoApp.avisar(usuario, bicicleta));
    }

    // Alquila avisando por SMS
    public void alquilarSinApp(Alquiler alquiler, String usuario, int horas) {
        String bicicleta = abrir(alquiler, usuario, horas);
        System.out.println(avisoSms.avisar(usuario, bicicleta));
    }

    private String abrir(Alquiler alquiler, String usuario, int horas) {
        String bicicleta = flota.sacar(random.nextInt(flota.libres()));
        alquiler.abrir(usuario, bicicleta, horas);
        System.out.println(alquiler.resumen());
        return bicicleta;
    }
}
