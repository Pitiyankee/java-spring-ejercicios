package entregas;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Aplicacion {

    public static void main(String[] args) {
        // Arrancamos el contenedor: busca las clases con @Component
        AnnotationConfigApplicationContext contexto =
                new AnnotationConfigApplicationContext("entregas");

        // Le pedimos los objetos ya montados
        ServicioEntregas servicio = contexto.getBean(ServicioEntregas.class);
        Informe informe = contexto.getBean(Informe.class);
        ListadoEntregas listado = contexto.getBean(ListadoEntregas.class);

        // Llegan dos entregas
        servicio.registrar("Ana", "Práctica 1");
        servicio.registrar("Luis", "Práctica 1");

        // Mostramos el informe y el listado
        informe.mostrar();
        listado.mostrar();

        // Cerramos el contenedor
        contexto.close();
    }
}
