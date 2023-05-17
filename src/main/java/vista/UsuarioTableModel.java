/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Usuario;

/**
 *
 * @author daw1
 */
public class UsuarioTableModel extends AbstractTableModel {

    private List<Usuario> usuarios;
    private String[] columnas;

    public UsuarioTableModel() {
        this.usuarios = new ArrayList<>();
        this.columnas = new String[]{"NOMBRE","EMAIL","ROL","FECHA ALTA","ULTIMO ACCESO","ACTIVO"};
    }

    public void setUsuarios(List<Usuario> usuarios){
        this.usuarios = usuarios;
    }

    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario c = usuarios.get(rowIndex);
        Object o = null;
        switch (columnIndex) {
            case 0:
                o = c.getNombre();
                break;
            case 1:
                o = c.getEmail();
                break;
            case 2:                
                o = c.getRol();                
                break;
            case 3:
                o = c.getFechaAlta();
                break;
            case 4:
                o = c.getUltimoAcceso();
                break;
            case 5:
                o = c.isActivo();
                break;
        }
        return o;
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return false;
    }

    @Override
    public Class<?> getColumnClass(int col) {
        Class<?> clase = null;
        switch (col) {
            case 0:
                clase = String.class;
                break;
            case 1:
                clase = String.class;
                break;
            case 2:
                clase = Float.class;
                break;
            case 3:
                clase = Float.class;
                break;
            case 4:
                clase = Integer.class;
                break;
            case 5:
                clase = String.class;
                break;
            
        }
        return clase;
    }

    @Override
    public String getColumnName(int col) {
        return columnas[col];
    }
    
    public void setValueAt(Object o, int row, int col){
        
    }

    
}
