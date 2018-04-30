/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.punto2.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LIGA
 */
public class ListaDeNumeros implements Serializable{
    
    private List<Double> numeros = new ArrayList<>();

    //Constructor
    public ListaDeNumeros() {
    }

    /**
     * @return the numeros
     */
    public List<Double> getNumeros() {
        return numeros;
    }

    /**
     * @param numeros the numeros to set
     */
    public void setNumeros(List<Double> numeros) {
        this.numeros = numeros;
    }

    //Metodos
    /**
     * Agrega un numero a la lista
     *
     * @param numero
     */
    public void agregarNumero(double numero) {
        numeros.add(numero);
    }

    /**
     * Devuelve el numero mayor de la lista.
     *
     * @return
     */
    public double generarMayor() {
        double mayor = 0;
        if (!numeros.isEmpty()) { // Pregunta si la lista no esta vacia
            mayor = numeros.get(0); //Asigna el primer numero de la lista de numeros.
            for (double unNumero : numeros) {
                if (mayor < unNumero) {
                    mayor = unNumero;
                }
            }
        }
        return mayor;
    }

    /**
     * Devuelve el numero menor de la lista.
     *
     * @return
     */
    public double generarMenor() {
        double menor = 0;
        if (!numeros.isEmpty()) { // Pregunta si la lista no esta vacia
            menor = numeros.get(0); //Asigna el primer numero de la lista de numeros.
            for (double unNumero : numeros) {
                if (menor > unNumero) {
                    menor = unNumero;
                }
            }
        }
        return menor;
    }

    /**
     * Obtiene el promedio de la lista de numeros.
     *
     * @return
     */
    public double generarPromedio() {
        double promedio = 0.0; //
        double suma = 0.0;
        if (!numeros.isEmpty()) {
            for (double unNumero : numeros) {
                suma = suma + unNumero; //Se guarda la suma de cada numero. 
            }
            promedio = suma / numeros.size(); //Realiza la division.
        }
        return promedio;
    }

}
