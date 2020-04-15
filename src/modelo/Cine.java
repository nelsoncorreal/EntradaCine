/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Nelson Correal
 */

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import vista.Funciones;


public class Cine extends JFrame implements ActionListener{
    
    //ArrayList aut = new ArrayList();
 
    
    Funciones fu = new Funciones();
    JLabel tiquet;
    JLabel peli;
    JLabel total;
    JTextArea peliculas1;
    JTextArea peliculas2;
    JTextField tiquets;
    JTextField pelis;
    JTextArea totals;
    JButton vender;
    JButton totalD;
    JButton limp;
    
    
    public Cine(){
         
        tiquet= new JLabel("cantidad de tiquetes");
        peli = new JLabel("pelicula ");
        tiquets = new JTextField(40);
        pelis = new JTextField(40);
        vender =new JButton(" Info   ");
        totalD = new JButton(" total  ");
        limp = new JButton("Limpiar");
        totals = new JTextArea(10, 80);
        total = new JLabel("                 total  de tiquetes al dia");
        peliculas1 = new JTextArea( "1)Rapidos y Furiosos 7\n" + "2)Bob Esponja\n"+"3)American Pie mi primera vez \n" + "4)Iroman 2 \n" + "5)Deadpool\n",15,60 );
        
        peliculas2 = new JTextArea("6)Casi 300\n" + "7)Pareja explosiva\n" + "8)Los indestructibles 2\n" + "9)Son como niños\n" + "10)Karate kid \n",15,60);
        
        
        
        peliculas1.setBackground(Color.BLACK);
        peliculas1.setForeground(Color.WHITE);
        peliculas2.setBackground(Color.BLACK);
        peliculas2.setForeground(Color.WHITE);
        
        peliculas1.setWrapStyleWord(true);
        peliculas1.setLineWrap(true);
        peliculas2.setWrapStyleWord(true);
        peliculas2.setLineWrap(true);
        totals.setWrapStyleWord(true);
        totals.setLineWrap(true);
        
        
        setBounds(200,200,500,500);
        setLayout(new FlowLayout());
        add(peliculas1);
        add(peliculas2);
        add(peli);
        add(pelis);
        add(tiquet);
        add(tiquets);
        add(vender);
        add(totalD);
        add(total);
        add(totals);
        add(limp);
        
        
        vender.addActionListener(this);
        totalD.addActionListener(this);
        limp.addActionListener(this);
                
        setVisible(true);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String texBoton;
        
         
         texBoton = e.getActionCommand();
         if (e.getSource() == vender) {
             System.out.println("informacion");
         fu.llenar();
         fu.buscar(pelis.getText());
         
        
        } else if(e.getSource() == totalD) {
            int i;
            i=Integer.parseInt(tiquets.getText());
            totals.setText("total  a pagar : " + i*5000 + "Tiquetes" + i);
            JOptionPane.showMessageDialog(null, "total  a pagar : " + i + "Tiquetes" );
            
            
        }else if (e.getSource() == limp){
            totals.setText(null);
            tiquets.setText(null);
            pelis.setText(null);
        }
        
            
    }
   

  
        
            
     }

 
    

