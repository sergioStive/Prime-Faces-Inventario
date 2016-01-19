/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import ClasesAdstractas.abstractPadre;
import java.sql.PreparedStatement;
import java.util.List;
import MapeoClasesModelo.usuariosDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author APRENDIZ_SENA
 */
public class usuariosDAO extends abstractPadre {

    usuariosDTO per = new usuariosDTO();
    ResultSet rs;

    /**
     *
     * @throws Exception
     */
    @Override
    public void registrar() throws Exception {
        String mensajeSalida = "";
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("INSERT INTO usuarios (IdUsuario,Nombres,Apellidos\n"
                    + "Clave,IdSucursal,IdRol) values (?,?,?,?,?,?)");

            st.setInt(1, per.getIdUsuario());
            st.setString(2, per.getNombres());
            st.setString(3, per.getApellidos());
            st.setString(4, per.getClave());
            st.setInt(5, per.getIdSucursal());
            st.setInt(6, per.getIdRol());
            st.executeUpdate();
        } catch (SQLException sqle) {
            mensajeSalida = "Ocurrió la siguiente exception : " + sqle.getMessage();
            throw sqle;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<usuariosDTO> listarClientes() throws Exception {
        List<usuariosDTO> lista;

        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareCall("SELECT IdUsuario\n"
                    + "Nombres,Apellidos,Clave,IdSucursal,IdRol FROM usuarios");
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                per.setIdUsuario(rs.getInt("IdUsuario"));
                per.setNombres(rs.getString("Nombres"));
                per.setApellidos(rs.getString("Apellidos"));
                per.setClave(rs.getString("Clave"));
                per.setIdSucursal(rs.getInt("IdSucursal"));
                st.executeUpdate();

                lista.add(per);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;
    }

    public usuariosDTO leerPorId(usuariosDTO per) throws Exception {

        
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("SELECT IdUsuario,Nombres,Apellidos,"
                    + "Clave,IdSucursal,IdRol FROM usuarios WHERE IdUsuario = ? ");

            st.setInt(1, per.getIdUsuario());
            rs = st.executeQuery();

            while (rs.next()) {
                per = new usuariosDTO();
                per.setIdUsuario(rs.getInt("IdUsuario"));
                per.setNombres(rs.getString("Nombres"));
                per.setApellidos(rs.getString("Apellidos"));
                per.setClave(rs.getString("Clave"));
                per.setIdSucursal(rs.getInt("IdSucursal"));
                per.setIdRol(rs.getInt("IdRol"));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return per;
    }

    @Override
    public void modificar() throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("UPDATE usuarios SET IdUsuario =?, Nombres\n"
                    + "Apellidos = ?,Clave = ?,IdSucursal = ?,IdRol = ? WHERE IdUsuario = ?");
            st.setInt(1, per.getIdUsuario());
            st.setString(2, per.getNombres());
            st.setString(3, per.getApellidos());
            st.setInt(4, per.getIdSucursal());
            st.setInt(5, per.getIdRol());
            st.executeUpdate();
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
            PreparedStatement st = this.getCn().prepareStatement("DELETE FROM usuarios WHERE IdUsuario = ?");
            st.setInt(1, per.getIdUsuario());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    

}
