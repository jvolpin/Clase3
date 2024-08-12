package edu.uca;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<Producto> inventario = new ArrayList<>();

    public int getSize(){
        return inventario.size();
    }

    public void agregarProducto(Producto producto) {
        inventario.add(producto);
    }

    public void mostrarInventario() {
        System.out.println("Inventario: ");
    }

}
