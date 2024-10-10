package market;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class MercadoTest {
    private Mercado mercado;

    @BeforeEach
    void setUp() {
        mercado = new Mercado();
    }

    @Test
    void testPublicarAviso() {
        Producto producto = new Producto("Computadora X", 111, "Nuevo", "$500.000");
        List<Producto> productos = mercado.publicarAviso(producto);
        assertNotNull(productos, "La lista de productos no debería ser nula");
        assertEquals(1, productos.size(), "La lista de productos debería contener un elemento");
        assertEquals(producto, productos.get(0), "El producto publicado no coincide");
    }
}

