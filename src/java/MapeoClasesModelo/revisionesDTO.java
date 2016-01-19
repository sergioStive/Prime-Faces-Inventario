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
public class revisionesDTO {
    private int IdRevision = 0;
    private String Fecha = "";
    private String Mantenimiento;
    private String Responsable = "";
    private String Observacion = "";
    private String SerialEquipo = "";   

    /**
     * @return the IdRevision
     */
    public int getIdRevision() {
        return IdRevision;
    }

    /**
     * @param IdRevision the IdRevision to set
     */
    public void setIdRevision(int IdRevision) {
        this.IdRevision = IdRevision;
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
     * @return the Mantenimiento
     */
    public String getMantenimiento() {
        return Mantenimiento;
    }

    /**
     * @param Mantenimiento the Mantenimiento to set
     */
    public void setMantenimiento(String Mantenimiento) {
        this.Mantenimiento = Mantenimiento;
    }

    /**
     * @return the Responsable
     */
    public String getResponsable() {
        return Responsable;
    }

    /**
     * @param Responsable the Responsable to set
     */
    public void setResponsable(String Responsable) {
        this.Responsable = Responsable;
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
}
