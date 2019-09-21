/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */
public class flowlayout extends JFrame {
    private static Object pnFlow;
   
     public flowlayout (){
         
         super ("title");
         setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel pnFlow = new JPanel();
        pnFlow.setLayout(new FlowLayout());
        pnFlow.setBackground(Color.RED);
        JButton btn1=new JButton("FlowLayout");
        JButton btn2=new JButton("Add các control");
        JButton btn3=new JButton("Trên 1 dòng");
        JButton btn4=new JButton("Hết chỗ chứa");
        JButton btn5=new JButton("Thì xuống dòng");
        pnFlow.add(btn1);
        pnFlow.add(btn2);
        pnFlow.add(btn3);
        pnFlow.add(btn4);
        pnFlow.add(btn5);
        Container con=getContentPane();
        con.add(pnFlow);
     }
    public static void main(String[] args){
       
        flowlayout ui=new flowlayout();
        ui.setSize(400 , 400);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
        
     
        
     
    }
    

}
