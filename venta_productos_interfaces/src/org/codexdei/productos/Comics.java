package org.codexdei.productos;

import java.util.Date;

public class Comics extends Libro{
    //Atributo
    private String personaje;

    //Constructor
    public Comics(String nombreProducto,String titulo,int precio, Date fechaDePublicacion, String autor,
                  String editorial) {

        super(nombreProducto,titulo, precio, fechaDePublicacion, autor, editorial);
    }
    //getter
    public String getPersonaje(){
        return personaje;
    }
    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta();
    }
}
