package org.codexdei.productos;

import org.codexdei.interfaces.ILibro;

import java.util.Date;

public class Libro extends Producto implements ILibro {
    //Atributos
    private Date fechaDePublicacion;
    private String titulo;
    private String autor;
    private String editorial;
    //Construtor
    public Libro(String modelo, String titulo, int precio, Date fechaDePublicacion, String autor,
                 String editorial) {
        super(modelo,precio);
        this.titulo = titulo;
        this.fechaDePublicacion = fechaDePublicacion;
        this.autor = autor;
        this.editorial = editorial;
    }
    //getters implementados por la interface ILibro
    @Override
    public Date getFechaPublicacion() {
        return fechaDePublicacion;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }
    //Metodo de la interface IProducto
    @Override
    public double getPrecioVenta() {
        return getPrecio();
    }
    //toString

    @Override
    public String toString() {
        return super.toString() +
                "FechaDePublicacion=" + fechaDePublicacion + "\n" +
                "Titulo=" + titulo + '\n' +
                "Autor=" + autor + '\n' +
                "Editorial=" + editorial + '\n';
    }
}
