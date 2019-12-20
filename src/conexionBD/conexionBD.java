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
 *  Se suele usar para bd
 * Class.forName("DRIVER");
 *  Connection conn = null;  //conexion
    PreparedStatement prepSt = null;//Se pone conn.prepareStatement("LA CONSULTA O ACCION ?",VALORDE(?));
    Statement st = null;// es un prepared pero no permite parametros
    ResultSet rs = null;//Sirve para ver si se ejecuto un "select" generalmente
 */
public class conexionBD {
    //private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public String usuario = "SOPORTE";
    public String password= "SOPORTE";
    public String url="jdbc:sqlserver://192.168.100.30;databasename=OPAGO";
    public Connection cn= null;
    public Statement st = null;
    
    public Statement conexion(){
        
        try {
            cn = DriverManager.getConnection(url,usuario,password);
            st=cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //cn = DriverManager.getConnection("jdbc:sqlserver://192.168.100.30;databasename=OPAGO","SOPORTE","SOPORTE");
//            cn = DriverManager.getConnection("jdbc:sqlserver://192.168.1.6;databasename=OPAGO","SOPORTE","SOPORTE");
            System.out.println("Conectado.");
        } 
        catch (SQLException e) 
        {
          System.err.println("Error. " + e);
          
        }
        return st;
    }
}
