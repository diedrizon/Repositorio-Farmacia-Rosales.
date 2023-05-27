
package Controlador;

/**
 *
 * @author diedr
 */
public class Clase_Presentacion {

    int Id_Presentacion;
   String Nombre_Presentacion;
   String Detalle;

    public Clase_Presentacion(int Id_Presentacion, String Nombre_Presentacion, String Detalle) {
        this.Id_Presentacion = Id_Presentacion;
        this.Nombre_Presentacion = Nombre_Presentacion;
        this.Detalle = Detalle;
    }

    public int getId_Presentacion() {
        return Id_Presentacion;
    }

    public void setId_Presentacion(int Id_Presentacion) {
        this.Id_Presentacion = Id_Presentacion;
    }

    public String getNombre_Presentacion() {
        return Nombre_Presentacion;
    }

    public void setNombre_Presentacion(String Nombre_Presentacion) {
        this.Nombre_Presentacion = Nombre_Presentacion;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }
  
}
