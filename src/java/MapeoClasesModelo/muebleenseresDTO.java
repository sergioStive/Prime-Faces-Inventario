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
public class muebleenseresDTO {
private int IdMuebleEnseres = 0;
private String Descripcion = "";
private int Cantidad = 0;
private double Valor = 0.0;
private int IdEstado = 0;
private int IdOficina = 0;  

    /**
     * @return the IdMuebleEnseres
     */
    public int getIdMuebleEnseres() {
        return IdMuebleEnseres;
    }

    /**
     * @param IdMuebleEnseres the IdMuebleEnseres to set
     */
    public void setIdMuebleEnseres(int IdMuebleEnseres) {
        this.IdMuebleEnseres = IdMuebleEnseres;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * @return the Cantidad
     */
    public int getCantidad() {
        return Cantidad;
    }

    /**
     * @param Cantidad the Cantidad to set
     */
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
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
     * @return the IdEstado
     */
    public int getIdEstado() {
        return IdEstado;
    }

    /**
     * @param IdEstado the IdEstado to set
     */
    public void setIdEstado(int IdEstado) {
        this.IdEstado = IdEstado;
    }

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
}
