package aplicacion.punto1.modelo.dominio;

import java.io.Serializable;

public class ConvertidorTemperatura implements Serializable {
     
    public ConvertidorTemperatura() {
    }

    /**
     * Metodo para convertir una temperatura en celcius a fahrenheit.
     *
     * @param valorIngresado
     * @return
     */
    public double convertirCelciusAFahrenheit(double valorIngresado) {
        return 1.8 * valorIngresado + 32;
    }

    /**
     * Metodo para convertir una temperatura en celcius a kelvin.
     *
     * @param valorIngresado
     * @return
     */
    public double convertirCelciusAKelvin(double valorIngresado) {
        return valorIngresado + 273.15;
    }

    /**
     * Metodo para convertir una temperatura en fahrenheit a celcius.
     *
     * @param valorIngresado
     * @return
     */
    public double convertirFahrenheitACelcius(double valorIngresado) {
        return (valorIngresado - 32) / 1.8;
    }

    /**
     * Metodo para convertir una temperatura en fahrenheit a kelvin.
     *
     * @param valorIngresado
     * @return
     */
    public double convertirFahrenheitAKelvin(double valorIngresado) {
        return (valorIngresado + 459.67) * 5 / 9;
    }

    /**
     * Metodo para convertir una temperatura en kelvin a celcius.
     *
     * @param valorIngresado
     * @return
     */
    public double convertirKelvinACelcius(double valorIngresado) {
        return valorIngresado - 273.15;
    }

    /**
     * Metodo para convertir una temperatura en kelvin a fahrenheit.
     *
     * @param valorIngresado
     * @return
     */
    public double convertirKelvinAFahrenheit(double valorIngresado) {
        return valorIngresado - 459.67;
    }   
}
