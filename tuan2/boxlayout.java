/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import com.sun.org.apache.xerces.internal.util.DOMUtil;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */
public class  boxlayout extends JFrame{
     public boxlayout(String title){
        
         super(title);
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel pnBox=new JPanel();
        pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.X_AXIS));
        JButton btn1=new JButton("BoxLayout");
        btn1.setForeground(Color.yellow);
        Font font=new Font("Arial",Font.BOLD / Font.ITALIC,25);
        btn1.setFont(font);pnBox.add(btn1);
        JButton btn2=new JButton("X_AXIS");
        btn2.setForeground(Color.cyan);
        btn2.setFont(font);pnBox.add(btn2);
        JButton btn3=new JButton("Y_AXIS");
        btn3.setForeground(Color.BLACK);
        btn3.setFont(font); pnBox.add(btn3);
        Container con=getContentPane();
        con.add(pnBox);
         setVisible(true);
         setLocationRelativeTo(null);
         setSize(500,500);
     }
         public static void main(String[] args){
       
        new boxlayout("BoxLayout");
         
} 
}
