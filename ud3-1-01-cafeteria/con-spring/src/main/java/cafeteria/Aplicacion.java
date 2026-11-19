package cafeteria;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Aplicacion {

    public static void main(String[] args) {
        // Arrancamos el contenedor: busca las clases con @Component
        AnnotationConfigApplicationContext contexto =
                new AnnotationConfigApplicationContext("cafeteria");

        // Le pedimos el barista ya montado
        Barista barista = contexto.getBean(Barista.class);

        // Llegan dos pedidos
        barista.servir("Cortado");
        barista.servir("Café con leche");

        // Cerramos el contenedor
        contexto.close();
    }
}
