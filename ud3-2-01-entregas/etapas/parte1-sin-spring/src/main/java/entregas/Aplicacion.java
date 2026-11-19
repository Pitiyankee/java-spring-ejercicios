package entregas;

public class Aplicacion {

    public static void main(String[] args) {
        // Creamos las dos piezas de la aplicación
        ServicioEntregas servicio = new ServicioEntregas();
        Informe informe = new Informe();

        // Llegan dos entregas
        servicio.registrar("Ana", "Práctica 1");
        servicio.registrar("Luis", "Práctica 1");

        // Mostramos el informe
        informe.mostrar();
    }
}
