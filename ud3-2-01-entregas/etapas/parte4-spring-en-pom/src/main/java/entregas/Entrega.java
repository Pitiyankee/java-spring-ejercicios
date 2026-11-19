package entregas;

public class Entrega {

    // Quién entrega y qué entrega
    private String alumno;
    private String tarea;

    // Recibe los datos al crear la entrega
    public Entrega(String alumno, String tarea) {
        this.alumno = alumno;
        this.tarea = tarea;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }
}
