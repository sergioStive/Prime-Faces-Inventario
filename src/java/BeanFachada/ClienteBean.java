/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanFachada;

import AccesoDatos.PersonaDAO;
import MapeoClasesModelo.Clientes;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

//Fachada Patro para poder llamar al metodo que esta en la clase PersonaDAO
/**
 *
 * @author Sergio
 */
@ManagedBean
// Hace de una manera por asi desirlo peticionas ajax el ViewScoped
@ViewScoped
public class ClienteBean {

    //Hacemos un odjeto de tipo Clientes lo inicialisamos
    private Clientes cliente = new Clientes();
    private List<Clientes> listClientes;
    private String accion;

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.limpiarCajas();
        this.accion = accion;
    }

// Creamos los metodos de entrada Get y Set
    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

// Metodo operar, este sirve para que cuando se oprima el boton registar imediatamente se llame el metodo registrar.
// y despues limpiar cajas 
// lo mismo para modificar    
    
    
    public void operar() throws Exception {
        switch (accion) {
            case "Registrar":
                this.registrar();
                this.limpiarCajas();
                break;
            case "Modificar":
                this.modifica();
                this.limpiarCajas();
                break;
        }

    }
    
    // metodo de limpiarCajas sirve para cuando vallamos a registar no salgan los datos en el dialog que creamos 
public void limpiarCajas(){
    this.cliente.setCodCliente(0);
    this.cliente.setNombreCliente("");
    this.cliente.setApellidoCliente("");
    this.cliente.setTefefono("");
    this.cliente.setEmail("");
}


// Lo cambiamos a privado por que ya no va ser invocado desde el registroCliente.xhtml
    private void registrar() throws Exception {
        //Declaramos la clase PersonaDAO
        PersonaDAO Conexion;

        try {
            Conexion = new PersonaDAO();
            Conexion.registrar(cliente);
            // Traemos el metodo listar para cuando se hace el registro este se liste imediatamente en el dataTable
            this.listar();
            //Dentro del try colocamos el mensaje de registro exito una ves se registre el cliente 
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Registro Exitoso","ok :"));
        } catch (Exception e) {
            // dentro del catch colocamos el mensaje de erro 
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Se produjo un error","Detalles :"+e.getMessage()));
            throw e;
        }
    }
// Lo cambiamos a privado por que ya no va ser invocado desde el registroCliente.xhtml.
    private void modifica() throws Exception {
        //Declaramos la clase PersonaDAO
        PersonaDAO Conexion;

        try {
            Conexion = new PersonaDAO();
            Conexion.modificar(cliente);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Actualización Exitosa","ok :"));
            this.listar();
        } catch (Exception e) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Se produjo un error","Detalles :"+e.getMessage()));
            throw e;
        }
    }

    public void listar() throws Exception {
        //Declaramos la clase PersonaDAO
        PersonaDAO Conexion;

        try {
            Conexion = new PersonaDAO();
            setListClientes(Conexion.listarClientes());
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * @return the listClientes
     */
    public List<Clientes> getListClientes() {
        return listClientes;
    }

    /**
     * @param listClientes the listClientes to set
     */
    public void setListClientes(List<Clientes> listClientes) {
        this.listClientes = listClientes;
    }
// Este metodo se hizo para poder traer la informacion de acuerdo al id y asi traer los datos paa poder modificarlos.
    public void leerId(Clientes per) throws Exception {
       
        PersonaDAO conexion;
        Clientes temp;
        try {
            conexion = new PersonaDAO();
            temp = conexion.leerPorId(per);

            if (temp != null) {
                this.cliente = temp;
                this.accion = "Modificar";
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminar(Clientes per) throws Exception {
        //Declaramos la clase PersonaDAO
        PersonaDAO Conexion;

        try {
            Conexion = new PersonaDAO();
            Conexion.eliminarCliente(per);
       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Eliminación Exitosa","ok :"));
            this.listar();
        } catch (Exception e) {
       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Parese que a habido un error","Detalles :"+e.getMessage()));     
            throw e;
        }
    }
}
