
package Controlador;
import Controlador_Conexion_DB.Conexion;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import Controlador.Class_Compra;
/**
 *
 * @author diedr
 */
public class CRUD_Compra {
    public final Conexion con = new Conexion();
    public  final Connection cn = (Connection) con.conectar(); 
    
    public DefaultTableModel mostrarDatosCompra() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"Id_Compra", "Fecha_Compra", "Id_Proveedor"};
        String[] registro = new String[3];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call ConsultarDatosCompra}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("Id_Compra");
                registro[1] = rs.getString("Fecha_Compra");
                registro[2] = rs.getString("Id_Proveedor");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public DefaultTableModel buscarCompra(String dato) {
        ResultSet rs;
        DefaultTableModel modelo;

        String[] titulos = {"Id_Compra", "Fecha_Compra", "Id_Proveedor"};
        String[] registro = new String[3];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement call = cn.prepareCall("{call BuscarCompra(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("Id_Compra");
                registro[1] = rs.getString("Fecha_Compra");
                registro[2] = rs.getString("Id_Proveedor");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public boolean verificarCompra(String dato) {
        ResultSet rs;

        try {
            CallableStatement call = cn.prepareCall("{call BuscarCompra(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public void guardarCompra(Class_Compra compra) {
        try {
            CallableStatement cbst = cn.prepareCall("{call InsertarCompra(?, ?, ?)}");
            cbst.setInt(1, compra.getId_Compra());
            cbst.setDate(2, compra.getFecha_Compra());
            cbst.setInt(3, compra.getId_Proveedor());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void actualizarCompra(Class_Compra compra) {
        try {
            CallableStatement cbst = cn.prepareCall("{call ActualizarCompra(?, ?, ?)}");
            cbst.setInt(1, compra.getId_Compra());
            cbst.setDate(2, compra.getFecha_Compra());
            cbst.setInt(3, compra.getId_Proveedor());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void eliminarCompra(int Id_Compra) {
        try {
            CallableStatement cbst = cn.prepareCall("{call EliminarCompra(?)}");
            cbst.setInt(1, Id_Compra);
            cbst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // ...
}


