package edu.uca;

import edu.uca.Productos.Electrodomesticos;
import edu.uca.Productos.Ropa;
import edu.uca.Productos.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tienda {
    private List<Producto> inventario = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public int getSize() {
        return inventario.size();
    }

    public void agregarProducto(Producto producto) {
        inventario.add(producto);
    }

    public void mostrarInventario() {
        System.out.println("Inventario: ");
        for (Producto producto : inventario) {
            System.out.println(producto);
        }
    }

    public void agregarProductoDesdeEntrada() {
        System.out.println("Seleccione el tipo de producto a agregar:");
        System.out.println("1. Electrodoméstico");
        System.out.println("2. Ropa");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el ID del producto: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume el newline restante

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese la garantia del electrodoméstico (en meses): ");
                int garantia = scanner.nextInt();
                scanner.nextLine();
                Producto Electrodomesticos = new Electrodomesticos(garantia, (double) precio, id, nombre);
                agregarProducto(Electrodomesticos);
                break;

            case 2:
                System.out.print("Ingrese la talla de la ropa: ");
                String talla = scanner.nextLine();
                System.out.print("Ingrese la marca de la ropa: ");
                String Marca = scanner.nextLine();
                Producto Ropa = new Ropa(id, nombre, (int) precio, Marca, talla);
                agregarProducto(Ropa);
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume el newline restante

            switch (opcion) {
                case 1:
                    tienda.agregarProductoDesdeEntrada();
                    break;
                case 2:
                    tienda.mostrarInventario();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}