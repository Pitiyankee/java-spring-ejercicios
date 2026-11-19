package entregas;

public class Avisador {

    // Escribe el aviso en la consola
    public void avisar(Entrega entrega) {
        System.out.println("Aviso para el responsable: " + entrega.getAlumno()
                + " ha entregado " + entrega.getTarea());
    }
}
