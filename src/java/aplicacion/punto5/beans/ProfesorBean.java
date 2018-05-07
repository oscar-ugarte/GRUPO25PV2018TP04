package aplicacion.punto5.beans;

import aplicacion.punto5.modelo.dominio.Profesor;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ProfesorBean implements Serializable {
    //Atributos
    private Profesor profesor;

    public ProfesorBean() {
        profesor = new Profesor() ; //Importante
    }

    public ProfesorBean(Profesor profesor) {
        this.profesor = profesor;
    }

    /**
     * @return the profesor
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
}
