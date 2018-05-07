package aplicacion.punto5.beans.forms;

import aplicacion.punto5.beans.ProfesorBean;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ProfesorFormBean implements Serializable  {
    @ManagedProperty(value="#{profesorBean}" ) //Indica JSF inyectara ese atributo que es de tipo ProfesorBean
    private ProfesorBean profesorBean ; // Aqui esta
    /**
     * Creates a new instance of ProfesorFormBean
     */
    public ProfesorFormBean() {
    }

    public ProfesorFormBean(ProfesorBean profesorBean) {
        this.profesorBean = profesorBean;
    }

    /**
     * @return the profesorBean
     */
    public ProfesorBean getProfesorBean() {
        return profesorBean;
    }

    /**
     * @param profesorBean the profesorBean to set
     */
    public void setProfesorBean(ProfesorBean profesorBean) {
        this.profesorBean = profesorBean;
    }
}
