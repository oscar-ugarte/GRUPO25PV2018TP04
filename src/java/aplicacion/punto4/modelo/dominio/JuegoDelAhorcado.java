package aplicacion.punto4.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Oscar
 */
public class JuegoDelAhorcado implements Serializable {
    
    public JuegoDelAhorcado() {
    }

    //Metodos
    /**
     * Se encarga de devolver una cadena con "-" de la longitud exacta de la
     * cadena pasada por parametros.
     *
     * @param palabra
     * @return
     */
    public String ObtenerPalabraOcultada(String palabra) {
        String cadena = "";
        for (int i = 1; i <= palabra.length(); i++) {
            cadena = cadena + "-";
        }
        return cadena;
    }

    /**
     * Revisa si la letra ingresa se encuentra en la cadena del nombre del pais.
     * Devuelve verdadero o falso.
     *
     * @param nombreDePais
     * @param letra
     * @return
     */
    public boolean buscarLetra(String nombreDelPais, Character letra) {
        boolean encontrado = false;
        int i = 0;
        while (i < nombreDelPais.length() && encontrado == false) {
            if (nombreDelPais.charAt(i) == letra || nombreDelPais.charAt(i) == Character.toUpperCase(letra)) {
                encontrado = true;
            } else {
                i++;
            }
        }
        return encontrado;
    }

    /**
     * Se encarga de actualizar la palabra ocultada con la nueva letra.
     *
     * @param nombreDelPais
     * @param ocultada
     * @param letra
     * @return
     */
    public String remplazarLetra(String nombreDelPais, String ocultada, Character letra) {
        String copia = "";
        for (int i = 0; i < nombreDelPais.length(); i++) {
            if (nombreDelPais.charAt(i) == letra) {
                copia = copia + letra; // para letras minusculas
            } else {
                if (nombreDelPais.charAt(i) == Character.toUpperCase(letra)) {
                    copia = copia + Character.toUpperCase(letra); // para letras mayusculas

                } else {
                    copia = copia + ocultada.charAt(i); //Para agregar el resto
                }

            }
        }
        return copia;
    }

    /**
     * Comprueba si el jugador completo la palabra.
     *
     * @param ocultada
     * @return
     */
    public boolean comprobarResultado(String ocultada) {
        boolean ganado = true;
        int i = 0;
        while (i < ocultada.length() && ganado == true) {
            if (ocultada.charAt(i) == '-') {
                ganado = false;
            } else {
                i++;
            }
        }
        return ganado;
    }

    /**
     * Devuelve la cadena oculta más espaciada.
     * @param ocultada
     * @return 
     */
    public String mostrarEspacios(String ocultada) {
        String letrasEspaciadas = "";
        for (int i = 0; i < ocultada.length(); i++) {
            letrasEspaciadas = letrasEspaciadas + ocultada.charAt(i) + " ";
        }
        return letrasEspaciadas;
    }
}
