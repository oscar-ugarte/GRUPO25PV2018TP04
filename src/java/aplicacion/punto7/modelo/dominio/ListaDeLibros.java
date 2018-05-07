package aplicacion.punto7.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oscar
 */
public class ListaDeLibros implements Serializable {

    private List<Libro> libros = new ArrayList<>();

    public ListaDeLibros() {
        libros.add(new Libro("1234567890", "Java 2", new Autor("Francisco", "Ceballo"), 400));
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

    public void añadirLibro(Libro unLibro) {
        libros.add(unLibro);
    }
}
