package entregas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class RepositorioEntregas {

    // Aquí se guardan las entregas
    private List<Entrega> entregas = new ArrayList<>();

    // Añade una entrega a la lista
    public void guardar(Entrega entrega) {
        entregas.add(entrega);
    }

    // Devuelve todas las entregas guardadas
    public List<Entrega> todas() {
        return entregas;
    }
}
