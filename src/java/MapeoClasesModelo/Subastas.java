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
public class Subastas {
    private Productos productoCod;
    private Clientes ClienteCod;
    private Moneda MonedaCod;
    private double ValorOfrecido;

    public Productos getProductoCod() {
        return productoCod;
    }

    public void setProductoCod(Productos productoCod) {
        this.productoCod = productoCod;
    }

    public Clientes getClienteCod() {
        return ClienteCod;
    }

    public void setClienteCod(Clientes ClienteCod) {
        this.ClienteCod = ClienteCod;
    }

    public Moneda getMonedaCod() {
        return MonedaCod;
    }

    public void setMonedaCod(Moneda MonedaCod) {
        this.MonedaCod = MonedaCod;
    }

    public double getValorOfrecido() {
        return ValorOfrecido;
    }

    public void setValorOfrecido(double ValorOfrecido) {
        this.ValorOfrecido = ValorOfrecido;
    }

    
    
}
