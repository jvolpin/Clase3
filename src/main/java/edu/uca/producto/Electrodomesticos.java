package edu.uca.producto;
public class Electrodomesticos extends ProductoBase {

    private int garantía;

    public Electrodomesticos(int id, String nombre, double precio, int garantía) {
        super(id, nombre, precio);
        this.garantía = garantía;
    }

    public String toString() {
        return super.toString() + *
    }
}
