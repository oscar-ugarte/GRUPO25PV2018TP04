package aplicacion.punto3.beans.forms;

import aplicacion.punto3.modelo.dominio.Calculadora;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Oscar
 */
@ManagedBean
@ViewScoped
public class CalculadoraFormBean implements Serializable{
    private double numeroA; // Numero que se va a a manejar con el formulario.
    private double numeroB; // Numero que se va a a manejar con el formulario.
    private Calculadora calculadora;
    private double resultado; //Aqui se guardaran los resultados de las operaciones.
    private String mensajeDeError; //Para division por 0 o potencia negativa.
    
    /**
     * Creates a new instance of CalculadoraFormBean - Constructor.
     */
    public CalculadoraFormBean() {
        calculadora = new Calculadora(); // Importante y nunca olvidar. variable = new Objeto() ;    
    }

    /**
     * @return the numeroA
     */
    public double getNumeroA() {
        return numeroA;
    }

    /**
     * @param numeroA the numeroA to set
     */
    public void setNumeroA(double numeroA) {
        this.numeroA = numeroA;
    }

    /**
     * @return the numeroB
     */
    public double getNumeroB() {
        return numeroB;
    }

    /**
     * @param numeroB the numeroB to set
     */
    public void setNumeroB(double numeroB) {
        this.numeroB = numeroB;
    }

    /**
     * @return the calculadora
     */
    public Calculadora getCalculadora() {
        return calculadora;
    }

    /**
     * @param calculadora the calculadora to set
     */
    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    /**
     * @return the resultado
     */
    public double getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    /**
     * @return the mensajeDeError
     */
    public String getMensajeDeError() {
        return mensajeDeError;
    }

    /**
     * @param mensajeDeError the mensajeDeError to set
     */
    public void setMensajeDeError(String mensajeDeError) {
        this.mensajeDeError = mensajeDeError;
    }
    
    ///***************Metodos*******************///    
    /**
     * Realiza la suma.
     * @return
     */
    public void sumar() {
        resultado = calculadora.sumar(numeroA, numeroB);
        mensajeDeError = "";
    }

    /**
     * Realiza la resta.
     * @return
     */
    public void restar() {
        resultado = calculadora.restar(numeroA, numeroB);
        mensajeDeError = "";
    }

    /**
     * Realiza la multiplicacion
     * @return
     */
    public void multiplicar() {
        resultado = calculadora.multiplicar(numeroA, numeroB);
        mensajeDeError = "";
    }

    /**
     * Realiza la division.
     * @return
     */
    public void dividir() {
        if (numeroB == 0) {
            mensajeDeError = "Error. Division por 0.";
        } else {
            resultado = calculadora.dividir(numeroA, numeroB);
            mensajeDeError = "" ;
        }
    }

    /**
     * Realiza la potencia.
     */
    public void obtenerPotencia() {
        if (numeroB < 0) {
            mensajeDeError = "Se calculó la potencia con Exponente Negativo.";
        }else{
            mensajeDeError = "" ;
        }
        resultado = calculadora.calcularPotencia(numeroA, numeroB);
    }    
    
}
