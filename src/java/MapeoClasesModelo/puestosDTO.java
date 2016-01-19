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
public class puestosDTO {

    private int IdPuesto = 0;
    private String NombrePuesto = "";
    private int IdResponsable = 0;
    private int IdOficina = 0;

    /**
     * @return the IdPuesto
     */
    public int getIdPuesto() {
        return IdPuesto;
    }

    /**
     * @param IdPuesto the IdPuesto to set
     */
    public void setIdPuesto(int IdPuesto) {
        this.IdPuesto = IdPuesto;
    }

    /**
     * @return the NombrePuesto
     */
    public String getNombrePuesto() {
        return NombrePuesto;
    }

    /**
     * @param NombrePuesto the NombrePuesto to set
     */
    public void setNombrePuesto(String NombrePuesto) {
        this.NombrePuesto = NombrePuesto;
    }

    /**
     * @return the IdResponsable
     */
    public int getIdResponsable() {
        return IdResponsable;
    }

    /**
     * @param IdResponsable the IdResponsable to set
     */
    public void setIdResponsable(int IdResponsable) {
        this.IdResponsable = IdResponsable;
    }

    /**
     * @return the IdOficina
     */
    public int getIdOficina() {
        return IdOficina;
    }

    /**
     * @param IdOficina the IdOficina to set
     */
    public void setIdOficina(int IdOficina) {
        this.IdOficina = IdOficina;
    }
}
