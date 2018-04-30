/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.punto2.beans.forms;

import aplicacion.punto2.modelo.dominio.ListaDeNumeros;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author LIGA
 */
@ManagedBean
@ViewScoped
public class GestorDeNumerosFormBean implements Serializable {

    private double numero;
    private ListaDeNumeros listaNumeros; //Contiene los metodos y una lista de numeros
    private double mayor;
    private double menor;
    private double promedio;

    /*             
     * Este es el constructor. Es importante inicializar la lista.
     */
    public GestorDeNumerosFormBean() {
        listaNumeros = new ListaDeNumeros(); //Importante
    }

    public GestorDeNumerosFormBean(double numero, ListaDeNumeros listaNumeros, double mayor, double menor, double promedio) {
        this.numero = numero;
        this.listaNumeros = listaNumeros;
        this.mayor = mayor;
        this.menor = menor;
        this.promedio = promedio;
    }

    /**
     * @return the numero
     */
    public double getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(double numero) {
        this.numero = numero;
    }

    /**
     * @return the listaNumeros
     */
    public ListaDeNumeros getListaNumeros() {
        return listaNumeros;
    }

    /**
     * @param listaNumeros the listaNumeros to set
     */
    public void setListaNumeros(ListaDeNumeros listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    /**
     * @return the mayor
     */
    public double getMayor() {
        return mayor;
    }

    /**
     * @param mayor the mayor to set
     */
    public void setMayor(double mayor) {
        this.mayor = mayor;
    }

    /**
     * @return the menor
     */
    public double getMenor() {
        return menor;
    }

    /**
     * @param menor the menor to set
     */
    public void setMenor(double menor) {
        this.menor = menor;
    }

    /**
     * @return the promedio
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    /**
     * Agraga un numero y actualiza los valores.
     */
    public void agregarNumero() {
        listaNumeros.agregarNumero(numero);; //Agrega un numero a la lista
        numero = 0.0; //Se borra el valor de numero para ser utilizado nuevamente.
        menor = listaNumeros.generarMenor();
        mayor = listaNumeros.generarMayor();
        promedio = listaNumeros.generarPromedio();
    }
}
