package entregas;

public class Informe {

    // El repositorio donde contar las entregas, creado aquí con new
    private RepositorioEntregas repositorio = new RepositorioEntregas();

    // Escribe cuántas entregas hay
    public void mostrar() {
        System.out.println("Entregas recibidas: " + repositorio.todas().size());
    }
}
