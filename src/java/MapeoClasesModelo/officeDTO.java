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
public class officeDTO {
private int IdOffice = 0;
private String NombreOffice = "";

    /**
     * @return the IdOffice
     */
    public int getIdOffice() {
        return IdOffice;
    }

    /**
     * @param IdOffice the IdOffice to set
     */
    public void setIdOffice(int IdOffice) {
        this.IdOffice = IdOffice;
    }

    /**
     * @return the NombreOffice
     */
    public String getNombreOffice() {
        return NombreOffice;
    }

    /**
     * @param NombreOffice the NombreOffice to set
     */
    public void setNombreOffice(String NombreOffice) {
        this.NombreOffice = NombreOffice;
    }
}
