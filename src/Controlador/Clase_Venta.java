
package Controlador;

import java.time.LocalDateTime;

/**
 *
 * @author diedr
 */
public class Clase_Venta {
    int Id_Venta;
    java.time.LocalDateTime Fecha_Hora;
    int Id_Cliente;
    int Id_Empleado;

    public Clase_Venta(int Id_Venta, LocalDateTime Fecha_Hora, int Id_Cliente, int Id_Empleado) {
        this.Id_Venta = Id_Venta;
        this.Fecha_Hora = Fecha_Hora;
        this.Id_Cliente = Id_Cliente;
        this.Id_Empleado = Id_Empleado;
    }

    public int getId_Venta() {
        return Id_Venta;
    }

    public void setId_Venta(int Id_Venta) {
        this.Id_Venta = Id_Venta;
    }

    public LocalDateTime getFecha_Hora() {
        return Fecha_Hora;
    }

    public void setFecha_Hora(LocalDateTime Fecha_Hora) {
        this.Fecha_Hora = Fecha_Hora;
    }

    public int getId_Cliente() {
        return Id_Cliente;
    }

    public void setId_Cliente(int Id_Cliente) {
        this.Id_Cliente = Id_Cliente;
    }

    public int getId_Empleado() {
        return Id_Empleado;
    }

    public void setId_Empleado(int Id_Empleado) {
        this.Id_Empleado = Id_Empleado;
    }
    
    
}
