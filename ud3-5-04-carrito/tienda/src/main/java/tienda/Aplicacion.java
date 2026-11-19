package tienda;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Aplicacion {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext("tienda");

        Catalogo catalogo1 = contexto.getBean(Catalogo.class);
        Catalogo catalogo2 = contexto.getBean(Catalogo.class);
        System.out.println("¿Es el mismo catálogo? " + (catalogo1 == catalogo2));

        Carrito ana = contexto.getBean(Carrito.class);
        ana.anadir("cuaderno");
        ana.anadir("bolígrafo");
        ana.anadir("mochila");

        Carrito luis = contexto.getBean(Carrito.class);
        luis.anadir("regla");

        System.out.println("Carrito de Ana: " + ana.getProductos() + " - total " + ana.total() + " €");
        System.out.println("Carrito de Luis: " + luis.getProductos() + " - total " + luis.total() + " €");
        System.out.println("¿Es el mismo carrito? " + (ana == luis));

        contexto.close();
    }
}