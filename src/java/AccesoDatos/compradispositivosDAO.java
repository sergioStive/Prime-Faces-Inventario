/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import ClasesAdstractas.abstractPadre;
import MapeoClasesModelo.compradispositivosDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author APRENDIZ_SENA
 */
public class compradispositivosDAO extends abstractPadre{
 ResultSet rs;
 compradispositivosDTO compra = new compradispositivosDTO();
    
 @Override
    public void registrar() throws Exception {
        String mensajeSalida = "";
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("INSERT INTO compradispositivos (IdlDispositivo,Factura) values (?,?)");

            st.setInt(1, compra.getIdlDispositivo());
            st.setString(2, compra.getFactura());
            
            st.executeUpdate();
        } catch (SQLException sqle) {
            mensajeSalida = "Ocurrió la siguiente exception : " + sqle.getMessage();
            throw sqle;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<compradispositivosDTO> listarClientes() throws Exception {
        List<compradispositivosDTO>  Lista;
    try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareCall("SELECT IdUsuario\n"
                    + "Nombres,Apellidos,Clave,IdSucursal,IdRol FROM usuarios");
            rs = st.executeQuery();
            Lista = new ArrayList();
            while (rs.next()) {
                compra.setIdlDispositivo(rs.getInt("IdUsuario"));
                compra.setFactura(rs.getString("Nombres"));
                
                st.executeUpdate();

                Lista.add(compra);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return Lista;
    }

    @Override
    public void modificar() throws Exception {
    try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("UPDATE compradispositivos SET IdlDispositivo =?,"
                    + "Factura =? WHERE IdUsuario = ?");
            st.setInt(1, compra.getIdlDispositivo());
            st.setString(2, compra.getFactura());
            
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void eliminar() throws Exception {
    try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("DELETE FROM compradispositivos WHERE IdlDispositivo = ?");
            st.setInt(1, compra.getIdlDispositivo());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }
    
}
