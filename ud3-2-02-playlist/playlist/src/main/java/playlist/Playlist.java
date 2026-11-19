package playlist;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Playlist {

    private List<Cancion> canciones = new ArrayList<>();

    public void agregar(Cancion cancion) {
        canciones.add(cancion);
    }

    public List<Cancion> todas() {
        return canciones;
    }
}