package edu.uca.Productos;

public class Ropa extends Producto {
    private String Talle;
    private String Color;

    public Ropa(int id, String nombre, int precio, String Talle, String Color) {
        super(id, nombre, precio);
        this.Talle = Talle;
        this.Color = Color;

    }
    public String getTalle() {
        return Talle;
    }

    public String getColor() {
        return Color;
    }

    @Override
    public String toString() {
        return super.toString() + ", talla=" + Talle + ", color=" + Color + "}";
    }
}
