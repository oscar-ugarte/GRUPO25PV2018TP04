package aplicacion.punto8.beans.forms;

import aplicacion.punto8.modelo.dominio.*;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Oscar
 */
@ManagedBean
@ViewScoped
public class BusquedaYListadoDeLibrosFormBean implements Serializable {
    private ListaDeAutores listaDeAutores;
    private ListaDeLibros listaDeLibros;
    private ListaDeLibros listaDeLibrosPorAutor;
    private Libro libro;
    private Autor autor;

    /**
     * Creates a new instance of BusquedaYListadoDeLibrosFormBean
     */
    public BusquedaYListadoDeLibrosFormBean() {
        listaDeAutores = new ListaDeAutores();
        listaDeLibros = new ListaDeLibros();
        listaDeLibrosPorAutor = new ListaDeLibros();
        libro = new Libro();
        autor = new Autor();
    }

    /**
     * @return the listaDeAutores
     */
    public ListaDeAutores getListaDeAutores() {
        return listaDeAutores;
    }

    /**
     * @param listaDeAutores the listaDeAutores to set
     */
    public void setListaDeAutores(ListaDeAutores listaDeAutores) {
        this.listaDeAutores = listaDeAutores;
    }

    /**
     * @return the listaDeLibros
     */
    public ListaDeLibros getListaDeLibros() {
        return listaDeLibros;
    }

    /**
     * @param listaDeLibros the listaDeLibros to set
     */
    public void setListaDeLibros(ListaDeLibros listaDeLibros) {
        this.listaDeLibros = listaDeLibros;
    }

    /**
     * @return the listaDeLibrosPorAutor
     */
    public ListaDeLibros getListaDeLibrosPorAutor() {
        return listaDeLibrosPorAutor;
    }

    /**
     * @param listaDeLibrosPorAutor the listaDeLibrosPorAutor to set
     */
    public void setListaDeLibrosPorAutor(ListaDeLibros listaDeLibrosPorAutor) {
        this.listaDeLibrosPorAutor = listaDeLibrosPorAutor;
    }

    /**
     * @return the libro
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * @param libro the libro to set
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    /**
     * @return the autor
     */
    public Autor getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    /**
     * Agrega un libro al listado.
     */
    public void añadirLibro() {
        listaDeLibros.añadirLibro(libro);
        libro = new Libro();
    }
    
    /**
     * Se encarga de realizar la busqueda por autor.
     */
    public void buscarPorAutor() {
        listaDeLibrosPorAutor = new ListaDeLibros();
        listaDeLibrosPorAutor.setLibros(listaDeLibros.buscarPorAutor(autor));
    }    
    
}
