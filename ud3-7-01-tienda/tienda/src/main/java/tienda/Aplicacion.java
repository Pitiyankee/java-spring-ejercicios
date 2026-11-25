package tienda;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Aplicacion {

    public static void main(String[] args) {
        // Arrancamos el contenedor
        AnnotationConfigApplicationContext contexto =
                new AnnotationConfigApplicationContext("tienda");

        // Pedimos la calculadora y calculamos un precio
        Calculadora calculadora = contexto.getBean(Calculadora.class);
        System.out.println("Tienda: " + calculadora.getNombre());
        double precio = 100;
        System.out.println("Precio sin IVA: " + precio + " €");
        System.out.println("Precio con IVA: " + calculadora.conIva(precio) + " €");

        // Cerramos el contenedor
        contexto.close();
    }
}
