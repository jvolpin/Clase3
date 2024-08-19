package edu.uca;

public class Ropa extends Producto {
    private String talla;
    private String color;
    private String tela;

    public Ropa(int id, String nombre, double precio, String talla, String color, String tela) {
        super(id, nombre, precio);
        this.talla = talla;
        this.color = color;
        this.tela = tela;
    }

    public String getTalla() { return talla; }
    public String getColor() { return color; }
    public String getTela() { return tela; }


    @Override
    public String toString() {
        return "Ropa{id=" + getId() + ", nombre='" + getNombre() + "', precio=" + getPrecio() + ", talla='" + talla + "', color='" + color +  "', tela='" + tela + "'}";
    }
}


