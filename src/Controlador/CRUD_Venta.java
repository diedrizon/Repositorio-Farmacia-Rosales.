
package Controlador;
import Controlador_Conexion_DB.Conexion;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author diedr
 */
public class CRUD_Venta {
    public final Conexion con = new Conexion();
    public  final Connection cn = (Connection) con.conectar();
    
    
    public DefaultTableModel mostrarDatosVenta() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"Id_Venta", "Fecha_Hora", "Id_Cliente", "Id_Empleado"};
        String[] registro = new String[4];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call ConsultarDatosVenta}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("Id_Venta");
                registro[1] = rs.getString("Fecha_Hora");
                registro[2] = rs.getString("Id_Cliente");
                registro[3] = rs.getString("Id_Empleado");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public DefaultTableModel buscarDatosVenta(String dato) {
        ResultSet rs;
        DefaultTableModel modelo;

        String[] titulos = {"Id_Venta", "Fecha_Hora", "Id_Cliente", "Id_Empleado"};
        String[] registro = new String[4];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement call = cn.prepareCall("{call BuscarVenta(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("Id_Venta");
                registro[1] = rs.getString("Fecha_Hora");
                registro[2] = rs.getString("Id_Cliente");
                registro[3] = rs.getString("Id_Empleado");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public boolean verificarDatosVenta(String dato) {
        ResultSet rs;

        try {
            CallableStatement call = cn.prepareCall("{call BuscarVenta(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public void insertarVenta(Clase_Venta venta) {
        try {
            CallableStatement cbst = cn.prepareCall("{call InsertarVenta(?, ?, ?, ?)}");
            cbst.setInt(1, venta.getId_Venta());
            cbst.setObject(2, venta.getFecha_Hora());
            cbst.setInt(3, venta.getId_Cliente());
            cbst.setInt(4, venta.getId_Empleado());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void actualizarVenta(Clase_Venta venta) {
        try {
            CallableStatement cbst = cn.prepareCall("{call ActualizarVenta(?, ?, ?, ?)}");
            cbst.setInt(1, venta.getId_Venta());
            cbst.setObject(2, venta.getFecha_Hora());
            cbst.setInt(3, venta.getId_Cliente());
            cbst.setInt(4, venta.getId_Empleado());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void eliminarVenta(int idVenta) {
        try {
            CallableStatement cbst = cn.prepareCall("{call EliminarVenta(?)}");
            cbst.setInt(1, idVenta);
            cbst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }


}
