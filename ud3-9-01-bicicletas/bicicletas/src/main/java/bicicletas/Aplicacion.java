package bicicletas;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Aplicacion {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);

        Estacion estacion = contexto.getBean(Estacion.class);
        System.out.println("Estación: " + estacion.getNombre());

        Alquiler primero = contexto.getBean(Alquiler.class);
        Alquiler segundo = contexto.getBean(Alquiler.class);
        estacion.alquilar(primero, "Ana", 3);
        estacion.alquilarSinApp(segundo, "Luis", 2);

        System.out.println("Comprobamos el primer alquiler: " + primero.resumen());

        contexto.close();
    }
}
