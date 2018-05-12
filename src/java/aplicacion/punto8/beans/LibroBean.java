/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.punto8.beans;

import aplicacion.punto8.modelo.dominio.Libro;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Oscar
 */
@ManagedBean
@ViewScoped
public class LibroBean implements Serializable {
    private Libro libro ;

    /**
     * Creates a new instance of LibroBean
     */
    public LibroBean() {
        libro = new Libro() ;
    }

    public LibroBean(Libro libro) {
        this.libro = libro;
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

    
    
}
