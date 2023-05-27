
package Controlador;

/**
 *
 * @author diedr
 */
public class Clase_Proveedor {
    int Id_proveed;
    String nombre_1;
    String  nombre_2;
    String apellido_1;
    String apellido_2;
    String gmil;
    String num_celu;
    String direccion;
    byte [] imagen_proveedor;

    public Clase_Proveedor(int Id_proveed, String nombre_1, String nombre_2, String apellido_1, String apellido_2, String gmil, String num_celu, String direccion, byte[] imagen_proveedor) {
        this.Id_proveed = Id_proveed;
        this.nombre_1 = nombre_1;
        this.nombre_2 = nombre_2;
        this.apellido_1 = apellido_1;
        this.apellido_2 = apellido_2;
        this.gmil = gmil;
        this.num_celu = num_celu;
        this.direccion = direccion;
        this.imagen_proveedor = imagen_proveedor;
    }

    public int getId_proveed() {
        return Id_proveed;
    }

    public void setId_proveed(int Id_proveed) {
        this.Id_proveed = Id_proveed;
    }

    public String getNombre_1() {
        return nombre_1;
    }

    public void setNombre_1(String nombre_1) {
        this.nombre_1 = nombre_1;
    }

    public String getNombre_2() {
        return nombre_2;
    }

    public void setNombre_2(String nombre_2) {
        this.nombre_2 = nombre_2;
    }

    public String getApellido_1() {
        return apellido_1;
    }

    public void setApellido_1(String apellido_1) {
        this.apellido_1 = apellido_1;
    }

    public String getApellido_2() {
        return apellido_2;
    }

    public void setApellido_2(String apellido_2) {
        this.apellido_2 = apellido_2;
    }

    public String getGmil() {
        return gmil;
    }

    public void setGmil(String gmil) {
        this.gmil = gmil;
    }

    public String getNum_celu() {
        return num_celu;
    }

    public void setNum_celu(String num_celu) {
        this.num_celu = num_celu;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public byte[] getImagen_proveedor() {
        return imagen_proveedor;
    }

    public void setImagen_proveedor(byte[] imagen_proveedor) {
        this.imagen_proveedor = imagen_proveedor;
    }
}
