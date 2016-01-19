/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import ClasesAdstractas.abstractPadre;
import MapeoClasesModelo.clasesDTO;
import MapeoClasesModelo.usuariosDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author APRENDIZ_SENA
 */
public class clasesDAO extends abstractPadre {
  clasesDTO clase = new clasesDTO();
  ResultSet rs;  
  @Override
    public void registrar() throws Exception {
      String mensajeSalida = "";
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("INSERT INTO clases (IdClase,NombreClase) values (?,?)");

            st.setInt(1, clase.getIdClase());
            st.setString(2, clase.getNombreClase());
            
            st.executeUpdate();
        } catch (SQLException sqle) {
            mensajeSalida = "Ocurrió la siguiente exception : " + sqle.getMessage();
            throw sqle;
        } finally {
            this.Cerrar();
        }  
    }

    @Override
    public List<clasesDTO> listarClientes() throws Exception {
        List<clasesDTO> lista;
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareCall("SELECT IdClase, NombreClase FROM usuarios");
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                clase.setIdClase(rs.getInt("IdUsuario"));
                clase.setNombreClase(rs.getString("Nombres"));
                
                st.executeUpdate();

                lista.add(clase);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;
    }

    @Override
    public void modificar() throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("UPDATE usuarios SET IdUsuario =?, Nombres\n"
                    + "Apellidos = ?,Clave = ?,IdSucursal = ?,IdRol = ? WHERE IdUsuario = ?");
            st.setInt(1, clase.getIdClase());
            st.setString(2, clase.getNombreClase());
            
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void eliminarCliente() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
