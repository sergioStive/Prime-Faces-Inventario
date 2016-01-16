/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MapeoClasesModelo;

/**
 *
 * @author Sergio
 */
public class Moneda {
    private int codMoneda;
    private String nombreMoneda;

    public String getNombreMoneda() {
        return nombreMoneda;
    }

    public void setNombreMoneda(String nombreMoneda) {
        this.nombreMoneda = nombreMoneda;
    }

    /**
     * @return the codMoneda
     */
    public int getCodMoneda() {
        return codMoneda;
    }

    /**
     * @param codMoneda the codMoneda to set
     */
    public void setCodMoneda(int codMoneda) {
        this.codMoneda = codMoneda;
    }
    
}
