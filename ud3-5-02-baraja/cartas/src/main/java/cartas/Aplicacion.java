package cartas;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Aplicacion {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext("cartas");

        Baraja baraja1 = contexto.getBean(Baraja.class);
        Baraja baraja2 = contexto.getBean(Baraja.class);
        System.out.println("¿Es la misma baraja? " + (baraja1 == baraja2));

        Mano mano1 = contexto.getBean(Mano.class);
        Mano mano2 = contexto.getBean(Mano.class);
        System.out.println("Jugador 1: " + mano1.getCartas());
        System.out.println("Jugador 2: " + mano2.getCartas());
        System.out.println("¿Es la misma mano? " + (mano1 == mano2));
        System.out.println("Quedan " + baraja1.quedan() + " cartas en la baraja");

        contexto.close();
    }
}