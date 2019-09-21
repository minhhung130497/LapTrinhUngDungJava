/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import javax.swing.JFrame;

/**
 *
 * @author ADMIN
 */
public class btwd extends JFrame {
   
     public btwd (){
         
         super ("baitap window");
         setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
     }
    public static void main(String[] args){
       
        btwd ui=new btwd();
        ui.setSize(400 , 400);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
       
    }
}
