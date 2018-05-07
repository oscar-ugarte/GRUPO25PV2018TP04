/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.punto6.beans.forms;

import aplicacion.punto6.modelo.dominio.Auto;
import aplicacion.punto6.modelo.dominio.ListaDeAutos;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author LIGA
 */
@ManagedBean
@ViewScoped
public class ListaDeAutosFormBean implements Serializable {

    private Auto auto;
    private ListaDeAutos listaAutos;
    
    /**
     * Creates a new instance of ListaDeAutosFormBean
     */
    public ListaDeAutosFormBean() {
        listaAutos = new ListaDeAutos() ; //importante
        auto = new Auto() ;
    }

    /**
     * @return the auto
     */
    public Auto getAuto() {
        return auto;
    }

    /**
     * @param auto the auto to set
     */
    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    /**
     * @return the listaAutos
     */
    public ListaDeAutos getListaAutos() {
        return listaAutos;
    }

    /**
     * @param listaAutos the listaAutos to set
     */
    public void setListaAutos(ListaDeAutos listaAutos) {
        this.listaAutos = listaAutos;
    }
    
    public void editar(Auto copiaAuto){
        auto = copiaAuto ;
    }
    
}
