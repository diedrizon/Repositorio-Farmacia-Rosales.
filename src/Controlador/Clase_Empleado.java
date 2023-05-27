
package Controlador;

import java.sql.Time;

/**
 *
 * @author diedr
 */
public class Clase_Empleado {
int Id_Empleado;
   String Nombre_1;
   String Nombre_2;
   String Apellido_1;
   String Apellido_2;
   String Numero_Celular;
   String Gmail;
   String Direccion;
   java.sql.Time Hora_Entrada;
   java.sql.Time Hora_Salida;

    public Clase_Empleado(int Id_Empleado, String Nombre_1, String Nombre_2, String Apellido_1, String Apellido_2, String Numero_Celular, String Gmail, String Direccion, Time Hora_Entrada, Time Hora_Salida) {
        this.Id_Empleado = Id_Empleado;
        this.Nombre_1 = Nombre_1;
        this.Nombre_2 = Nombre_2;
        this.Apellido_1 = Apellido_1;
        this.Apellido_2 = Apellido_2;
        this.Numero_Celular = Numero_Celular;
        this.Gmail = Gmail;
        this.Direccion = Direccion;
        this.Hora_Entrada = Hora_Entrada;
        this.Hora_Salida = Hora_Salida;
    }

    public int getId_Empleado() {
        return Id_Empleado;
    }

    public void setId_Empleado(int Id_Empleado) {
        this.Id_Empleado = Id_Empleado;
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

    public String getNumero_Celular() {
        return Numero_Celular;
    }

    public void setNumero_Celular(String Numero_Celular) {
        this.Numero_Celular = Numero_Celular;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String Gmail) {
        this.Gmail = Gmail;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public Time getHora_Entrada() {
        return Hora_Entrada;
    }

    public void setHora_Entrada(Time Hora_Entrada) {
        this.Hora_Entrada = Hora_Entrada;
    }

    public Time getHora_Salida() {
        return Hora_Salida;
    }

    public void setHora_Salida(Time Hora_Salida) {
        this.Hora_Salida = Hora_Salida;
    }

}