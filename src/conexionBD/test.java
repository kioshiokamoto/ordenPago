/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionBD;

/**
 *
 * @author KIOSHI
 */
public class test {
    public static void main(String[] args) {
//        verificandoConex da = new verificandoConex();
//        if(da.probarConexion()==1){
//            JOptionPane.showMessageDialog(null, "Conexion Correcta");
//        }
//        else{
//            JOptionPane.showMessageDialog(null, "Conexion errada");
//        }
        conexionBD c =new conexionBD();
        c.conexion();
    }
}
