package entregas;

import org.springframework.stereotype.Component;

@Component
public class ListadoEntregas {

    // El repositorio de donde leer las entregas
    private RepositorioEntregas repositorio;

    // Lo recibe desde fuera
    public ListadoEntregas(RepositorioEntregas repositorio) {
        this.repositorio = repositorio;
    }

    // Escribe una línea por entrega
    public void mostrar() {
        System.out.println("Listado de entregas:");
        for (Entrega entrega : repositorio.todas()) {
            System.out.println("- " + entrega.getAlumno() + ": " + entrega.getTarea());
        }
    }
}
