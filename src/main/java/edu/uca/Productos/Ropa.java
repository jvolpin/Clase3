package edu.uca.Productos;

public class Ropa extends Producto {
    private String Talle;
    private String Marca;

    public Ropa(int id, String nombre, int precio, String Talle, String Marca) {
        super(id, nombre, precio);
        this.Talle = Talle;
        this.Marca = Marca;

    }
    public String getTalle() {
        return Talle;
    }

    public String getColor() {
        return Marca;
    }

    @Override
    public String toString() {
        return super.toString() + ", talla=" + Talle + ", color=" + Marca + "}";
    }
}
