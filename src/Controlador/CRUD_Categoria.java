
package Controlador;
import Controlador_Conexion_DB.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author diedr
 */
public class CRUD_Categoria {
     public final Conexion con = new Conexion();
    public  final Connection cn = (Connection) con.conectar();
    
    public DefaultTableModel mostrarDatos() {
    ResultSet rs;
    DefaultTableModel modelo;
    String[] titulos = {"Id_Categoria", "Nombre_Categoria", "Descripcion"};
    String[] registro = new String[3];

    modelo = new DefaultTableModel(null, titulos);

    try {
        CallableStatement cbstc = cn.prepareCall("{call ConsultarDatosCategoria}");
        rs = cbstc.executeQuery();

        while (rs.next()) {
            registro[0] = rs.getString("Id_Categoria");
            registro[1] = rs.getString("Nombre_Categoria");
            registro[2] = rs.getString("Descripcion");

            modelo.addRow(registro);
        }
        return modelo;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
}

public DefaultTableModel buscarDatos(String dato) {
    ResultSet rs;
    DefaultTableModel modelo;

    String[] titulos = {"Id_Categoria", "Nombre_Categoria", "Descripcion"};
    String[] registro = new String[3];

    modelo = new DefaultTableModel(null, titulos);

    try {
        CallableStatement call = cn.prepareCall("{call BuscarCategoria(?)}");
        call.setString(1, dato);
        rs = call.executeQuery();

        while (rs.next()) {
            registro[0] = rs.getString("Id_Categoria");
            registro[1] = rs.getString("Nombre_Categoria");
            registro[2] = rs.getString("Descripcion");

            modelo.addRow(registro);
        }
        return modelo;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
}

public boolean verificarDatos(String dato) {
    ResultSet rs;

    try {
        CallableStatement call = cn.prepareCall("{call BuscarCategoria(?)}");
        call.setString(1, dato);
        rs = call.executeQuery();

        return rs.next();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
        return false;
    }
}

public void Guardar(Clase_Categoria categoria) {
    try {
        CallableStatement cbst = cn.prepareCall("{call InsertarCategoria(?,?)}");
        cbst.setInt(1, categoria.getId_Categoria());
        cbst.setString(2, categoria.getNombre_Categoria());
        cbst.setString(3, categoria.getDescripcion());
        cbst.executeUpdate();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

public void actualizar(Clase_Categoria categoria) {
    try {
        CallableStatement cbst = cn.prepareCall("{call ActualizarCategoria(?,?)}");
        cbst.setInt(1, categoria.getId_Categoria());
        cbst.setString(2, categoria.getNombre_Categoria());
        cbst.setString(3, categoria.getDescripcion());
        cbst.executeUpdate();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

public void eliminar(int Id_Categoria) {
    try {
        CallableStatement cbst = cn.prepareCall("{call EliminarCategoria(?)}");
        cbst.setInt(1, Id_Categoria);
        cbst.executeUpdate();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

}
