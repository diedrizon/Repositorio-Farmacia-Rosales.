
package Controlador;

import java.sql.Date;

/**
 *
 * @author diedr
 */
public class Clase_Producto {
    int Id_produc;
   String nombre;
   String descripcion;
   int cantidad_producto;
   float precio_compra;
   float precio_venta;
   byte [] imagen_producto;
   java.sql.Date fecha_caduci;
   int Id_categoria;
   int Id_proveed;
   int Id_labor;

    public Clase_Producto(int Id_produc, String nombre, String descripcion, int cantidad_producto, float precio_compra, float precio_venta, byte[] imagen_producto, Date fecha_caduci, int Id_categoria, int Id_proveed, int Id_labor) {
        this.Id_produc = Id_produc;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad_producto = cantidad_producto;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.imagen_producto = imagen_producto;
        this.fecha_caduci = fecha_caduci;
        this.Id_categoria = Id_categoria;
        this.Id_proveed = Id_proveed;
        this.Id_labor = Id_labor;
    }

    public int getId_produc() {
        return Id_produc;
    }

    public void setId_produc(int Id_produc) {
        this.Id_produc = Id_produc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public float getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(float precio_compra) {
        this.precio_compra = precio_compra;
    }

    public float getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(float precio_venta) {
        this.precio_venta = precio_venta;
    }

    public byte[] getImagen_producto() {
        return imagen_producto;
    }

    public void setImagen_producto(byte[] imagen_producto) {
        this.imagen_producto = imagen_producto;
    }

    public Date getFecha_caduci() {
        return fecha_caduci;
    }

    public void setFecha_caduci(Date fecha_caduci) {
        this.fecha_caduci = fecha_caduci;
    }

    public int getId_categoria() {
        return Id_categoria;
    }

    public void setId_categoria(int Id_categoria) {
        this.Id_categoria = Id_categoria;
    }

    public int getId_proveed() {
        return Id_proveed;
    }

    public void setId_proveed(int Id_proveed) {
        this.Id_proveed = Id_proveed;
    }

    public int getId_labor() {
        return Id_labor;
    }

    public void setId_labor(int Id_labor) {
        this.Id_labor = Id_labor;
    }
   
   
}

