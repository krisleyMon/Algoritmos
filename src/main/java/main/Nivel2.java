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
public class Nivel2 {
   
  public void Promedio(){
 // Se creo el arreglo
   double [] numeros = new double[8];
 // se declara la variable de suma y si inicializa 
   double suma = 0;
  // se le pregunta al usuario el numero
   for (int i= 0; i < numeros.length; i++){
      numeros[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero"+(i+1)));
      suma=suma+numeros[i];
  }
  // se calcula el promedio
   double promedio =suma/numeros.length;
  // se muestra el promedio
   JOptionPane.showMessageDialog(null,String.format("EL promedio es:%.2f",promedio));
  }       

 
public void Asistencia(){
    // Se crea el arreglo
    boolean [] Asistio = new boolean[20];
   // se inicializan las variables 
    int asistieron =0;
    int faltaron =0;
    // se le pregunta al usuario si el estudiante asistio
    for (int i=0;i<Asistio.length; i++){
     String respuesta =JOptionPane.showInputDialog("EL estudianete"+(i+1)+"asistio(si/no)");
     // si asistio se suma en asistio
     if(respuesta.equals("si")){
     Asistio[i]= true;    
    asistieron++;
   // si no fue se suma en faltaron
     }else{
     Asistio[i]= false;    
      faltaron++;
     }      
     // se calcula el porsentaje de asistencia
     double porsentaje=(asistieron*100.0) / Asistio.length;
    // se muestra el resultado
     JOptionPane.showConfirmDialog(null,
                "Asistencia:"+asistieron
             + "\nFaltaron:"+faltaron
             + "\nPorsentaje:"+porsentaje);
    }
    
   }
}