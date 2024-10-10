package market;

public class Producto {
    private String nombre;
    private int idProducto;
    private String condicion;
    private String precio;

    // Constructor
    public Producto(String nombre, int idProducto, String condicion, String precio) {
        this.nombre = nombre;
        this.idProducto = idProducto;
        this.condicion = condicion;
        this.precio = precio;
    }

    // Método para crear un aviso
    public static Producto crearAviso(String nombre, int idProducto, String condicion, String precio) {
        return new Producto(nombre, idProducto, condicion, precio);
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", idProducto=" + idProducto + ", condición=" + condicion + ", precio=" + precio + "]";
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getCondicion() {
        return condicion;
    }

    public String getPrecio() {
        return precio;
    }
}

