package duelo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Aplicacion {

    public static void main(String[] args) {
        // Arrancamos el contenedor: busca las clases con @Component
        AnnotationConfigApplicationContext contexto =
                new AnnotationConfigApplicationContext("duelo");

        // Pedimos el guerrero y lo hacemos atacar
        Guerrero guerrero = contexto.getBean(Guerrero.class);
        guerrero.atacar();

        // Cerramos el contenedor
        contexto.close();
    }
}