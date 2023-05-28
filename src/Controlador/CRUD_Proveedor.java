  
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
public class CRUD_Proveedor {
    
    private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();
    
    public DefaultTableModel mostrarDatos() {
    ResultSet rs;
    DefaultTableModel modelo;
    String[] titulos = {"Id_Proveedor", "Nombre_1", "Nombre_2", "Apellido_1", "Apellido_2", "Gmail", "Numero_Celular", "Direccion"};
    String[] registro = new String[8];

    modelo = new DefaultTableModel(null, titulos);

    try {
        CallableStatement cbstc = cn.prepareCall("{call ConsultarDatosProveedor}");
        rs = cbstc.executeQuery();

        while (rs.next()) {
            registro[0] = rs.getString("Id_Proveedor");
            registro[1] = rs.getString("Nombre_1");
            registro[2] = rs.getString("Nombre_2");
            registro[3] = rs.getString("Apellido_1");
            registro[4] = rs.getString("Apellido_2");
            registro[5] = rs.getString("Gmail");
            registro[6] = rs.getString("Numero_Celular");
            registro[7] = rs.getString("Direccion");

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

    String[] titulos = {"Id_Proveedor", "Nombre_1", "Nombre_2", "Apellido_1", "Apellido_2", "Gmail", "Numero_Celular", "Direccion"};
    String[] registro = new String[8];

    modelo = new DefaultTableModel(null, titulos);

    try {
        CallableStatement call = cn.prepareCall("{call BuscarProveedor(?)}");
        call.setString(1, dato);
        rs = call.executeQuery();

        while (rs.next()) {
            registro[0] = rs.getString("Id_Proveedor");
            registro[1] = rs.getString("Nombre_1");
            registro[2] = rs.getString("Nombre_2");
            registro[3] = rs.getString("Apellido_1");
            registro[4] = rs.getString("Apellido_2");
            registro[5] = rs.getString("Gmail");
            registro[6] = rs.getString("Numero_Celular");
            registro[7] = rs.getString("Direccion");

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
        CallableStatement call = cn.prepareCall("{call BuscarProveedor(?)}");
        call.setString(1, dato);
        rs = call.executeQuery();

        return rs.next();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
        return false;
    }
}

public void Guardar(Clase_Proveedor proveedor) {
    try {
        CallableStatement cbst = cn.prepareCall("{call InsertarProveedor(?,?,?,?,?,?,?,?)}");
        cbst.setInt(1, proveedor.getId_Proveedor());
        cbst.setString(2, proveedor.getNombre_1());
        cbst.setString(3, proveedor.getNombre_2());
        cbst.setString(4, proveedor.getApellido_1());
        cbst.setString(5, proveedor.getApellido_2());
        cbst.setString(6, proveedor.getGmail());
        cbst.setString(7, proveedor.getNumero_Celular());
        cbst.setString(8, proveedor.getDireccion());
        cbst.executeUpdate();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

public void actualizar(Clase_Proveedor proveedor) {
    try {
        CallableStatement cbst = cn.prepareCall("{call ActualizarProveedor(?,?,?,?,?,?,?,?)}");
        cbst.setInt(1, proveedor.getId_Proveedor());
        cbst.setString(2, proveedor.getNombre_1());
        cbst.setString(3, proveedor.getNombre_2());
        cbst.setString(4, proveedor.getApellido_1());
        cbst.setString(5, proveedor.getApellido_2());
        cbst.setString(6, proveedor.getGmail());
        cbst.setString(7, proveedor.getNumero_Celular());
        cbst.setString(8, proveedor.getDireccion());
        cbst.executeUpdate();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

public void eliminar(int Id_Proveedor) {
    try {
        CallableStatement cbst = cn.prepareCall("{call EliminarProveedor(?)}");
        cbst.setInt(1, Id_Proveedor);
        cbst.executeUpdate();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

    
}
