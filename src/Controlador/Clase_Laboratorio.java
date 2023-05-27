
package Controlador;

/**
 *
 * @author diedr
 */
public class Clase_Laboratorio {
    
     int Id_labor;
   String nombre;
   
   
    public Clase_Laboratorio(int Id_labor, String nombre) {
        this.Id_labor = Id_labor;
        this.nombre = nombre;
    }
    

    public int getId_labor() {
        return Id_labor;
    }

    public void setId_labor(int Id_labor) {
        this.Id_labor = Id_labor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
   
}

   
