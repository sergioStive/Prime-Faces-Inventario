/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesAdstractas;
import java.util.List;
import AccesoDatos.Conexion;

/**
 *
 * @author APRENDIZ_SENA
 */
public abstract class abstractPadre extends Conexion{
  
    
    public abstract void registrar()throws Exception;

    public abstract List listarClientes() throws Exception;

    

    public abstract void modificar() throws Exception;
    
    public abstract void eliminar() throws Exception;
}
