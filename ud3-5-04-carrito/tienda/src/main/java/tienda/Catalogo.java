package tienda;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Catalogo {

    private Map<String, Integer> precios = new HashMap<>();
    private int consultas;

    public int precio(String producto) {
        consultas++;
        return precios.get(producto);
    }

    @PostConstruct
    public void cargar() {
        precios.put("cuaderno", 3);
        precios.put("bolígrafo", 1);
        precios.put("mochila", 25);
        precios.put("regla", 2);
        System.out.println("Catálogo cargado: " + precios.size() + " productos");
    }

    @PreDestroy
    public void cerrar() {
        System.out.println("Catálogo cerrado: " + consultas + " consultas");
    }
}