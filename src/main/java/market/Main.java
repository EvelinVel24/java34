package market;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mercado mercado = new Mercado();

        // El Scanner será cerrado automáticamente al finalizar el bloque try
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Introduzca el nombre de su producto:");
            String nombre = scanner.nextLine();

            System.out.println("Introduzca el ID de su producto:");
            int idProducto = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            System.out.println("¿Cuál es la condición de su producto?");
            String condicion = scanner.nextLine();

            System.out.println("¿Cuál es el precio de su producto?");
            String precio = scanner.nextLine();

            Producto producto = Producto.crearAviso(nombre, idProducto, condicion, precio);
            mercado.publicarAviso(producto);
            mercado.verTodoAviso();
        }
    }
}

