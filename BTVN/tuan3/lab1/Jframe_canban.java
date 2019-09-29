/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author ADMIN
 */
public class Jframe_canban extends JFrame{
    public Jframe_canban(){
        setVisible(true);
        setTitle(null);
        setBackground(Color.RED);
        setSize(200, 300);
    
    }
    public static void main(String[] args) {
        new Jframe_canban();
    }

}
