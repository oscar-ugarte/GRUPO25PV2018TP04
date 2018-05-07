package aplicacion.punto8.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oscar
 */
public class ListaDeLibros implements Serializable{
    private List<Libro> libros = new ArrayList<>();

    public ListaDeLibros() {
    }

    /**
     * @return the libros
     */
    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * @param libros the libros to set
     */
    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    //Agrega un libro al listado
    public void añadirLibro(Libro unLibro) {
        libros.add(unLibro);
    }

    /**
     * Recibe un autor y devuelve un ArrayList de libros con los libros escritos por el autor.
     * @param autor
     * @return 
     */
    public ArrayList<Libro> buscarPorAutor(Autor autor) {
        ArrayList<Libro> listaFiltrada = new ArrayList<>();
        for (Libro unLibro : libros) {
            if (autor.equals(unLibro.getAutor())) {
                listaFiltrada.add(unLibro);
            }
        }
        return listaFiltrada;
    }    
}
