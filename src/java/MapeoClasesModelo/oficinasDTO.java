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
public class oficinasDTO {
private int IdOficina = 0;
private String NombreOficina = "";
private int IdSucursal = 0;   

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

    /**
     * @return the NombreOficina
     */
    public String getNombreOficina() {
        return NombreOficina;
    }

    /**
     * @param NombreOficina the NombreOficina to set
     */
    public void setNombreOficina(String NombreOficina) {
        this.NombreOficina = NombreOficina;
    }

    /**
     * @return the IdSucursal
     */
    public int getIdSucursal() {
        return IdSucursal;
    }

    /**
     * @param IdSucursal the IdSucursal to set
     */
    public void setIdSucursal(int IdSucursal) {
        this.IdSucursal = IdSucursal;
    }
}
