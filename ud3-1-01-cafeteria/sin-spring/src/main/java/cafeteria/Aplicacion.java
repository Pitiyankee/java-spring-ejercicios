package cafeteria;

public class Aplicacion {

    public static void main(String[] args) {
        // Montamos las piezas a mano
        MaquinaCafe maquina = new MaquinaCafe();
        Barista barista = new Barista(maquina);

        // Llegan dos pedidos
        barista.servir("Cortado");
        barista.servir("Café con leche");
    }
}
