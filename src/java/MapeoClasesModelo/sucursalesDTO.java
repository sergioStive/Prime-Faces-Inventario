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
public class sucursalesDTO {

    private int IdSucursal = 0;
    private String Barrio = "";
    private String Direccion = "";
    private String Telefono = "";
    private int IdCiudad = 0;

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

    /**
     * @return the Barrio
     */
    public String getBarrio() {
        return Barrio;
    }

    /**
     * @param Barrio the Barrio to set
     */
    public void setBarrio(String Barrio) {
        this.Barrio = Barrio;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    /**
     * @return the Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * @return the IdCiudad
     */
    public int getIdCiudad() {
        return IdCiudad;
    }

    /**
     * @param IdCiudad the IdCiudad to set
     */
    public void setIdCiudad(int IdCiudad) {
        this.IdCiudad = IdCiudad;
    }
}
