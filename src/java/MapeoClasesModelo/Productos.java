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
public class Productos {
    
    private int codProducto;
    private String NombreProducto;
    private double ValorInicial;

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public double getValorInicial() {
        return ValorInicial;
    }

    public void setValorInicial(double ValorInicial) {
        this.ValorInicial = ValorInicial;
    }

    /**
     * @return the codProducto
     */
    public int getCodProducto() {
        return codProducto;
    }

    /**
     * @param codProducto the codProducto to set
     */
    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }
    
    
    
}
