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

        // Cerramos el contenedor
        contexto.close();
    }
}
