/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import MapeoClasesModelo.Clientes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sergio
 */

public class PersonaDAO extends Conexion {

    public void registrar(Clientes per) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("INSERT INTO clientes (NombreCliente,ApellidoCliente,tefefono,email) values (?,?,?,?)");
            st.setString(1, per.getNombreCliente());
            st.setString(2, per.getApellidoCliente());
            st.setString(3, per.getTefefono());
            st.setString(4, per.getEmail());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

public List<Clientes> listarClientes() throws Exception {

        List<Clientes> lista;
        ResultSet rs;
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareCall("SELECT CodCliente,NombreCliente,ApellidoCliente,tefefono,email FROM clientes");
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                Clientes per = new Clientes();

                per.setCodCliente(rs.getInt("CodCliente"));
                per.setNombreCliente(rs.getString("NombreCliente"));
                per.setApellidoCliente(rs.getString("ApellidoCliente"));
                per.setTefefono(rs.getString("tefefono"));
                per.setEmail(rs.getString("email"));

                lista.add(per);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;
    }

    public Clientes leerPorId(Clientes per) throws Exception {
       Clientes pers = null;
       ResultSet rs; 
       try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("SELECT CodCliente,NombreCliente,ApellidoCliente,tefefono,email FROM clientes WHERE CodCliente = ? ");
            
            st.setInt(1, per.getCodCliente());
            rs = st.executeQuery();
            
            while (rs.next()){
                pers = new Clientes();
                pers.setCodCliente(rs.getInt("CodCliente"));
                pers.setNombreCliente(rs.getString("NombreCliente"));
                pers.setApellidoCliente(rs.getString("ApellidoCliente"));
                pers.setTefefono(rs.getString("tefefono"));
                pers.setEmail(rs.getString("email"));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return pers;
    }
public void modificar(Clientes per) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("UPDATE clientes SET NombreCliente =? , ApellidoCliente = ?,tefefono =?,email =? WHERE CodCliente = ?");
            st.setString(1, per.getNombreCliente());
            st.setString(2, per.getApellidoCliente());
            st.setString(3, per.getTefefono());
            st.setString(4, per.getEmail());
            st.setInt(5, per.getCodCliente());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }
public void eliminarCliente(Clientes per) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("DELETE FROM clientes WHERE CodCliente = ?");
            st.setInt(1, per.getCodCliente());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }
}
