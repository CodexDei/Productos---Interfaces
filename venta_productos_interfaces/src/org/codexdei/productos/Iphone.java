package org.codexdei.productos;

public class Iphone extends Electronico {
    //Atributos
    private String color;
    //Constructor
    public Iphone(String modelo, int precio, String fabricante, String color) {
        super(modelo, precio, fabricante);
        this.color = color;
    }
    //getters
    public String getColor() {
        return color;
    }
    //metodos de la interface
    @Override
    public double getPrecioVenta() {
        return getPrecio();
    }
    //toString

    @Override
    public String toString() {
        return  super.toString() +
                "Color=" + color + '\n';
    }
}
