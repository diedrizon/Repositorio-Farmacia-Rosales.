
package Controlador;

/**
 *
 * @author diedr
 */
public class Class_Producto_Presentacion {
    int Id_produc_present;
    float precio_producto_present;
    int Id_presentacion;
    int Id_produc;

    public Class_Producto_Presentacion(int Id_produc_present, float precio_producto_present, int Id_presentacion, int Id_produc) {
        this.Id_produc_present = Id_produc_present;
        this.precio_producto_present = precio_producto_present;
        this.Id_presentacion = Id_presentacion;
        this.Id_produc = Id_produc;
    }

    public int getId_produc_present() {
        return Id_produc_present;
    }

    public void setId_produc_present(int Id_produc_present) {
        this.Id_produc_present = Id_produc_present;
    }

    public float getPrecio_producto_present() {
        return precio_producto_present;
    }

    public void setPrecio_producto_present(float precio_producto_present) {
        this.precio_producto_present = precio_producto_present;
    }

    public int getId_presentacion() {
        return Id_presentacion;
    }

    public void setId_presentacion(int Id_presentacion) {
        this.Id_presentacion = Id_presentacion;
    }

    public int getId_produc() {
        return Id_produc;
    }

    public void setId_produc(int Id_produc) {
        this.Id_produc = Id_produc;
    }
}
