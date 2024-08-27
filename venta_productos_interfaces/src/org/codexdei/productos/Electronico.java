package org.codexdei.productos;

import org.codexdei.interfaces.IElectronico;

abstract public class Electronico extends Producto implements IElectronico {

    //Atributos
    private String modelo;
    private String fabricante;

    //Constructor
    public Electronico(String modelo, int precio, String fabricante){
        super(modelo, precio);
        this.fabricante = fabricante;
    }
    public String getFabricante() {
        return this.fabricante;
    }
}
