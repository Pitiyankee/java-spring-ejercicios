package playlist;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Aplicacion {

    public static void main(String[] args) {
        // Arrancamos el contenedor: busca las clases con @Component
        AnnotationConfigApplicationContext contexto =
                new AnnotationConfigApplicationContext("playlist");

        // Pedimos la playlist al contenedor y le añadimos las canciones
        Playlist playlist = contexto.getBean(Playlist.class);
        playlist.agregar(new Cancion("You Need to Calm Down", "Taylor Swift", 171));
        playlist.agregar(new Cancion("Formation", "Beyoncé", 206));
        playlist.agregar(new Cancion("Bigger Than Us", "Josh Groban", 240));

        // Pedimos las dos piezas que usan la misma playlist
        Reproductor reproductor = contexto.getBean(Reproductor.class);
        DuracionTotal duracion = contexto.getBean(DuracionTotal.class);

        reproductor.reproducir();
        duracion.mostrar();

        // Cerramos el contenedor
        contexto.close();
    }
}