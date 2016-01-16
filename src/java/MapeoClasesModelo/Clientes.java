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
public class Clientes {
    private int CodCliente;
    private String NombreCliente;
    private String ApellidoCliente;
    private String tefefono;
    private String email;

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getApellidoCliente() {
        return ApellidoCliente;
    }

    public void setApellidoCliente(String ApellidoCliente) {
        this.ApellidoCliente = ApellidoCliente;
    }

    public String getTefefono() {
        return tefefono;
    }

    public void setTefefono(String tefefono) {
        this.tefefono = tefefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the CodCliente
     */
    public int getCodCliente() {
        return CodCliente;
    }

    /**
     * @param CodCliente the CodCliente to set
     */
    public void setCodCliente(int CodCliente) {
        this.CodCliente = CodCliente;
    }
    
    
}
