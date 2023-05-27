
package Controlador;

import java.sql.Date;

/** @author diedr
 */
public class Class_Compra {
    int Id_compra;
    java.sql.Date fecha_compra;
    int Id_proveed;

    public Class_Compra(int Id_compra, Date fecha_compra, int Id_proveed) {
        this.Id_compra = Id_compra;
        this.fecha_compra = fecha_compra;
        this.Id_proveed = Id_proveed;
    }

    public int getId_compra() {
        return Id_compra;
    }

    public void setId_compra(int Id_compra) {
        this.Id_compra = Id_compra;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public int getId_proveed() {
        return Id_proveed;
    }

    public void setId_proveed(int Id_proveed) {
        this.Id_proveed = Id_proveed;
    }
}
