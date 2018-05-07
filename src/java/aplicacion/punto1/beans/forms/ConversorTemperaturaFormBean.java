package aplicacion.punto1.beans.forms;

import aplicacion.punto1.modelo.dominio.ConvertidorTemperatura;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ConversorTemperaturaFormBean implements Serializable {


    //Atributos
    private String tipoConversion; //Cadena de texto que idicara las conversiones
    private double valorIngresado;
    private double resultadoConversion;
    private ConvertidorTemperatura convertidor; //Se encarga de realizar las conversiones.

    // Constructores
    /**
     * Creates a new instance of ConversorTemperaturaFormBean
     */
    public ConversorTemperaturaFormBean() {
        convertidor = new ConvertidorTemperatura();
    }

    public ConversorTemperaturaFormBean(String tipoConversion, double valorIngresado, double resultadoConversion, ConvertidorTemperatura convertidor) {
        this.tipoConversion = tipoConversion;
        this.valorIngresado = valorIngresado;
        this.resultadoConversion = resultadoConversion;
        this.convertidor = convertidor;
    }

    /**
     * @return the tipoConversion
     */
    public String getTipoConversion() {
        return tipoConversion;
    }

    /**
     * @param tipoConversion the tipoConversion to set
     */
    public void setTipoConversion(String tipoConversion) {
        this.tipoConversion = tipoConversion;
    }

    /**
     * @return the valorIngresado
     */
    public double getValorIngresado() {
        return valorIngresado;
    }

    /**
     * @param valorIngresado the valorIngresado to set
     */
    public void setValorIngresado(double valorIngresado) {
        this.valorIngresado = valorIngresado;
    }

    /**
     * @return the resultadoConversion
     */
    public double getResultadoConversion() {
        return resultadoConversion;
    }

    /**
     * @param resultadoConversion the resultadoConversion to set
     */
    public void setResultadoConversion(double resultadoConversion) {
        this.resultadoConversion = resultadoConversion;
    }

    /**
     * @return the convertidor
     */
    public ConvertidorTemperatura getConvertidor() {
        return convertidor;
    }

    /**
     * @param convertidor the convertidor to set
     */
    public void setConvertidor(ConvertidorTemperatura convertidor) {
        this.convertidor = convertidor;
    }

    /**
     * Se encarga de realizar las conversiones segun la cadena guardada en
     * tipoConversion .
     */
    public void convertirTemperatura() {
        switch (tipoConversion) {
            case "CelFar": {
                resultadoConversion = convertidor.convertirCelciusAFahrenheit(valorIngresado);
                break;
            }
            case "CelKel": {
                resultadoConversion = convertidor.convertirCelciusAKelvin(valorIngresado);
                break;
            }
            case "FarCel": {
                resultadoConversion = convertidor.convertirFahrenheitACelcius(valorIngresado);
                break;
            }
            case "FarKel": {
                resultadoConversion = convertidor.convertirFahrenheitAKelvin(valorIngresado);
                break;
            }
            case "KelCel": {
                resultadoConversion = convertidor.convertirKelvinACelcius(valorIngresado);
                break;
            }
            case "KelFar": {
                resultadoConversion = convertidor.convertirKelvinAFahrenheit(valorIngresado);
                break;
            }

        }
    }
    
}
