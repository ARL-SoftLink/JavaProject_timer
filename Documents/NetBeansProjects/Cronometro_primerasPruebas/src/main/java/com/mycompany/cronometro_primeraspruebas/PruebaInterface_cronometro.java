/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cronometro_primeraspruebas;

/**
 *
 * @author MINEDUCYT
 */
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PruebaInterface_cronometro extends JFrame{
    JLabel lbl1;
    public void PruebaInterface_cronometro(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        lbl1 = new JLabel("label");
        lbl1.setForeground(Color.red);
        lbl1.setBounds(100, 100, 150, 200);
        add(lbl1);
    }
}
