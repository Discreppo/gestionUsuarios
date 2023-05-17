/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;

/**
 *
 * @author daw1
 */
public class UsuarioDaoJdbc implements UsuarioDao {

    private ConexionBD conexionBD;

    public UsuarioDaoJdbc(ConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }

    public ConexionBD getConexionBD() {
        return conexionBD;
    }

    public void setConexionBD(ConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }

    
    @Override
    public List<Usuario> listar(){
        List<Usuario> listado = null;/*
        try ( Connection con = conexionBD.getConnection();  PreparedStatement ps = con.prepareStatement("SELECT * FROM cuenta");  ResultSet rs = ps.executeQuery();) {
            listado = new ArrayList<>();
            while (rs.next()) {
                listado.add(new Usuario(rs.getString("codigo"), Dni.valueOf(rs.getString("titular")), rs.getFloat("saldo")));
            }

        } catch (SQLException ex) {
            throw new DaoException(ex.getMessage());        
        }*/
        return listado;

    }

    @Override
    public boolean insertar(Usuario usuario) {
        boolean n = false;/*
        try ( Connection con = conexionBD.getConnection();  PreparedStatement ps = con.prepareStatement("INSERT INTO cuenta VALUES (?,?,?) ");) {
            for (Cuenta c : listado) {
                ps.setString(1, c.getCodigo());
                ps.setString(2, c.getTitular().toString());
                ps.setFloat(3, c.getSaldo());
                n += ps.executeUpdate();
            }
        } catch (SQLException ex) {
            throw new DaoException(ex.getMessage());
        }*/
        return n;

    }

   
    @Override
    public Usuario buscar(String nombre) {
        String consulta = "SELECT * FROM cuenta WHERE codigo=?";
        Usuario u = null;/*
        try ( Connection con = conexionBD.getConnection();  PreparedStatement ps = con.prepareStatement(consulta);) {
            ps.setString(1, codigo);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                c = new Cuenta(rs.getString("codigo"), Dni.valueOf(rs.getString("titular")), rs.getFloat("saldo"));
            }
        } catch (SQLException ex) {
            throw new DaoException(ex.getMessage());
        } catch (DniException ex) {
            Logger.getLogger(UsuarioDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        return u;

    }

    @Override
    public boolean borrar(String nombre) {
        boolean n = false;/*
        try ( Connection con = conexionBD.getConnection();  PreparedStatement ps = con.prepareStatement(
                "DELETE FROM cuenta WHERE codigo =  ?");) {
            ps.setString(1, codigo);
            n = ps.executeUpdate();

        } catch (SQLException ex) {
            throw new DaoException(ex.getMessage());
        }*/
        return n;

    }

    @Override
    public boolean modificar(Usuario u) {
        boolean n = false;/*
        try ( Connection con = conexionBD.getConnection();  PreparedStatement ps = con.prepareStatement(
                "UPDATE cuenta SET saldo=? WHERE codigo =  ? ");) {
            ps.setString(2, c.getCodigo());
            ps.setFloat(1, c.getSaldo());
            n = ps.executeUpdate();
        } catch (SQLException ex) {
            throw new DaoException(ex.getMessage());
        }*/
        return n;
    }
}
