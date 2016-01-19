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
public class responsablesDTO {

    private int IdResponsable = 0;
    private String Nombres = "";
    private String Apellidos = "";

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
     * @return the Nombres
     */
    public String getNombres() {
        return Nombres;
    }

    /**
     * @param Nombres the Nombres to set
     */
    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    /**
     * @return the Apellidos
     */
    public String getApellidos() {
        return Apellidos;
    }

    /**
     * @param Apellidos the Apellidos to set
     */
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
}
