package edu.uca;

import picocli.CommandLine;

import java.util.Scanner;

@CommandLine.Command(name = "tienda", mixinStandardHelpOptions = true, version = "1.0",
        description = "sistema de manejo interactivo del stock de la tienda")
public class Main implements Runnable {
    private Tienda tienda = new Tienda();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new CommandLine(new Main()).execute(args);
    }

    @Override
    public void run() {
        System.out.println("Bienvendo al sistema de manejo interactivo del stock de la tienda");
        while (true) {
            System.out.println("\nElija una opción:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Salir");
            System.out.print("> ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    tienda.mostrarInventario();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }
        }
    }

    private void agregarProducto() {
        System.out.print("\nIngrese el ID del producto: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese el nombre del producto: ");
        String name = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double price = Double.parseDouble(scanner.nextLine());

        Producto producto = new Producto(id, name, price);
        tienda.agregarProducto(producto);
    }


}