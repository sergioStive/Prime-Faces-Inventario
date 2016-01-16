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
public class comprasDTO {

    private String Factura = "";
    private double Valor = 0.0;
    private String Fecha = "";
    private String Garantia = "";
    private int IdProveedor = 0;

    /**
     * @return the Factura
     */
    public String getFactura() {
        return Factura;
    }

    /**
     * @param Factura the Factura to set
     */
    public void setFactura(String Factura) {
        this.Factura = Factura;
    }

    /**
     * @return the Valor
     */
    public double getValor() {
        return Valor;
    }

    /**
     * @param Valor the Valor to set
     */
    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    /**
     * @return the Fecha
     */
    public String getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * @return the Garantia
     */
    public String getGarantia() {
        return Garantia;
    }

    /**
     * @param Garantia the Garantia to set
     */
    public void setGarantia(String Garantia) {
        this.Garantia = Garantia;
    }

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

}
