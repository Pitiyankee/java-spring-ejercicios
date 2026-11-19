package entregas;

public class Aplicacion {

    public static void main(String[] args) {
        // Creamos las herramientas una sola vez
        RepositorioEntregas repositorio = new RepositorioEntregas();
        Avisador avisador = new Avisador();

        // Se las damos a quien las necesita
        ServicioEntregas servicio = new ServicioEntregas(repositorio, avisador);
        Informe informe = new Informe(repositorio);

        // Llegan dos entregas
        servicio.registrar("Ana", "Práctica 1");
        servicio.registrar("Luis", "Práctica 1");

        // Mostramos el informe
        informe.mostrar();
    }
}
