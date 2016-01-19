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
public class sistemaoperativosDTO {

    private int IdSisOperativo = 0;
    private String NombreSisOperativo = "";

    /**
     * @return the IdSisOperativo
     */
    public int getIdSisOperativo() {
        return IdSisOperativo;
    }

    /**
     * @param IdSisOperativo the IdSisOperativo to set
     */
    public void setIdSisOperativo(int IdSisOperativo) {
        this.IdSisOperativo = IdSisOperativo;
    }

    /**
     * @return the NombreSisOperativo
     */
    public String getNombreSisOperativo() {
        return NombreSisOperativo;
    }

    /**
     * @param NombreSisOperativo the NombreSisOperativo to set
     */
    public void setNombreSisOperativo(String NombreSisOperativo) {
        this.NombreSisOperativo = NombreSisOperativo;
    }
}
