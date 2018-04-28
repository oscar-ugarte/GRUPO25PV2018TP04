package aplicacion.punto3.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Oscar
 */
public class Calculadora implements Serializable {

    //Contructor
    public Calculadora() {
    }

    //Metodos
    /**
     * Se encarga de realizar la suma de 2 numeros.
     * @param numeroA
     * @param numeroB
     * @return
     */
    public double sumar(double numeroA, double numeroB) {
        return numeroA + numeroB;
    }

    /**
     * Se encarga de realizar la resta de 2 numeros.
     * @param numeroA
     * @param numeroB
     * @return
     */
    public double restar(double numeroA, double numeroB) {
        return numeroA - numeroB;
    }

    /**
     * Se encarga de realizar la multiplicacion de 2 numeros.
     * @param numeroA
     * @param numeroB
     * @return
     */
    public double multiplicar(double numeroA, double numeroB) {
        return numeroA * numeroB;
    }

    /**
     * Se encarga de realizar la division de 2 numeros.
     * @param numeroA
     * @param numeroB
     * @return
     */
    public double dividir(double numeroA, double numeroB) {
        return numeroA / numeroB;
    }

    /**
     * Calcula la potencia a partir de 2 numeros pasados por parametro.
     * @param numeroA es la base.
     * @param numeroB es el exponente.
     * @return
     */
    public double calcularPotencia(double numeroA, double numeroB) {
        return Math.pow(numeroA, numeroB);
    }

}
