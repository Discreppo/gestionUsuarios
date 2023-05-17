/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import modelo.DaoException;
import modelo.Usuario;
import modelo.UsuarioDao;
import vista.VentanaUsuarios;

/**
 *
 * @author daw1
 */
public class ControladorUsuarios {
    
    private VentanaUsuarios ventana;
    private UsuarioDao usuarioDao;

    public ControladorUsuarios(VentanaUsuarios ventana, UsuarioDao usuarioDao) {
        this.ventana = ventana;
        this.usuarioDao = usuarioDao;
    }

    public ControladorUsuarios() {
        
    }

    
    public void crear(){
    
    }
    public void editar(){
    
    }
    public void borrar(){
    
    }
    public void buscar() throws DaoException{/*
        String nombre = ventana.getNombre();
        Usuario u = Usuario.getNombre(nombre);
        if (c != null) {
            vista.mostrarTitular(c.getTitular().toString());
            vista.mostrarSaldo(c.getSaldo());
        } else {
            vista.mostrarMensaje("no existe una cuenta con ese codigo");
        }*/
    }
    public void listar(){
        ventana.mostrarUsuarios(usuarioDao.listar()); 
    }
    public void exportar(){
    
    }
    public void importar(){
    
    }
    
    
    
    public VentanaUsuarios getVentana() {
        return ventana;
    }
    
    public void setVentana(VentanaUsuarios ventana) {
        this.ventana = ventana;
    }
    
    public UsuarioDao getUsuarioDao() {
        return usuarioDao;
    }
    
    public void setUsuarioDao(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }

    public void iniciar() {
        ventana.mostrar();
        
    }

}
