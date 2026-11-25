package entregas;

public class Aplicacion {

    public static void main(String[] args) {
        // Creamos las dos piezas de la aplicación
        ServicioEntregas servicio = new ServicioEntregas();
        Informe informe = new Informe();

        // Llegan dos entregas
        servicio.registrar("Ana", "Tarea 1");
        servicio.registrar("Luis", "Tarea 1");

        // Mostramos el informe
        informe.mostrar();
    }
}
