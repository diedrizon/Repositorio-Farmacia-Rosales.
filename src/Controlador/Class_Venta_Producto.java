
package Controlador;

/**
 *
 * @author diedr
 */
public class Class_Venta_Producto {
   int Id_vent_prod;
   int cantidad;
   float descuento;
   int Id_venta;
   int Id_produc;

    public Class_Venta_Producto(int Id_vent_prod, int cantidad, float descuento, int Id_venta, int Id_produc) {
        this.Id_vent_prod = Id_vent_prod;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.Id_venta = Id_venta;
        this.Id_produc = Id_produc;
    }

    public int getId_vent_prod() {
        return Id_vent_prod;
    }

    public void setId_vent_prod(int Id_vent_prod) {
        this.Id_vent_prod = Id_vent_prod;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public int getId_venta() {
        return Id_venta;
    }

    public void setId_venta(int Id_venta) {
        this.Id_venta = Id_venta;
    }

    public int getId_produc() {
        return Id_produc;
    }

    public void setId_produc(int Id_produc) {
        this.Id_produc = Id_produc;
    }
}
