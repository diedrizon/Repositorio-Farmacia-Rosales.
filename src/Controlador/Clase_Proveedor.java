
package Controlador;

/**
 *
 * @author diedr
 */
public class Clase_Proveedor {
    int Id_Proveedor;
    String Nombre_1;
    String  Nombre_2;
    String Apellido_1;
    String Apellido_2;
    String Gmail;
    String Numero_Celular;
    String Direccion;

    public Clase_Proveedor(int Id_Proveedor, String Nombre_1, String Nombre_2, String Apellido_1, String Apellido_2, String Gmail, String Numero_Celular, String Direccion) {
        this.Id_Proveedor = Id_Proveedor;
        this.Nombre_1 = Nombre_1;
        this.Nombre_2 = Nombre_2;
        this.Apellido_1 = Apellido_1;
        this.Apellido_2 = Apellido_2;
        this.Gmail = Gmail;
        this.Numero_Celular = Numero_Celular;
        this.Direccion = Direccion;
    }

    public int getId_Proveedor() {
        return Id_Proveedor;
    }

    public void setId_Proveedor(int Id_Proveedor) {
        this.Id_Proveedor = Id_Proveedor;
    }

    public String getNombre_1() {
        return Nombre_1;
    }

    public void setNombre_1(String Nombre_1) {
        this.Nombre_1 = Nombre_1;
    }

    public String getNombre_2() {
        return Nombre_2;
    }

    public void setNombre_2(String Nombre_2) {
        this.Nombre_2 = Nombre_2;
    }

    public String getApellido_1() {
        return Apellido_1;
    }

    public void setApellido_1(String Apellido_1) {
        this.Apellido_1 = Apellido_1;
    }

    public String getApellido_2() {
        return Apellido_2;
    }

    public void setApellido_2(String Apellido_2) {
        this.Apellido_2 = Apellido_2;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String Gmail) {
        this.Gmail = Gmail;
    }

    public String getNumero_Celular() {
        return Numero_Celular;
    }

    public void setNumero_Celular(String Numero_Celular) {
        this.Numero_Celular = Numero_Celular;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

}
