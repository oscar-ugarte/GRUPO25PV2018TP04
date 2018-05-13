package aplicacion.punto4.modelo.util;

import java.io.Serializable;

/**
 *
 * @author Oscar
 */
public class ArregloDePaises implements Serializable {

    private String[] paises = new String[10];

    public ArregloDePaises() {
        //Aqui se asignan 10 paises
        paises[0] = "Argentina";
        paises[1] = "España";
        paises[2] = "Francia";
        paises[3] = "Alemania";
        paises[4] = "Ecuador";
        paises[5] = "Brasil";
        paises[6] = "Chile";
        paises[7] = "Japon";
        paises[8] = "Uruguay";
        paises[9] = "Mexico";
    }

    /**
     * @return the paises
     */
    public String[] getPaises() {
        return paises;
    }

    /**
     * @param paises the paises to set
     */
    public void setPaises(String[] paises) {
        this.paises = paises;
    }    
}
