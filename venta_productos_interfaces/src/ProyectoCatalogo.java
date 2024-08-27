import org.codexdei.interfaces.IProducto;
import org.codexdei.productos.*;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

public class ProyectoCatalogo {

    public static void main(String[] args) {

        IProducto[] productos = new Producto[4];

        LocalDate formatoFechaCienAniosSoledad = LocalDate.of(1967,5,30);
        Date fechaLibroCienAniosSoledad = Date.from(formatoFechaCienAniosSoledad.atStartOfDay(ZoneId.systemDefault()).toInstant());

        LocalDate formatoCondorito = LocalDate.of(1949,8,6);
        Date fechaCondorito = Date.from(formatoCondorito.atStartOfDay(ZoneId.systemDefault()).toInstant());


        productos[0] = new Iphone("iPhone 15 Pro", 5999000,"Apple","Negro Espacial");
        productos[1] = new TvLcd("Tv",24000000,"Samsung", 85);
        productos[2] = new Libro("Libro","Cien años de soledad", 49900,fechaLibroCienAniosSoledad,
                                "Gabriel Garcia Marquez","Editorial Sudamericana");
        productos[3] = new Comics("Comics","Condorito", 25000,fechaCondorito,
                                "René Ríos Boettiger (Pepo)","Zig-Zag");

        for(IProducto producto : productos){

            System.out.println(producto);
        }

    }
}
