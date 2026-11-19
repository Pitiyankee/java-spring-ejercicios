package oficina;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Aplicacion {

    public static void main(String[] args) {
        // Arrancamos el contenedor
        AnnotationConfigApplicationContext contexto =
                new AnnotationConfigApplicationContext("oficina");

        // Pedimos el dispensador dos veces
        Dispensador uno = contexto.getBean(Dispensador.class);
        Dispensador otro = contexto.getBean(Dispensador.class);
        System.out.println("¿Es el mismo dispensador? " + (uno == otro));

        // Dos clientes piden su turno
        Turno primero = contexto.getBean(Turno.class);
        Turno segundo = contexto.getBean(Turno.class);
        System.out.println("Primer cliente: turno " + primero.getNumero());
        System.out.println("Segundo cliente: turno " + segundo.getNumero());
        System.out.println("¿Es el mismo turno? " + (primero == segundo));

        // Cerramos el contenedor
        contexto.close();
    }
}
