  
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
        String[] titulos = {"Cédula", "Nombres", "Apellidos", "Sobrenombre", "Telefono", "Dirección"};
        String[] registro = new String[6];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call ConsultarDatosVenta}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("cedula");
                registro[1] = rs.getString("nombres");
                registro[2] = rs.getString("apellidos");
                registro[3] = rs.getString("sobrenombre");
                registro[4] = rs.getString("telefono");
                registro[5] = rs.getString("direccion");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
    
    
}
