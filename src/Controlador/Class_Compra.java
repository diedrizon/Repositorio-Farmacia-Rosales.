
package Controlador;

import java.sql.Date;

/** @author diedr
 */
public class Class_Compra {
    int Id_Compra;
    java.sql.Date Fecha_Compra;
    int Id_Proveedor;

    public Class_Compra(int Id_Compra, Date Fecha_Compra, int Id_Proveedor) {
        this.Id_Compra = Id_Compra;
        this.Fecha_Compra = Fecha_Compra;
        this.Id_Proveedor = Id_Proveedor;
    }

    public int getId_Compra() {
        return Id_Compra;
    }

    public void setId_Compra(int Id_Compra) {
        this.Id_Compra = Id_Compra;
    }

    public Date getFecha_Compra() {
        return Fecha_Compra;
    }

    public void setFecha_Compra(Date Fecha_Compra) {
        this.Fecha_Compra = Fecha_Compra;
    }

    public int getId_Proveedor() {
        return Id_Proveedor;
    }

    public void setId_Proveedor(int Id_Proveedor) {
        this.Id_Proveedor = Id_Proveedor;
    }

}
