package aplicacion.punto7.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oscar
 */
public class ListaDeAutores implements Serializable {
    private List<Autor> autores = new ArrayList<>();

    public ListaDeAutores() {
        autores.add(new Autor("Francisco", "Ceballos"));
        autores.add(new Autor("Luis", "Joyanes Aguilar"));
        autores.add(new Autor("Paul", "Deitel"));
        autores.add(new Autor("Harvey", "Deitel"));
        autores.add(new Autor("Herbert", "Schildt"));
    }

    /**
     * @return the autores
     */
    public List<Autor> getAutores() {
        return autores;
    }

    /**
     * @param autores the autores to set
     */
    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

}
