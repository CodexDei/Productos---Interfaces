package org.codexdei.productos;

public class TvLcd extends Electronico{
    //Atributos
    private int pulgada;
    //Constructor
    public TvLcd(String nombreProducto, int precio, String fabricante, int pulgada){

        super(nombreProducto,precio, fabricante);
        this.pulgada = pulgada;
    }
    //getter
    public int getPulgada(){
        return pulgada;
    }
    //Metodo de la interface, el cual hereda Electronico
    @Override
    public double getPrecioVenta() {
        return getPrecio();
    }
    //toString

    @Override
    public String toString() {
        return super.toString() +
                "Pulgada=" + pulgada + "\n";
    }
}
