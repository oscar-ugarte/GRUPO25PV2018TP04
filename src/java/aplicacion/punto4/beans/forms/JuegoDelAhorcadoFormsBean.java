package aplicacion.punto4.beans.forms;

import aplicacion.punto4.modelo.dominio.JuegoDelAhorcado;
import aplicacion.punto4.modelo.util.ArregloDePaises;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Oscar
 */
@ManagedBean
@ViewScoped
public class JuegoDelAhorcadoFormsBean implements Serializable {


    private ArregloDePaises arregloPaises; //El arreglo que contiene los paises
    private int intentos = 7; // Numero de intentos del jugador 
    private String palabra; //La palabra que contiene el nombre del pais
    private String palabraOculta; // Una cadena de la longitud de palabra que contiene "-"
    private Character letra; //La letra que va a ingresar el usuario
    private boolean estadoDelJuego; //Si cambia a verdadero el jugador gano
    private String mensajeFinal; //Muestra Ganado o Perdido.
    private JuegoDelAhorcado juegoDelAhorcado; //Ṕara usar los metodos del juego.
    private boolean finDelJuego; //Termina el juego para que el usuario no siga ingresando letras.

    public JuegoDelAhorcadoFormsBean() {
        juegoDelAhorcado = new JuegoDelAhorcado(); //Tiene todos los metodos del juego
        arregloPaises = new ArregloDePaises();
        palabra = arregloPaises.getPaises()[(int) (Math.random() * 10)]; //Aqui asigna un pais 
        palabraOculta = juegoDelAhorcado.ObtenerPalabraOcultada(palabra); //Crea una palabra de puros renglones.
        estadoDelJuego = false;
        mensajeFinal = ""; //Muestra el mensaje GANADO/PERDIDO.
        finDelJuego = false;
    }

    public JuegoDelAhorcadoFormsBean(ArregloDePaises arregloPaises, String palabra, String palabraOculta, Character letra, boolean estadoDelJuego, String mensajeFinal, JuegoDelAhorcado juegoDelAhorcado, boolean finDelJuego) {
        this.arregloPaises = arregloPaises;
        this.palabra = palabra;
        this.palabraOculta = palabraOculta;
        this.letra = letra;
        this.estadoDelJuego = estadoDelJuego;
        this.mensajeFinal = mensajeFinal;
        this.juegoDelAhorcado = juegoDelAhorcado;
        this.finDelJuego = finDelJuego;
    }

    /**
     * @return the arregloPaises
     */
    public ArregloDePaises getArregloPaises() {
        return arregloPaises;
    }

    /**
     * @param arregloPaises the arregloPaises to set
     */
    public void setArregloPaises(ArregloDePaises arregloPaises) {
        this.arregloPaises = arregloPaises;
    }

    /**
     * @return the intentos
     */
    public int getIntentos() {
        return intentos;
    }

    /**
     * @param intentos the intentos to set
     */
    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    /**
     * @return the palabra
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * @param palabra the palabra to set
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    /**
     * @return the palabraOculta
     */
    public String getPalabraOculta() {
        return palabraOculta;
    }

    /**
     * @param palabraOculta the palabraOculta to set
     */
    public void setPalabraOculta(String palabraOculta) {
        this.palabraOculta = palabraOculta;
    }

    /**
     * @return the letra
     */
    public Character getLetra() {
        return letra;
    }

    /**
     * @param letra the letra to set
     */
    public void setLetra(Character letra) {
        this.letra = letra;
    }

    /**
     * @return the estadoDelJuego
     */
    public boolean isEstadoDelJuego() {
        return estadoDelJuego;
    }

    /**
     * @param estadoDelJuego the estadoDelJuego to set
     */
    public void setEstadoDelJuego(boolean estadoDelJuego) {
        this.estadoDelJuego = estadoDelJuego;
    }

    /**
     * @return the mensajeFinal
     */
    public String getMensajeFinal() {
        return mensajeFinal;
    }

    /**
     * @param mensajeFinal the mensajeFinal to set
     */
    public void setMensajeFinal(String mensajeFinal) {
        this.mensajeFinal = mensajeFinal;
    }

    /**
     * @return the juegoDelAhorcado
     */
    public JuegoDelAhorcado getJuegoDelAhorcado() {
        return juegoDelAhorcado;
    }

    /**
     * @param juegoDelAhorcado the juegoDelAhorcado to set
     */
    public void setJuegoDelAhorcado(JuegoDelAhorcado juegoDelAhorcado) {
        this.juegoDelAhorcado = juegoDelAhorcado;
    }

    /**
     * @return the finDelJuego
     */
    public boolean isFinDelJuego() {
        return finDelJuego;
    }

    /**
     * @param finDelJuego the finDelJuego to set
     */
    public void setFinDelJuego(boolean finDelJuego) {
        this.finDelJuego = finDelJuego;
    }

    //Aqui comienza    
    /**
     * Se encarga de mostrar los "_" o el nombre del pais mas espaciado.
     * @return 
     */
    public String obtenerPalabraOcultaEspaciada() {
        return juegoDelAhorcado.mostrarEspacios(palabraOculta);
    }

    /**
     * Metodo Proncipal del Juego
     * 1) Busca la letra en el nombre del pais.
     * 2) Si la encuentra completa la palabra oculta con ella sino la encuentra resta 1 a los intentos
     * 3) Por ultimo revisa el estado del juego.
     */
    public void ingresarUnaLetra() {
        if (finDelJuego == false) {
            if (juegoDelAhorcado.buscarLetra(palabra, letra)) {
                palabraOculta = juegoDelAhorcado.remplazarLetra(palabra, palabraOculta, letra);
            } else {
                intentos = intentos - 1;
            }
            estadoDelJuego = juegoDelAhorcado.comprobarResultado(palabraOculta);

            letra = ' ';

            if (estadoDelJuego) {
                mensajeFinal = "GANADO";
                finDelJuego = true;
            } else {
                if (intentos > 0) {
                    mensajeFinal = "";
                } else {
                    mensajeFinal = "PERDIDO";
                    palabraOculta = palabra;
                    finDelJuego = true;
                }
            }
        }

    }    
}
