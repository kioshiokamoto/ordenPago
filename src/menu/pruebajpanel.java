/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import javax.swing.JFrame;

/**
 *
 * @author Coredise
 */
public class pruebajpanel {
    JFrame jf1= new JFrame();
    cambioEmpresa e1= new cambioEmpresa();
    pruebajpanel(){
        jf1.add(e1);
        jf1.setLayout(null);
        jf1.setBounds(0, 0, 500, 500);
        e1.setBounds(5,5,400,400);
        jf1.setVisible(true);
    }
    public static void main(String[] args) {
        new pruebajpanel();
    }
}
