
package Controlador;

/**
 *
 * @author diedr
 */
public class Clase_Categoria {
   int Id_Categoria;
   String Nombre_Categoria;
   String Descripcion;

    public Clase_Categoria(int Id_Categoria, String Nombre_Categoria, String Descripcion) {
        this.Id_Categoria = Id_Categoria;
        this.Nombre_Categoria = Nombre_Categoria;
        this.Descripcion = Descripcion;
    }

    public int getId_Categoria() {
        return Id_Categoria;
    }

    public void setId_Categoria(int Id_Categoria) {
        this.Id_Categoria = Id_Categoria;
    }

    public String getNombre_Categoria() {
        return Nombre_Categoria;
    }

    public void setNombre_Categoria(String Nombre_Categoria) {
        this.Nombre_Categoria = Nombre_Categoria;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
   
    }


