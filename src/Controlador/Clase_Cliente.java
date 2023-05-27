
package Controlador;

/**
 *
 * @author diedr
 */
public class Clase_Cliente {

    int Id_cliente;
    String nombre_1;
    String nombre_2;
    String apellido_1;
    String apellido_2;
    String num_celu;
    String direccion;
    
    
    public Clase_Cliente(int Id_cliente, String nombre_1, String nombre_2, String apellido_1, String apellido_2, String num_celu, String direccion) {
        this.Id_cliente = Id_cliente;
        this.nombre_1 = nombre_1;
        this.nombre_2 = nombre_2;
        this.apellido_1 = apellido_1;
        this.apellido_2 = apellido_2;
        this.num_celu = num_celu;
        this.direccion = direccion;
    }

    public int getId_cliente() {
        return Id_cliente;
    }

    public void setId_cliente(int Id_cliente) {
        this.Id_cliente = Id_cliente;
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
    
    
    
    
}
