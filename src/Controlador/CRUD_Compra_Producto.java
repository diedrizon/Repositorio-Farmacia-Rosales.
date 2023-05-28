
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
public class CRUD_Compra_Producto {
    public final Conexion con = new Conexion();
    public  final Connection cn = (Connection) con.conectar();
    
    
     public DefaultTableModel mostrarDatosCompraProducto() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"Id_Compra_Producto", "Id_Compra", "Id_Producto"};
        String[] registro = new String[3];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call ConsultarDatosCompraProducto}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("Id_Compra_Producto");
                registro[1] = rs.getString("Id_Compra");
                registro[2] = rs.getString("Id_Producto");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public DefaultTableModel buscarCompraProducto(String dato) {
        ResultSet rs;
        DefaultTableModel modelo;

        String[] titulos = {"Id_Compra_Producto", "Id_Compra", "Id_Producto"};
        String[] registro = new String[3];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement call = cn.prepareCall("{call BuscarCompraProducto(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("Id_Compra_Producto");
                registro[1] = rs.getString("Id_Compra");
                registro[2] = rs.getString("Id_Producto");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public boolean verificarCompraProducto(String dato) {
        ResultSet rs;

        try {
            CallableStatement call = cn.prepareCall("{call BuscarCompraProducto(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public void guardarCompraProducto(Class_Compra_Producto compraProducto) {
        try {
            CallableStatement cbst = cn.prepareCall("{call InsertarCompraProducto(?, ?, ?)}");
            cbst.setInt(1, compraProducto.getId_Compra_Producto());
            cbst.setInt(2, compraProducto.getId_Compra());
            cbst.setInt(3, compraProducto.getId_Producto());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void actualizarCompraProducto(Class_Compra_Producto compraProducto) {
        try {
            CallableStatement cbst = cn.prepareCall("{call ActualizarCompraProducto(?, ?, ?)}");
            cbst.setInt(1, compraProducto.getId_Compra_Producto());
            cbst.setInt(2, compraProducto.getId_Compra());
            cbst.setInt(3, compraProducto.getId_Producto());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void eliminarCompraProducto(int Id_Compra_Producto) {
        try {
            CallableStatement cbst = cn.prepareCall("{call EliminarCompraProducto(?)}");
            cbst.setInt(1, Id_Compra_Producto);
            cbst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }


}

