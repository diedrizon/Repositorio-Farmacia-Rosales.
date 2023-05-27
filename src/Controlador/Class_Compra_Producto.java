
package Controlador;

/** @author diedr
 */
public class Class_Compra_Producto {
   int Id_compra_producto;
   int Id_compra;
   int Id_produc;

    public Class_Compra_Producto(int Id_compra_producto, int Id_compra, int Id_produc) {
        this.Id_compra_producto = Id_compra_producto;
        this.Id_compra = Id_compra;
        this.Id_produc = Id_produc;
    }

    public int getId_compra_producto() {
        return Id_compra_producto;
    }

    public void setId_compra_producto(int Id_compra_producto) {
        this.Id_compra_producto = Id_compra_producto;
    }

    public int getId_compra() {
        return Id_compra;
    }

    public void setId_compra(int Id_compra) {
        this.Id_compra = Id_compra;
    }

    public int getId_produc() {
        return Id_produc;
    }

    public void setId_produc(int Id_produc) {
        this.Id_produc = Id_produc;
    }
}
