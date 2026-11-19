package entregas;

public class ServicioEntregas {

    // Las herramientas que necesita, creadas aquí con new
    private RepositorioEntregas repositorio = new RepositorioEntregas();
    private Avisador avisador = new Avisador();

    // Crea la entrega, la guarda y avisa
    public void registrar(String alumno, String tarea) {
        Entrega entrega = new Entrega(alumno, tarea);
        repositorio.guardar(entrega);
        avisador.avisar(entrega);
    }
}
