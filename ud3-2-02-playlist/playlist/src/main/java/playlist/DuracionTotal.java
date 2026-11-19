package playlist;

import org.springframework.stereotype.Component;

@Component
public class DuracionTotal {

    private Playlist playlist;

    public DuracionTotal(Playlist playlist) {
        this.playlist = playlist;
    }

    public void mostrar() {
        int total = 0;
        for (Cancion cancion : playlist.todas()) {
            total = total + cancion.getSegundos();
        }
        int minutos = total / 60;
        int segundos = total % 60;
        System.out.println("Duración total: " + minutos + " minutos y " + segundos + " segundos");
    }
}