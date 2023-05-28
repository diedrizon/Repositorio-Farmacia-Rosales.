
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
public class CRUD_Empleado {
    public final Conexion con = new Conexion();
    public  final Connection cn = (Connection) con.conectar();
    
    
    public DefaultTableModel mostrarDatos() {
    ResultSet rs;
    DefaultTableModel modelo;
    String[] titulos = {"Id_Empleado", "Nombre_1", "Nombre_2", "Apellido_1", "Apellido_2", "Numero_Celular", "Gmail", "Direccion", "Hora_Entrada", "Hora_Salida"};
    String[] registro = new String[10];

    modelo = new DefaultTableModel(null, titulos);

    try {
        CallableStatement cbstc = cn.prepareCall("{call ConsultarDatosEmpleado}");
        rs = cbstc.executeQuery();

        while (rs.next()) {
            registro[0] = rs.getString("Id_Empleado");
            registro[1] = rs.getString("Nombre_1");
            registro[2] = rs.getString("Nombre_2");
            registro[3] = rs.getString("Apellido_1");
            registro[4] = rs.getString("Apellido_2");
            registro[5] = rs.getString("Numero_Celular");
            registro[6] = rs.getString("Gmail");
            registro[7] = rs.getString("Direccion");
            registro[8] = rs.getTime("Hora_Entrada").toString();
            registro[9] = rs.getTime("Hora_Salida").toString();

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

    String[] titulos = {"Id_Empleado", "Nombre_1", "Nombre_2", "Apellido_1", "Apellido_2", "Numero_Celular", "Gmail", "Direccion", "Hora_Entrada", "Hora_Salida"};
    String[] registro = new String[10];

    modelo = new DefaultTableModel(null, titulos);

    try {
        CallableStatement call = cn.prepareCall("{call BuscarEmpleado(?)}");
        call.setString(1, dato);
        rs = call.executeQuery();

        while (rs.next()) {
            registro[0] = rs.getString("Id_Empleado");
            registro[1] = rs.getString("Nombre_1");
            registro[2] = rs.getString("Nombre_2");
            registro[3] = rs.getString("Apellido_1");
            registro[4] = rs.getString("Apellido_2");
            registro[5] = rs.getString("Numero_Celular");
            registro[6] = rs.getString("Gmail");
            registro[7] = rs.getString("Direccion");
            registro[8] = rs.getTime("Hora_Entrada").toString();
            registro[9] = rs.getTime("Hora_Salida").toString();

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
        CallableStatement call = cn.prepareCall("{call BuscarEmpleado(?)}");
        call.setString(1, dato);
        rs = call.executeQuery();

        return rs.next();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
        return false;
    }
}

public void Guardar(Clase_Empleado empleado) {
    try {
        CallableStatement cbst = cn.prepareCall("{call InsertarEmpleado(?,?,?,?,?,?,?,?,?)}");
        cbst.setInt(1, empleado.getId_Empleado());
        cbst.setString(2, empleado.getNombre_1());
        cbst.setString(3, empleado.getNombre_2());
        cbst.setString(4, empleado.getApellido_1());
        cbst.setString(5, empleado.getApellido_2());
        cbst.setString(6, empleado.getNumero_Celular());
        cbst.setString(7, empleado.getGmail());
        cbst.setString(8, empleado.getDireccion());
        cbst.setTime(9, new java.sql.Time(empleado.getHora_Entrada().getTime()));
        cbst.setTime(10, new java.sql.Time(empleado.getHora_Salida().getTime()));
        cbst.executeUpdate();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

public void actualizar(Clase_Empleado empleado) {
    try {
        CallableStatement cbst = cn.prepareCall("{call ActualizarEmpleado(?,?,?,?,?,?,?,?,?)}");
        cbst.setInt(1, empleado.getId_Empleado());
        cbst.setString(2, empleado.getNombre_1());
        cbst.setString(3, empleado.getNombre_2());
        cbst.setString(4, empleado.getApellido_1());
        cbst.setString(5, empleado.getApellido_2());
        cbst.setString(6, empleado.getNumero_Celular());
        cbst.setString(7, empleado.getGmail());
        cbst.setString(8, empleado.getDireccion());
        cbst.setTime(9, new java.sql.Time(empleado.getHora_Entrada().getTime()));
        cbst.setTime(10, new java.sql.Time(empleado.getHora_Salida().getTime()));
        cbst.executeUpdate();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

public void eliminar(int Id_Empleado) {
    try {
        CallableStatement cbst = cn.prepareCall("{call EliminarEmpleado(?)}");
        cbst.setInt(1, Id_Empleado);
        cbst.executeUpdate();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

}
