public class Iphone extends Electronico{
    //Atributos
    private String color;
    private String modelo;
    //Constructor
    public Iphone(int precio, String fabricante, String color, String modelo) {
        super(precio, fabricante);
        this.color = color;
        this.modelo = modelo;
    }
    //getters
    public String getColor() {
        return color;
    }
    public String getModelo() {
        return modelo;
    }
    //metodos de la interface
    @Override
    public double getPrecioVenta() {
        return getPrecio();
    }
}
