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
public class proveedoresDTO {

    private int IdProveedor = 0;
    private String NombreProveeedor = "";
    private String Direccion = "";
    private String Telefono = "";
    private String Email = "";

    /**
     * @return the IdProveedor
     */
    public int getIdProveedor() {
        return IdProveedor;
    }

    /**
     * @param IdProveedor the IdProveedor to set
     */
    public void setIdProveedor(int IdProveedor) {
        this.IdProveedor = IdProveedor;
    }

    /**
     * @return the NombreProveeedor
     */
    public String getNombreProveeedor() {
        return NombreProveeedor;
    }

    /**
     * @param NombreProveeedor the NombreProveeedor to set
     */
    public void setNombreProveeedor(String NombreProveeedor) {
        this.NombreProveeedor = NombreProveeedor;
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
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }
}
