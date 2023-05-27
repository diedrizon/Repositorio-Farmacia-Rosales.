
package Controlador;

import Controlador.Clase_Empleado;
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
public class CRUD_Cliente {
    
    private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();
    
    
    public DefaultTableModel mostrarDatos() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"Id_cliente", "nombre_1", "nombre_2", "apellido_1", "apellido_2", "num_celu","direccion"};
        String[] registro = new String[7];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarClientes}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("Id_cliente");
                registro[1] = rs.getString("nombre_1");
                registro[2] = rs.getString("nombre_2");
                registro[3] = rs.getString("apellido_1");
                registro[4] = rs.getString("apellido_2");
                registro[5] = rs.getString("num_celu");
                registro[5] = rs.getString("direccion");

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

        String[] titulos = {"Id_cliente", "nombre_1", "nombre_2", "apellido_1", "apellido_2", "num_celu","direccion"};
        String[] registro = new String[6];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement call = cn.prepareCall("{call BuscarCliente(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("Id_cliente");
                registro[1] = rs.getString("nombre_1");
                registro[2] = rs.getString("nombre_2");
                registro[3] = rs.getString("apellido_1");
                registro[4] = rs.getString("apellido_2");
                registro[5] = rs.getString("num_celu");
                registro[5] = rs.getString("direccion");

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
            CallableStatement call = cn.prepareCall("{call BuscarCliente(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }
       public void Guardar(Clase_Cliente cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call InsertarCliente(?,?,?,?,?,?)}");
            cbst.setString(2, cl.getNombre_1());
            cbst.setString(3, cl.getNombre_2());
            cbst.setString(4, cl.getApellido_1());
            cbst.setString(5, cl.getApellido_2());
            cbst.setString(5, cl.getNum_celu());
            cbst.setString(6, cl.getDireccion());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
      
       public void actualizar(Clase_Cliente cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call ModificarCliente(?,?,?,?,?,?)}");
            cbst.setString(1, cl.getNombre_1());
            cbst.setString(2, cl.getNombre_2());
            cbst.setString(3, cl.getApellido_1());
            cbst.setString(4, cl.getApellido_2());
            cbst.setString(5, cl.getNum_celu());
            cbst.setString(6, cl.getDireccion());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
       
       
    public void eliminar(String Id_cliente) {
        try {
            CallableStatement cbst = cn.prepareCall("{call EliminarCliente(?)}");
            cbst.setString(1, Id_cliente);
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
      
}
