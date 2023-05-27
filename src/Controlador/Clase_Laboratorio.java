
package Controlador;

/**
 *
 * @author diedr
 */
public class Clase_Laboratorio {
 int Id_Laboratorio;
   String Nombre;

    public Clase_Laboratorio(int Id_Laboratorio, String Nombre) {
        this.Id_Laboratorio = Id_Laboratorio;
        this.Nombre = Nombre;
    }

    public int getId_Laboratorio() {
        return Id_Laboratorio;
    }

    public void setId_Laboratorio(int Id_Laboratorio) {
        this.Id_Laboratorio = Id_Laboratorio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
   
   
}

   
