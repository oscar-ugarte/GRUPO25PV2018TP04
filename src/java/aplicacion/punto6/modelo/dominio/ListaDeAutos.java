/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.punto6.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author LIGA
 */
public class ListaDeAutos implements Serializable{
    private ArrayList<Auto> autos = new ArrayList() ;
    
    //Constructor
    public ListaDeAutos() {
        this.autos.add( new Auto("WEG 260", "Nissan", "Kicks", "Gris plateado", "Diesel") );
        this.autos.add( new Auto("PEG 120", "Nissan", "Frontier", "Naranja", "Diesel") );
        this.autos.add( new Auto("GIO 230", "Nissan", "March", "Azul Oscuro", "Gasolina") );
        this.autos.add( new Auto("GTO 130", "Toyota", "Yaris", "Rojo Oscuro", "Diesel") );
        this.autos.add( new Auto("OCU 290", "Toyota", "Corolla", "Blanco", "Gasolina") );
    }

    /**
     * @return the autos
     */
    public ArrayList<Auto> getAutos() {
        return autos;
    }

    /**
     * @param autos the autos to set
     */
    public void setAutos(ArrayList<Auto> autos) {
        this.autos = autos;
    }
}
