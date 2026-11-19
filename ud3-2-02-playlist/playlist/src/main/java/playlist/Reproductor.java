package playlist;

import org.springframework.stereotype.Component;

@Component
public class Reproductor {

    private Playlist playlist;

    public Reproductor(Playlist playlist) {
        this.playlist = playlist;
    }

    public void reproducir() {
        int numero = 1;
        for (Cancion cancion : playlist.todas()) {
            System.out.println(numero + ". Reproduciendo: " + cancion.getTitulo() + " - " + cancion.getArtista());
            numero = numero + 1;
        }
    }
}