
package Controlador;

import java.sql.Time;

/**
 *
 * @author diedr
 */
public class Clase_Empleado {
int Id_empleado;
   String nombre_1;
   String nombre_2;
   String apellido_1;
   String apellido_2;
   String num_celu;
   String gmail;
   String direccion;
   byte[]imagen_empleado;
   java.sql.Time hora_entrada;
   java.sql.Time hora_salida;

    public Clase_Empleado(int Id_empleado, String nombre_1, String nombre_2, String apellido_1, String apellido_2, String num_celu, String gmail, String direccion, byte[] imagen_empleado, Time hora_entrada, Time hora_salida) {
        this.Id_empleado = Id_empleado;
        this.nombre_1 = nombre_1;
        this.nombre_2 = nombre_2;
        this.apellido_1 = apellido_1;
        this.apellido_2 = apellido_2;
        this.num_celu = num_celu;
        this.gmail = gmail;
        this.direccion = direccion;
        this.imagen_empleado = imagen_empleado;
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
    }

    public int getId_empleado() {
        return Id_empleado;
    }

    public void setId_empleado(int Id_empleado) {
        this.Id_empleado = Id_empleado;
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

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public byte[] getImagen_empleado() {
        return imagen_empleado;
    }

    public void setImagen_empleado(byte[] imagen_empleado) {
        this.imagen_empleado = imagen_empleado;
    }

    public Time getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(Time hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public Time getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(Time hora_salida) {
        this.hora_salida = hora_salida;
    }
   
   
 

    
   
}