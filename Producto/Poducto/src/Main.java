import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>();
        int idContador = 1;

        System.out.println("=== Registro de Productos ===");

        while (true) {
            System.out.print("Nombre del producto: ");
            String nombre = sc.nextLine();

            System.out.print("Marca del producto: ");
            String marca = sc.nextLine();

            System.out.print("Precio del producto: ");
            double precio = Double.parseDouble(sc.nextLine());

            Producto producto = new Producto(idContador, nombre, marca, precio);
            productos.add(producto);
            idContador++;

            System.out.print("¿Deseas registrar otro producto? (s/n): ");
            String opcion = sc.nextLine();
            if (opcion.equalsIgnoreCase("n")) {
                break;
            }
        }

        // Mostrar productos registrados con Iterator
        System.out.println("\n=== Productos Registrados ===");
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        sc.close();
    }
}
