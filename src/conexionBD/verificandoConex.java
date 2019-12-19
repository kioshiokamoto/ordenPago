/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionBD;
import java.sql.*;
/**
 *
 * @author KIOSHI
 */
public class verificandoConex extends conexionBD{
    Connection cn =conexion();
    public int probarConexion(){
        int conexion=0;
        try{
            PreparedStatement ps = null;
            ResultSet rs =null;
            ps=cn.prepareStatement("select COUNT(*) from PRUEBA");
            rs=ps.executeQuery();
            if(rs.next()){
                conexion=1;
            }
            
            
        }catch(Exception e){
            
        }
        return conexion;
    }
}
