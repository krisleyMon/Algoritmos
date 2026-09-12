/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author krisl
 */
public class Menu {
    private int opcion;
            
      public void MenuPrincipal (){
          
          do{
              
        opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                              MENU
                                                              Nivel
                                                              Nivel2
                                                              Nivel3
                                                              Nivel4
                                                              Nivel5
                                                              Salir"""));
        
     switch (opcion) {
       case 1:
                   
                    break;

                case 2:
                 
                  
                    break;

                case 3:

                    
                    break;

                case 4:
                   
                    break;

                case 5:
                 
                    
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "No disponible");
            }   
 
          }while(opcion !=6);            
    }     
}
