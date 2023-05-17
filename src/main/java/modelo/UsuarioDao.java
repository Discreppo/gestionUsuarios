package modelo;

import java.util.List;

/**
 *
 * @author Oscar Pascual Ferrero
 */
public interface UsuarioDao {
            
    boolean insertar(Usuario usuario);
    Usuario buscar(String nombre);
    boolean modificar(Usuario usuario);
    boolean borrar(String nombre);
    List<Usuario> listar();
    
}
