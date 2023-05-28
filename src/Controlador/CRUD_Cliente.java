
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
    
    public final Conexion con = new Conexion();
    public  final Connection cn = (Connection) con.conectar();
    
    
    public DefaultTableModel mostrarDatos() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"Id_Cliente", "Nombre_1", "Nombre_2", "Apellido_1", "Apellido_2", "Numero_Celular","Direccion"};
        String[] registro = new String[7];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call ConsultarDatosCliente}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("Id_Cliente");
                registro[1] = rs.getString("Nombre_1");
                registro[2] = rs.getString("Nombre_2");
                registro[3] = rs.getString("Apellido_1");
                registro[4] = rs.getString("Apellido_2");
                registro[5] = rs.getString("Numero_Celular");
                registro[6] = rs.getString("Direccion");

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

        String[] titulos = {"Id_Cliente", "Nombre_1", "Nombre_2", "Apellido_1", "Apellido_2", "Numero_Celular","Direccion"};
        String[] registro = new String[6];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement call = cn.prepareCall("{call BuscarCliente(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("Id_Cliente");
                registro[1] = rs.getString("Nombre_1");
                registro[2] = rs.getString("Nombre_2");
                registro[3] = rs.getString("Apellido_1");
                registro[4] = rs.getString("Apellido_2");
                registro[5] = rs.getString("Numero_Celular");
                registro[5] = rs.getString("Direccion");

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
            cbst.setString(5, cl.getNumero_Celular());
            cbst.setString(6, cl.getDireccion());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
      
       public void actualizar(Clase_Cliente cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call ActualizarCliente(?,?,?,?,?,?)}");
            cbst.setString(1, cl.getNombre_1());
            cbst.setString(2, cl.getNombre_2());
            cbst.setString(3, cl.getApellido_1());
            cbst.setString(4, cl.getApellido_2());
            cbst.setString(5, cl.getNumero_Celular());
            cbst.setString(6, cl.getDireccion());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
       
       
   public void eliminar(int Id_Cliente) {
    try {
        CallableStatement cbst = cn.prepareCall("{call EliminarCliente(?)}");
        cbst.setInt(1, Id_Cliente);
        cbst.executeUpdate();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

      
}
