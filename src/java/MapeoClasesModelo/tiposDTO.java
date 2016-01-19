/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MapeoClasesModelo;

/**
 *
 * @author APRENDIZ_SENA
 */
public class tiposDTO {

    private int IdTipo = 0;
    private String NombreTipo = "";
    private int IdClase = 0;

    /**
     * @return the IdTipo
     */
    public int getIdTipo() {
        return IdTipo;
    }

    /**
     * @param IdTipo the IdTipo to set
     */
    public void setIdTipo(int IdTipo) {
        this.IdTipo = IdTipo;
    }

    /**
     * @return the NombreTipo
     */
    public String getNombreTipo() {
        return NombreTipo;
    }

    /**
     * @param NombreTipo the NombreTipo to set
     */
    public void setNombreTipo(String NombreTipo) {
        this.NombreTipo = NombreTipo;
    }

    /**
     * @return the IdClase
     */
    public int getIdClase() {
        return IdClase;
    }

    /**
     * @param IdClase the IdClase to set
     */
    public void setIdClase(int IdClase) {
        this.IdClase = IdClase;
    }
}
