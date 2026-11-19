package tienda;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Carrito {

    private Catalogo catalogo;
    private List<String> productos = new ArrayList<>();

    public Carrito(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public void anadir(String producto) {
        productos.add(producto);
    }

    public int total() {
        int suma = 0;
        for (String producto : productos) {
            suma += catalogo.precio(producto);
        }
        return suma;
    }

    public List<String> getProductos() {
        return productos;
    }
}