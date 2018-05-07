package aplicacion.punto7.beans.forms;

import aplicacion.punto7.modelo.dominio.*;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Oscar
 */
@ManagedBean
@ViewScoped
public class ListaDeLibrosFormBean implements Serializable{
    private ListaDeAutores listaDeAutores ;
    private ListaDeLibros listaDeLibros ;
    private ListaDeLibros listaDeLibrosPorAutor ;
    private Libro libro ;
    private Autor autor ;
    
    /**
     * Creates a new instance of ListaDeLibrosFormBean
     */
    public ListaDeLibrosFormBean() {
        listaDeAutores = new ListaDeAutores() ;
        listaDeLibros = new ListaDeLibros() ;
        listaDeLibrosPorAutor = new ListaDeLibros() ;
        libro = new Libro();
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
     * Añade un libro a la lista.
     */
    public void añadirLibro(){
        listaDeLibros.añadirLibro(libro);
        libro = new Libro();        
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
}
