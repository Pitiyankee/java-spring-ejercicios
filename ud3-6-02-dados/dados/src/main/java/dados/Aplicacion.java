package dados;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Aplicacion {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext("dados");

        Dado dado = contexto.getBean(Dado.class);
        int ana = dado.tirar() + dado.tirar();
        int luis = dado.tirar() + dado.tirar();

        System.out.println("Ana saca " + ana);
        System.out.println("Luis saca " + luis);
        if (ana > luis) {
            System.out.println("Gana Ana");
        } else if (luis > ana) {
            System.out.println("Gana Luis");
        } else {
            System.out.println("Empate");
        }

        contexto.close();
    }
}