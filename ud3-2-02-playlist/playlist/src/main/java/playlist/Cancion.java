package playlist;

public class Cancion {

    private String titulo;
    private String artista;
    private int segundos;

    public Cancion(String titulo, String artista, int segundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.segundos = segundos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
}