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
public class dispositivosDTO {

    private int IdDispositivo = 0;
    private String Serial = "";
    private String Modelo = "";
    private double Valor = 0.0;
    private String Observacion = "";
    private int IdMarca = 0;
    private int IdTipo = 0;
    private int IdEstado = 0;
    private String SerialEquipo = "";
    private int IdPuesto = 0;

    /**
     * @return the IdDispositivo
     */
    public int getIdDispositivo() {
        return IdDispositivo;
    }

    /**
     * @param IdDispositivo the IdDispositivo to set
     */
    public void setIdDispositivo(int IdDispositivo) {
        this.IdDispositivo = IdDispositivo;
    }

    /**
     * @return the Serial
     */
    public String getSerial() {
        return Serial;
    }

    /**
     * @param Serial the Serial to set
     */
    public void setSerial(String Serial) {
        this.Serial = Serial;
    }

    /**
     * @return the Modelo
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
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
     * @return the Observacion
     */
    public String getObservacion() {
        return Observacion;
    }

    /**
     * @param Observacion the Observacion to set
     */
    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

    /**
     * @return the IdMarca
     */
    public int getIdMarca() {
        return IdMarca;
    }

    /**
     * @param IdMarca the IdMarca to set
     */
    public void setIdMarca(int IdMarca) {
        this.IdMarca = IdMarca;
    }

    /**
     * @return the IdTipo
     */
    public int getIdTipo() {
        return IdTipo;
    }

    /**
     * @param IdTipo the IdTipo to set
     */
    public void setIdTipo(int IdTipo) {
        this.IdTipo = IdTipo;
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
     * @return the SerialEquipo
     */
    public String getSerialEquipo() {
        return SerialEquipo;
    }

    /**
     * @param SerialEquipo the SerialEquipo to set
     */
    public void setSerialEquipo(String SerialEquipo) {
        this.SerialEquipo = SerialEquipo;
    }

    /**
     * @return the IdPuesto
     */
    public int getIdPuesto() {
        return IdPuesto;
    }

    /**
     * @param IdPuesto the IdPuesto to set
     */
    public void setIdPuesto(int IdPuesto) {
        this.IdPuesto = IdPuesto;
    }
}
