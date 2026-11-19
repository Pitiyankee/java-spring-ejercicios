package cafeteria;

public class Barista {

    // La máquina con la que trabaja
    private MaquinaCafe maquina;

    // La recibe desde fuera
    public Barista(MaquinaCafe maquina) {
        this.maquina = maquina;
    }

    // Pide la bebida a la máquina y la sirve
    public void servir(String pedido) {
        String bebida = maquina.preparar(pedido);
        System.out.println("Barista sirve: " + bebida);
    }
}
