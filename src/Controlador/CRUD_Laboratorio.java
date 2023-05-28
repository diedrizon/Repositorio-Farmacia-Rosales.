
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
public class CRUD_Laboratorio {
    public final Conexion con = new Conexion();
    public  final Connection cn = (Connection) con.conectar();
    
    
    
    public DefaultTableModel mostrarDatos() {
    ResultSet rs;
    DefaultTableModel modelo;
    String[] titulos = {"Id_Laboratorio", "Nombre"};
    String[] registro = new String[2];

    modelo = new DefaultTableModel(null, titulos);

    try {
        CallableStatement cbstc = cn.prepareCall("{call ConsultarDatosLaboratorio}");
        rs = cbstc.executeQuery();

        while (rs.next()) {
            registro[0] = rs.getString("Id_Laboratorio");
            registro[1] = rs.getString("Nombre");

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

    String[] titulos = {"Id_Laboratorio", "Nombre"};
    String[] registro = new String[2];

    modelo = new DefaultTableModel(null, titulos);

    try {
        CallableStatement call = cn.prepareCall("{call BuscarLaboratorio(?)}");
        call.setString(1, dato);
        rs = call.executeQuery();

        while (rs.next()) {
            registro[0] = rs.getString("Id_Laboratorio");
            registro[1] = rs.getString("Nombre");

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
        CallableStatement call = cn.prepareCall("{call BuscarLaboratorio(?)}");
        call.setString(1, dato);
        rs = call.executeQuery();

        return rs.next();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
        return false;
    }
}

public void Guardar(Clase_Laboratorio laboratorio) {
    try {
        CallableStatement cbst = cn.prepareCall("{call InsertarLaboratorio(?,?)}");
        cbst.setInt(1, laboratorio.getId_Laboratorio());
        cbst.setString(2, laboratorio.getNombre());
        cbst.executeUpdate();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

public void actualizar(Clase_Laboratorio laboratorio) {
    try {
        CallableStatement cbst = cn.prepareCall("{call ActualizarLaboratorio(?,?)}");
        cbst.setInt(1, laboratorio.getId_Laboratorio());
        cbst.setString(2, laboratorio.getNombre());
        cbst.executeUpdate();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

public void eliminar(int Id_Laboratorio) {
    try {
        CallableStatement cbst = cn.prepareCall("{call EliminarLaboratorio(?)}");
        cbst.setInt(1, Id_Laboratorio);
        cbst.executeUpdate();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

}
