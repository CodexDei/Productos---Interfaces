abstract public class Producto implements IProducto{

    //Atributos de la clase
    private int precio;
    //Constructor
    public Producto(int precio){
        this.precio = precio;
    }
    //getter
    public int getPrecio() {
        return precio;
    }
}
