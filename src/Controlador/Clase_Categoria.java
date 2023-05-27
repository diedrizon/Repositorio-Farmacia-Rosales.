
package Controlador;

/**
 *
 * @author diedr
 */
public class Clase_Categoria {
   int Id_categoria;
   String descripcion;
   String nombre_categoria;
   
   public Clase_Categoria(int Id_categoria, String descripcion, String nombre_categoria) {
        this.Id_categoria = Id_categoria;
        this.descripcion = descripcion;
        this.nombre_categoria = nombre_categoria;
        
   }

    public int getId_categoria() {
        return Id_categoria;
    }

    public void setId_categoria(int Id_categoria) {
        this.Id_categoria = Id_categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    
    }


