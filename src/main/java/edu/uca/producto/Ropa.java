package edu.uca.producto;

public class Ropa extends ProductoBase{
    private String talle;
    private String marca;
    public Ropa(int id, String nombre, double precio, String talle, String marca) {
        super(id, nombre, precio);
        this.talle = talle;
        this.marca = marca;
    }

}
