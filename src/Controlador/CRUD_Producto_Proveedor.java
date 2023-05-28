
package Controlador;
import Controlador_Conexion_DB.Conexion;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
/* @author diedr
 */
public class CRUD_Producto_Proveedor {
    public final Conexion con = new Conexion();
    public  final Connection cn = (Connection) con.conectar();
    
    
    
    public DefaultTableModel mostrarTablaProductoProveedor() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"Id_Producto_Proveedor", "Id_Proveedor", "Id_Producto"};
        String[] registro = new String[3];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call ConsultarTablaProductoProveedor}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("Id_Producto_Proveedor");
                registro[1] = rs.getString("Id_Proveedor");
                registro[2] = rs.getString("Id_Producto");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public DefaultTableModel buscarProductoProveedor(String dato) {
        ResultSet rs;
        DefaultTableModel modelo;

        String[] titulos = {"Id_Producto_Proveedor", "Id_Proveedor", "Id_Producto"};
        String[] registro = new String[3];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement call = cn.prepareCall("{call BuscarProductoProveedor(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("Id_Producto_Proveedor");
                registro[1] = rs.getString("Id_Proveedor");
                registro[2] = rs.getString("Id_Producto");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public boolean verificarProductoProveedor(String dato) {
        ResultSet rs;

        try {
            CallableStatement call = cn.prepareCall("{call BuscarProductoProveedor(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public void guardarProductoProveedor(Class_Producto_Proveedor productoProveedor) {
        try {
            CallableStatement cbst = cn.prepareCall("{call InsertarProductoProveedor(?, ?, ?)}");
            cbst.setInt(1, productoProveedor.getId_Producto_Proveedor());
            cbst.setInt(2, productoProveedor.getId_Proveedor());
            cbst.setInt(3, productoProveedor.getId_Producto());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void actualizarProductoProveedor(Class_Producto_Proveedor productoProveedor) {
        try {
            CallableStatement cbst = cn.prepareCall("{call ActualizarProductoProveedor(?, ?, ?)}");
            cbst.setInt(1, productoProveedor.getId_Producto_Proveedor());
            cbst.setInt(2, productoProveedor.getId_Proveedor());
            cbst.setInt(3, productoProveedor.getId_Producto());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void eliminarProductoProveedor(int Id_Producto_Proveedor) {
        try {
            CallableStatement cbst = cn.prepareCall("{call EliminarProductoProveedor(?)}");
            cbst.setInt(1, Id_Producto_Proveedor);
            cbst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}

