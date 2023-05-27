
package Controlador;

/** @author diedr
 */
public class Class_Compra_Producto {
   int Id_Compra_Producto;
   int Id_Compra;
   int Id_Producto;

    public Class_Compra_Producto(int Id_Compra_Producto, int Id_Compra, int Id_Producto) {
        this.Id_Compra_Producto = Id_Compra_Producto;
        this.Id_Compra = Id_Compra;
        this.Id_Producto = Id_Producto;
    }

    public int getId_Compra_Producto() {
        return Id_Compra_Producto;
    }

    public void setId_Compra_Producto(int Id_Compra_Producto) {
        this.Id_Compra_Producto = Id_Compra_Producto;
    }

    public int getId_Compra() {
        return Id_Compra;
    }

    public void setId_Compra(int Id_Compra) {
        this.Id_Compra = Id_Compra;
    }

    public int getId_Producto() {
        return Id_Producto;
    }

    public void setId_Producto(int Id_Producto) {
        this.Id_Producto = Id_Producto;
    }

}
