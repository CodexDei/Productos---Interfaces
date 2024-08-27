abstract public class Electronico extends Producto implements IElectronico{

    //Atributos
    private String fabricante;

    //Constructor
    public Electronico(int precio, String fabricante){
        super(precio);
        this.fabricante = fabricante;
    }
    public String getFabricante() {
        return this.fabricante;
    }
}
