
package Controlador;

import Controlador_Conexion_DB.Conexion;
import java.sql.Blob;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.sql.rowset.serial.SerialBlob;

/**
 *
 * @author diedr
 */
public class CRUD_Producto {
    public final Conexion con = new Conexion();
    public  final Connection cn = (Connection) con.conectar();
    
    
    
    public DefaultTableModel mostrarDatos() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"Id_Producto", "Nombre", "Descripcion", "Cantidad_Producto", "Precio_Compra", "Precio_Venta", "Imagen_Producto", "Fecha_Caducidad", "Id_Categoria", "Id_Presentacion", "Id_Laboratorio"};
        String[] registro = new String[11];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call ConsultarDatosProducto}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("Id_Producto");
                registro[1] = rs.getString("Nombre");
                registro[2] = rs.getString("Descripcion");
                registro[3] = rs.getString("Cantidad_Producto");
                registro[4] = rs.getString("Precio_Compra");
                registro[5] = rs.getString("Precio_Venta");

                // Obtener la imagen del campo IMAGE y convertirlo a una representación adecuada (por ejemplo, una cadena Base64)
                Blob imagenBlob = rs.getBlob("Imagen_Producto");
                byte[] imagenBytes = imagenBlob.getBytes(1, (int) imagenBlob.length());
                String imagenBase64 = Base64.getEncoder().encodeToString(imagenBytes);
                registro[6] = imagenBase64;

                registro[7] = rs.getString("Fecha_Caducidad");
                registro[8] = rs.getString("Id_Categoria");
                registro[9] = rs.getString("Id_Presentacion");
                registro[10] = rs.getString("Id_Laboratorio");

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
    String[] titulos = {"Id_Producto", "Nombre", "Descripcion", "Cantidad_Producto", "Precio_Compra", "Precio_Venta", "Imagen_Producto", "Fecha_Caducidad", "Id_Categoria", "Id_Presentacion", "Id_Laboratorio"};
    String[] registro = new String[11];

    modelo = new DefaultTableModel(null, titulos);

    try {
        CallableStatement cbstc = cn.prepareCall("{call BuscarDatosProducto(?)}");
        cbstc.setString(1, dato);
        rs = cbstc.executeQuery();

        while (rs.next()) {
            registro[0] = rs.getString("Id_Producto");
            registro[1] = rs.getString("Nombre");
            registro[2] = rs.getString("Descripcion");
            registro[3] = rs.getString("Cantidad_Producto");
            registro[4] = rs.getString("Precio_Compra");
            registro[5] = rs.getString("Precio_Venta");

            // Obtener la imagen del campo IMAGE y convertirlo a una representación adecuada (por ejemplo, una cadena Base64)
            Blob imagenBlob = rs.getBlob("Imagen_Producto");
            byte[] imagenBytes = imagenBlob.getBytes(1, (int) imagenBlob.length());
            String imagenBase64 = Base64.getEncoder().encodeToString(imagenBytes);
            registro[6] = imagenBase64;

            registro[7] = rs.getString("Fecha_Caducidad");
            registro[8] = rs.getString("Id_Categoria");
            registro[9] = rs.getString("Id_Presentacion");
            registro[10] = rs.getString("Id_Laboratorio");

            modelo.addRow(registro);
        }
        return modelo;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
        return null;
    }

    }

    public boolean verificarDatos(String dato) {
       try {
        CallableStatement cbstc = cn.prepareCall("{call VerificarDatosProducto(?)}");
        cbstc.setString(1, dato);
        ResultSet rs = cbstc.executeQuery();
        return rs.next(); // Devuelve true si existe al menos un registro que cumple la condición
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
        return false;
    }
    }

    public void guardarImagenProducto(String nombreTabla, String columnaImagen, String rutaImagen, Clase_Producto producto) {
        try {
            File imagenFile = new File(rutaImagen);
            FileInputStream fis = new FileInputStream(imagenFile);

            CallableStatement cstmt = cn.prepareCall("{call InsertarProducto(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
            cstmt.setInt(1, producto.getId_Producto());
            cstmt.setString(2, producto.getNombre());
            cstmt.setString(3, producto.getDescripcion());
            cstmt.setInt(4, producto.getCantidad_Producto());
            cstmt.setFloat(5, producto.getPrecio_Compra());
            cstmt.setFloat(6, producto.getPrecio_Venta());
            cstmt.setBinaryStream(7, fis, (int) imagenFile.length());
            cstmt.setDate(8, producto.getFecha_Caducidad());
            cstmt.setInt(9, producto.getId_Categoria());
            cstmt.setInt(10, producto.getId_Presentacion());
            cstmt.setInt(11, producto.getId_Laboratorio());
            cstmt.executeUpdate();

            fis.close();
        } catch (SQLException | IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void actualizarProducto(Clase_Producto producto, String rutaNuevaImagen) {
        try {
            // Obtén el ID del producto
            int idProducto = producto.getId_Producto();

            // Verifica si se ha seleccionado una nueva imagen
            if (!rutaNuevaImagen.isEmpty()) {
                // Carga la nueva imagen desde la ruta
                File imagenFile = new File(rutaNuevaImagen);
                FileInputStream fis = new FileInputStream(imagenFile);

                // Actualiza la imagen y los demás campos del producto en la base de datos
                CallableStatement cstmt = cn.prepareCall("{call ActualizarProductoConImagen(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
                cstmt.setInt(1, idProducto);
                cstmt.setString(2, producto.getNombre());
                cstmt.setString(3, producto.getDescripcion());
                cstmt.setInt(4, producto.getCantidad_Producto());
                cstmt.setFloat(5, producto.getPrecio_Compra());
                cstmt.setFloat(6, producto.getPrecio_Venta());
                cstmt.setBinaryStream(7, fis, (int) imagenFile.length());
                cstmt.setDate(8, producto.getFecha_Caducidad());
                cstmt.setInt(9, producto.getId_Categoria());
                cstmt.setInt(10, producto.getId_Presentacion());
                cstmt.setInt(11, producto.getId_Laboratorio());
                cstmt.executeUpdate();

                fis.close();
            } else {
                // No se seleccionó una nueva imagen, solo actualiza los demás campos del producto en la base de datos
                CallableStatement cstmt = cn.prepareCall("{call ActualizarProductoSinImagen(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
                cstmt.setInt(1, idProducto);
                cstmt.setString(2, producto.getNombre());
                cstmt.setString(3, producto.getDescripcion());
                cstmt.setInt(4, producto.getCantidad_Producto());
                cstmt.setFloat(5, producto.getPrecio_Compra());
                cstmt.setFloat(6, producto.getPrecio_Venta());
                cstmt.setDate(7, producto.getFecha_Caducidad());
                cstmt.setInt(8, producto.getId_Categoria());
                cstmt.setInt(9, producto.getId_Presentacion());
                cstmt.setInt(10, producto.getId_Laboratorio());
                cstmt.executeUpdate();
            }
        } catch (SQLException | IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void eliminarProducto(int idProducto) {
        try {
            CallableStatement cstmt = cn.prepareCall("{call EliminarProducto(?)}");
            cstmt.setInt(1, idProducto);
            cstmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

  
}



