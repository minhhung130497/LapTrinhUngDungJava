/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;
import java.awt.BorderLayout;
import java.awt.Color;


import javax.swing.JPanel;
import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author ADMIN
 */
public class borderlayout extends JFrame{
     public borderlayout(String title){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel pnBorder=new JPanel();
        pnBorder.setLayout(new BorderLayout());
        JPanel pnNorth=new JPanel();
        pnNorth.setBackground(Color.RED);
        pnBorder.add(pnNorth,BorderLayout.NORTH);
        JPanel pnSouth=new JPanel();
        pnSouth.setBackground(Color.RED);
        pnBorder.add(pnSouth,BorderLayout.SOUTH);
        JPanel pnWest=new JPanel();
        pnWest.setBackground(Color.BLUE);
        pnBorder.add(pnWest,BorderLayout.WEST);
        JPanel pnEast=new JPanel();
        pnEast.setBackground(Color.BLUE);
        pnBorder.add(pnEast,BorderLayout.EAST);
        JPanel pnCenter=new JPanel();
        pnCenter.setBackground(Color.BLACK);
        pnBorder.add(pnCenter,BorderLayout.CENTER);
         getContentPane().add(pnBorder);
        setSize(500,500);
         setVisible(true);
         setLocationRelativeTo(null);
     }

     public static void main(String[] args){
       
        new borderlayout("BoderLayout");
}
}