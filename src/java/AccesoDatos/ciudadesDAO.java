/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import ClasesAdstractas.abstractPadre;
import MapeoClasesModelo.ciudadesDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author APRENDIZ_SENA
 */
public class ciudadesDAO extends abstractPadre {
  ciudadesDTO ciud = new ciudadesDTO();
  ResultSet rs;  
  @Override
    public void registrar() throws Exception {
       String mensajeSalida = "";
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("INSERT INTO ciudades (IdCiudad,NombreCiudad) values (?,?)");

            st.setInt(1, ciud.getIdCiudad());
            st.setString(2, ciud.getNombreCiudad());
            st.executeUpdate();
        } catch (SQLException sqle) {
            mensajeSalida = "Ocurrió la siguiente exception : " + sqle.getMessage();
            throw sqle;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<ciudadesDTO> listarClientes() throws Exception {
       List<ciudadesDTO> lista;

        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareCall("SELECT IdUsuario\n"
                    + "Nombres,Apellidos,Clave,IdSucursal,IdRol FROM usuarios");
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                ciud.setIdCiudad(rs.getInt("IdUsuario"));
                ciud.setNombreCiudad(rs.getString("Nombres"));
                
                st.executeUpdate();

                lista.add(ciud);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;
    }

    public ciudadesDTO leerPorId(ciudadesDTO ciud) throws Exception {
       
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("SELECT IdCiudad,NombreCiudad FROM ciudades WHERE IdCiudad = ? ");

            st.setInt(1, ciud.getIdCiudad());
            rs = st.executeQuery();

            while (rs.next()) {
                
                ciud.setIdCiudad(rs.getInt("IdUsuario"));
                ciud.setNombreCiudad(rs.getString("Nombres"));
                
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return ciud;
    }

    @Override
    public void modificar() throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("UPDATE IdCiudad,NombreCiudad  WHERE IdCiudad = ?");
            st.setInt(1, ciud.getIdCiudad());
            st.setString(2, ciud.getNombreCiudad());
            
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void eliminarCliente() throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("DELETE FROM ciudades WHERE IdCiudad = ?");
            st.setInt(1, ciud.getIdCiudad());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    
    
}
