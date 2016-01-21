/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import ClasesAdstractas.abstractPadre;
import MapeoClasesModelo.comprasDTO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author APRENDIZ_SENA
 */
public class comprasDAO extends abstractPadre{
   comprasDTO conp = new comprasDTO();
   ResultSet rs; 
   @Override
    public void registrar() throws Exception {
    
        String mensajeSalida = "";
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("INSERT INTO compras (Factura,Valor,Fecha,Garantia,"
                    + "IdProveedor) values (?,?,?,?,?,?)");

            st.setString(1, conp.getFactura());
            st.setDouble(2, conp.getValor());
            st.setString(3, conp.getFecha());
            st.setString(4, conp.getGarantia());
            st.setInt(5, conp.getIdProveedor());
            
            st.executeUpdate();
        } catch (SQLException sqle) {
            mensajeSalida = "Ocurrió la siguiente exception : " + sqle.getMessage();
            throw sqle;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<comprasDTO> listarClientes() throws Exception {
    List<comprasDTO> lista;

        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareCall("SELECT Factura,Valor,Fecha,Garantia,"
                    + "IdProveedor FROM compras");
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                conp.setFactura(rs.getString("Factura"));
                conp.setValor(rs.getDouble("valor"));
                conp.setFecha(rs.getString("Fecha"));
                conp.setGarantia(rs.getString("Garantia"));
                conp.setIdProveedor(rs.getInt("IdProveedor"));
                st.executeUpdate();

                lista.add(conp);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;
    }

    public comprasDTO leerPorId(comprasDTO per) throws Exception {

        
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("SELECT Factura,Valor,Fecha,Garantia,"
                    + "IdProveedor FROM compras WHERE IdProveedor = ? ");

            st.setInt(1, conp.getIdProveedor());
            rs = st.executeQuery();

            while (rs.next()) {
                
                per.setFactura(rs.getString("Factura"));
                per.setValor(rs.getDouble("Valor"));
                per.setFecha(rs.getString("Fecha"));
                per.setGarantia(rs.getString("Garantia"));
                per.setIdProveedor(rs.getInt("IdProveedor"));
                
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
            PreparedStatement st = this.getCn().prepareStatement("UPDATE compras SET Factura = ?,"
                    + "Valor  = ?,Fecha = ?,Garantia = ?,IdProveedor = ? WHERE IdProveedor = ?");
            st.setString(1, conp.getFactura());
            st.setDouble(2, conp.getValor());
            st.setString(3, conp.getFecha());
            st.setString(4, conp.getGarantia());
            st.setInt(5, conp.getIdProveedor());
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
            PreparedStatement st = this.getCn().prepareStatement("DELETE FROM compras WHERE IdProveedor = ?");
            st.setInt(1, conp.getIdProveedor());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }
    
}

