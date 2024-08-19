package edu.uca;

import org.testng.ITest;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private final List<Producto> inventario = new ArrayList<>();

    public int getSize(){
        return inventario.size();
    }

    public void agregarProducto(Producto producto) {
    }

    public void mostrarInventario() {
        System.out.println("Inventario: ");
        for (Producto producto : inventario) {
            System.out.println(producto);
        }
    }

}
