package pagos;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Aplicacion {

    public static void main(String[] args) {
        // Arrancamos el contenedor: busca las clases con @Component
        AnnotationConfigApplicationContext contexto =
                new AnnotationConfigApplicationContext("pagos");

        // La tienda web hace un pedido
        TiendaWeb tiendaWeb = contexto.getBean(TiendaWeb.class);
        tiendaWeb.comprar(25);

        // Cerramos el contenedor
        contexto.close();
    }
}