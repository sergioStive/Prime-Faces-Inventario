/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Sergio
 */
public class Conexion {

    private Connection cn;

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public String Conectar() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Aqui podra conectar su base de datos si su base no tiene clave quitesela o si es diferente cambiesela. 
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/co_expertcob_inventario","inventario_admin", "inventario_expertcob_ltda");
            return  "La conexion es buena";
        } catch (Exception e) {
            System.out.println("La conexion es mala");
            throw e;
        }
    }

    public void Cerrar() throws Exception {
        try {
            if (cn != null) {
                if (cn.isClosed() == false) {
                    cn.close();
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
