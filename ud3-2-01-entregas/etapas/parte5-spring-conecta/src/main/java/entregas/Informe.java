package entregas;

import org.springframework.stereotype.Component;

@Component
public class Informe {

    // El repositorio donde contar las entregas
    private RepositorioEntregas repositorio;

    // Lo recibe desde fuera
    public Informe(RepositorioEntregas repositorio) {
        this.repositorio = repositorio;
    }

    // Escribe cuántas entregas hay
    public void mostrar() {
        System.out.println("Entregas recibidas: " + repositorio.todas().size());
    }
}
