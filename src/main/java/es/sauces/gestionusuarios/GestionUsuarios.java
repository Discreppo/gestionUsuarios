/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package es.sauces.gestionusuarios;

import controlador.ControladorUsuarios;
import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import modelo.ConexionBD;
import modelo.UsuarioDao;
import modelo.UsuarioDaoJdbc;
import vista.VentanaUsuarios;

/**
 *
 * @author Oscar Pascual Ferrero
 */
public class GestionUsuarios {
    private static final Logger LOG = Logger.getLogger("ES.SAUCES.GESTIONUSUARIOS");
    public static void main(String[] args) throws IOException {
        ConexionBD bd= ConexionBD.getConexionBD("conexion.properties");
        UsuarioDao dao=new UsuarioDaoJdbc(bd);
        VentanaUsuarios ventana=new VentanaUsuarios();
        ControladorUsuarios controlador=new ControladorUsuarios(ventana, dao);
        ventana.setControlador(controlador);
        controlador.iniciar();
        
        LogManager.getLogManager().readConfiguration(ClassLoader.getSystemClassLoader().getResourceAsStream("mylogging.properties"));
        LOG.info("INICIO DE SESION");
    }
    
}
