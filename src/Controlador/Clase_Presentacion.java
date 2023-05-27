
package Controlador;

/**
 *
 * @author diedr
 */
public class Clase_Presentacion {

    int Id_presentacion;
   String nomb_presentacion;
   String detalle;
   
   public Clase_Presentacion(int Id_presentacion, String nomb_presentacion, String detalle) {
        this.Id_presentacion = Id_presentacion;
        this.nomb_presentacion = nomb_presentacion;
        this.detalle = detalle;
    }

    public int getId_presentacion() {
        return Id_presentacion;
    }

    public void setId_presentacion(int Id_presentacion) {
        this.Id_presentacion = Id_presentacion;
    }

    public String getNomb_presentacion() {
        return nomb_presentacion;
    }

    public void setNomb_presentacion(String nomb_presentacion) {
        this.nomb_presentacion = nomb_presentacion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
    
    
   
}
