package edu.uca.Productos;

public class Electrodomesticos extends Producto {
    private String garantia;

    public Electrodomesticos(int cantidad, String garantia, int precio, int id, String nombre) {
        super(id, nombre, precio);
        this.garantia = garantia;
    }

    public String getGarantia() {
        return garantia;
    }
    public String toString() {
        return super.toString() + " garantia: " + garantia;
    }
}

