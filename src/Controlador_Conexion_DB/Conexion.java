
package Controlador_Conexion_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author diedr
 */
public class Conexion {
    
  
 private final String url="jdbc:sqlserver://localhost:1433;databaseName=Farmacia_Rosales_DB;"
            + "integratedSecurity=true;" +
     "encrypt=true;trustServerCertificate=true";
   
    Connection cn;
    public Connection conectar(){      
        try {
            cn = DriverManager.getConnection(url);
            System.out.println("Conexion establecida");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexión: "+e);
        }
        return null;
    }  
}
 
 

