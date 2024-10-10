package market;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    @Test
    void testCrearAviso() {
        Producto producto = Producto.crearAviso("Computadora X", 111, "Nuevo", "$500.000");
        assertNotNull(producto, "El producto no debería ser nulo");
        assertEquals("Computadora X", producto.getNombre(), "El nombre del producto no coincide");
        assertEquals(111, producto.getIdProducto(), "El ID del producto no coincide");
        assertEquals("Nuevo", producto.getCondicion(), "La condición del producto no coincide");
        assertEquals("$500.000", producto.getPrecio(), "El precio del producto no coincide");
    }
}
