package cartas;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Component
public class Baraja {

    private List<String> cartas = new ArrayList<>();

    public List<String> repartir(int cuantas) {
        List<String> reparto = new ArrayList<>();
        for (int i = 0; i < cuantas; i++) {
            reparto.add(cartas.remove(0));
        }
        return reparto;
    }

    public int quedan() {
        return cartas.size();
    }

    @PostConstruct
    public void preparar() {
        String[] palos = {"oros", "copas", "espadas", "bastos"};
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
        for (String palo : palos) {
            for (int numero : numeros) {
                cartas.add(numero + " de " + palo);
            }
        }
        Collections.shuffle(cartas, new Random(7));
        System.out.println("Baraja preparada: " + cartas.size() + " cartas");
    }

    @PreDestroy
    public void recoger() {
        System.out.println("Baraja recogida: quedan " + cartas.size() + " cartas");
    }
}