
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
public class CRUD_Presentacion {
    public final Conexion con = new Conexion();
    public  final Connection cn = (Connection) con.conectar();
    
    
    
    public DefaultTableModel mostrarDatos() {
    ResultSet rs;
    DefaultTableModel modelo;
    String[] titulos = {"Id_Presentacion", "Nombre_Presentacion", "Detalle"};
    String[] registro = new String[3];

    modelo = new DefaultTableModel(null, titulos);

    try {
        CallableStatement cbstc = cn.prepareCall("{call ConsultarDatosPresentacion}");
        rs = cbstc.executeQuery();

        while (rs.next()) {
            registro[0] = rs.getString("Id_Presentacion");
            registro[1] = rs.getString("Nombre_Presentacion");
            registro[2] = rs.getString("Detalle");

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

    String[] titulos = {"Id_Presentacion", "Nombre_Presentacion", "Detalle"};
    String[] registro = new String[3];

    modelo = new DefaultTableModel(null, titulos);

    try {
        CallableStatement call = cn.prepareCall("{call BuscarPresentacion(?)}");
        call.setString(1, dato);
        rs = call.executeQuery();

        while (rs.next()) {
            registro[0] = rs.getString("Id_Presentacion");
            registro[1] = rs.getString("Nombre_Presentacion");
            registro[2] = rs.getString("Detalle");

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
        CallableStatement call = cn.prepareCall("{call BuscarPresentacion(?)}");
        call.setString(1, dato);
        rs = call.executeQuery();

        return rs.next();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
        return false;
    }
}

public void Guardar(Clase_Presentacion presentacion) {
    try {
        CallableStatement cbst = cn.prepareCall("{call InsertarPresentacion(?,?,?)}");
        cbst.setInt(1, presentacion.getId_Presentacion());
        cbst.setString(2, presentacion.getNombre_Presentacion());
        cbst.setString(3, presentacion.getDetalle());
        cbst.executeUpdate();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

public void actualizar(Clase_Presentacion presentacion) {
    try {
        CallableStatement cbst = cn.prepareCall("{call ActualizarPresentacion(?,?,?)}");
        cbst.setInt(1, presentacion.getId_Presentacion());
        cbst.setString(2, presentacion.getNombre_Presentacion());
        cbst.setString(3, presentacion.getDetalle());
        cbst.executeUpdate();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

public void eliminar(int Id_Presentacion) {
    try {
        CallableStatement cbst = cn.prepareCall("{call EliminarPresentacion(?)}");
        cbst.setInt(1, Id_Presentacion);
        cbst.executeUpdate();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

}
