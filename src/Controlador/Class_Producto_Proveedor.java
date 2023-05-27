
package Controlador;

/**
 *
 * @author diedr
 */
public class Class_Producto_Proveedor {
    int Id_Producto_Proveedor;
    int Id_Proveedor;
    int Id_Producto;

    public Class_Producto_Proveedor(int Id_Producto_Proveedor, int Id_Proveedor, int Id_Producto) {
        this.Id_Producto_Proveedor = Id_Producto_Proveedor;
        this.Id_Proveedor = Id_Proveedor;
        this.Id_Producto = Id_Producto;
    }

    public int getId_Producto_Proveedor() {
        return Id_Producto_Proveedor;
    }

    public void setId_Producto_Proveedor(int Id_Producto_Proveedor) {
        this.Id_Producto_Proveedor = Id_Producto_Proveedor;
    }

    public int getId_Proveedor() {
        return Id_Proveedor;
    }

    public void setId_Proveedor(int Id_Proveedor) {
        this.Id_Proveedor = Id_Proveedor;
    }

    public int getId_Producto() {
        return Id_Producto;
    }

    public void setId_Producto(int Id_Producto) {
        this.Id_Producto = Id_Producto;
    }

}
