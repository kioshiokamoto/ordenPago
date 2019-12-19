/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionBD;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author KIOSHI
 */
public class conexionBD {
    //private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public Connection conexion(){
        Connection cn= null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection("jdbc:sqlserver://192.168.100.30;databasename=OPAGO","SOPORTE","SOPORTE");
            System.out.println("Conectado.");
        } 
        catch (Exception e) 
        {
          System.out.println("Error.");
        }
        return cn;
    }
}
