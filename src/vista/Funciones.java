/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import modelo.Pelicula;

/**
 *
 * @author Nelson Correal
 */
public class Funciones {
    
    ArrayList<Pelicula> peli = new ArrayList();
    
    public void llenar(){
        
        Pelicula p1 = new Pelicula("Rapidos y Furiosos 7 ", "James Wan"     , 2015 ,"Buena Pelicula  "  );
        Pelicula p2 = new Pelicula("Bob Esponja", "Tristan Bourne", 2004 ,"Seccion infantil"  );
        Pelicula p3 = new Pelicula("American Pie mi primera vez" , " Paul Weitz", 1999 , "Buena pelicula para adultos");
        Pelicula p4 = new Pelicula("Iroman 2", "Shane Black   ", 2015 ,"Pelicula regular"  );
        Pelicula p5 = new Pelicula("Deadpool", "Tim Miller    ", 2006 ,"Buena Pelicula  "  );
        Pelicula p6 = new Pelicula("Casi 300", "Jason Friedber", 2008, "Pelicula comica "  );
        Pelicula p7 = new Pelicula("Pareja explosiva", "Brett Ratner  ", 1998, "Excelente pelicula");
        Pelicula p8 = new Pelicula("Los indestructibles 2", "Simon West    ", 2012, "Excelente pelicula");
        Pelicula p9 = new Pelicula("Son como niños", "Dennis Dugan  ", 2010, "Pelicula comica   ");
        Pelicula p10= new Pelicula("Karate kid", "John G. Avildsen", 2019, "Buena pelicula  ");
        
        peli.add(p1);
        peli.add(p2);
        peli.add(p3);
        peli.add(p4);
        peli.add(p5);
        peli.add(p6);
        peli.add(p7);
        peli.add(p8);
        peli.add(p9);
        peli.add(p10);
        
    }
    
    public void buscar(String nombrePeli){
         
        Iterator it = peli.iterator();
        
        while(it.hasNext()){
            Pelicula pelicula = (Pelicula)it.next();
            if ( nombrePeli.equalsIgnoreCase(pelicula.getNombre()) ) {
                JOptionPane.showMessageDialog(null, pelicula.getNombre()+ " " + pelicula.getDirector()+ " " + pelicula.getAño() + " " + pelicula.getReseña());
                
            }
        
        }
        
        
    }
    
    public void vender(int cantidad , String nombre ){
        Iterator it = peli.iterator();
        while(it.hasNext()){
            Pelicula pelicula = (Pelicula)it.next();
            if ( nombre.equalsIgnoreCase(pelicula.getNombre()) ) {
                JOptionPane.showMessageDialog(null, pelicula.getNombre() + pelicula.getDirector() + pelicula.getAño() + pelicula.getReseña());
                pelicula.setEntrada(cantidad + pelicula.getEntrada());
            }
            
        }
        
    }
    
    public void totalD(String nombre) {
        Iterator it = peli.iterator();
        while (it.hasNext() ){
           Pelicula pelicula = (Pelicula)it.next();
           if (nombre.equalsIgnoreCase(pelicula.getNombre())){
               JOptionPane.showMessageDialog(null, pelicula.getNombre());
           }
        } 
       
    }
 }

