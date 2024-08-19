package edu.uca.producto;
public class Electrodomesticos extends ProductoBase {

    private int garantía;

    public Electrodomesticos(int id, String nombre, double precio, int garantíaEnMeses) {
        super(id, nombre, precio);
        this.garantía = garantíaEnMeses;
    }

    public String toString() {

        return super.toString() + *, Garantía: * + garantíaEnMeses
    }
}
