package market;

import java.util.ArrayList;
import java.util.List;

public class Mercado {
    private List<Producto> productos;

    // Constructor
    public Mercado() {
        this.productos = new ArrayList<>();
    }

    // Método para publicar un aviso
    public List<Producto> publicarAviso(Producto producto) {
        productos.add(producto);
        System.out.println("Su producto ha sido subido al mercado online.");
        return productos;
    }

    // Método para ver todos los avisos
    public void verTodoAviso() {
        System.out.println("Los productos disponibles en el mercado ahora son:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
