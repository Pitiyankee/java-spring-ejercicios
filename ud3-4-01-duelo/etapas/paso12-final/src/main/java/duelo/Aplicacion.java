package duelo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Aplicacion {

    public static void main(String[] args) {
        // Arrancamos el contenedor: busca las clases con @Component
        AnnotationConfigApplicationContext contexto =
                new AnnotationConfigApplicationContext("duelo");

        // Pedimos los dos personajes
        Guerrero guerrero = contexto.getBean(Guerrero.class);
        Mago mago = contexto.getBean(Mago.class);

        // Cada uno ataca en su turno y sumamos el daño
        int total = guerrero.atacar() + mago.atacar();
        System.out.println("Daño total del turno: " + total);

        // Cerramos el contenedor
        contexto.close();
    }
}