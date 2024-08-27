package org.codexdei.productos;

import org.codexdei.interfaces.IProducto;

abstract public class Producto implements IProducto {

    //Atributos de la clase
    private String nombreProducto;
    private int precio;
    //Constructor
    public Producto(String modelo, int precio){
        this.nombreProducto = modelo;
        this.precio = precio;
    }
    //getter
    public String getNombreProducto() {
        return nombreProducto;
    }

    //getter heredado de la interface IProducto
    @Override
    public int getPrecio() {
        return getPrecio();
    }
    //toString
    @Override
    public String toString() {
        return  "Nombre_Producto=" + nombreProducto + "\n" +
                "Precio=" + precio + "\n";
    }
}
