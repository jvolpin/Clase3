package edu.uca.Productos;

public class Electrodomesticos extends Producto {
    private int garantia;


    public Electrodomesticos(int garantia, double precio, int id, String nombre) {
        super(id, nombre, precio);
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }
    public String toString() {
        return super.toString() + " garantia: " + garantia;
    }
}

