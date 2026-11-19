package entregas;

import org.springframework.stereotype.Component;

@Component
public class ServicioEntregas {

    // Las herramientas que necesita
    private RepositorioEntregas repositorio;
    private Avisador avisador;

    // Las recibe desde fuera
    public ServicioEntregas(RepositorioEntregas repositorio, Avisador avisador) {
        this.repositorio = repositorio;
        this.avisador = avisador;
    }

    // Crea la entrega, la guarda y avisa
    public void registrar(String alumno, String tarea) {
        Entrega entrega = new Entrega(alumno, tarea);
        repositorio.guardar(entrega);
        avisador.avisar(entrega);
    }
}
