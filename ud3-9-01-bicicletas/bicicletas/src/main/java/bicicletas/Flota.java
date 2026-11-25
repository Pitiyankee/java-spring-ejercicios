package bicicletas;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Flota {

    private List<String> libres = new ArrayList<>();

    // Se ejecuta al arrancar: llena la flota y la anuncia
    @PostConstruct
    public void cargar() {
        libres.add("B-01");
        libres.add("B-02");
        libres.add("B-03");
        libres.add("B-04");
        System.out.println("Bicicletas disponibles: " + libres.size());
    }

    public int libres() {
        return libres.size();
    }

    // Saca de la flota la bicicleta de esa posición y la devuelve
    public String sacar(int posicion) {
        return libres.remove(posicion);
    }
}
