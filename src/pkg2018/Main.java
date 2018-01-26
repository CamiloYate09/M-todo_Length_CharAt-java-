/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2018;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Kernel-2018
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  
        String cadena = "Bienvenido al mundo java";
        
        char caracter;
        
        System.out.println("La cadena tiene "+cadena.length()+ "Caracteres");
        
        for (int i = 0; i < cadena.length(); i++) {
            caracter = cadena.charAt(i);
            //System.out.println("El caracter de la posicion es " + i+ "es :"+ caracter);
  //JOptionPane.showMessageDialog(this, caracter,"Usted debe dar de cambio",1);
             JOptionPane.showMessageDialog(null, "<html><h1 style='font-size:20px; color:red;'>"+"El caracter de la posicion  " + i + " es : "+ caracter +"</h1> </html>","Las posiciones de los caracteres",1);
          
        }
        
    }
    
    

    
  
}
