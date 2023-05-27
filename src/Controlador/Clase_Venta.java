
package Controlador;

import java.time.LocalDateTime;

/**
 *
 * @author diedr
 */
public class Clase_Venta {
    int Id_venta;
    java.time.LocalDateTime fecha_hora;
    int Id_cliente;
    int Id_empleado;
    
    
    
    public Clase_Venta(int Id_venta, LocalDateTime fecha_hora, int Id_cliente, int Id_empleado) {
        this.Id_venta = Id_venta;
        this.fecha_hora = fecha_hora;
        this.Id_cliente = Id_cliente;
        this.Id_empleado = Id_empleado;
    }

    public int getId_venta() {
        return Id_venta;
    }

    public void setId_venta(int Id_venta) {
        this.Id_venta = Id_venta;
    }

    public LocalDateTime getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(LocalDateTime fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public int getId_cliente() {
        return Id_cliente;
    }

    public void setId_cliente(int Id_cliente) {
        this.Id_cliente = Id_cliente;
    }

    public int getId_empleado() {
        return Id_empleado;
    }

    public void setId_empleado(int Id_empleado) {
        this.Id_empleado = Id_empleado;
    }
    
}
