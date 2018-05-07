package aplicacion.punto5.modelo.dominio;

import java.io.Serializable;

public class Profesor implements Serializable{
    //Atributos
    private String legajo;
    private String documento;
    private String apellido;
    private String nombres;

    public Profesor() {
    }

    public Profesor(String legajo, String documento, String apellido, String nombres) {
        this.legajo = legajo;
        this.documento = documento;
        this.apellido = apellido;
        this.nombres = nombres;
    }

    /**
     * @return the legajo
     */
    public String getLegajo() {
        return legajo;
    }

    /**
     * @param legajo the legajo to set
     */
    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    /**
     * @return the documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
}
