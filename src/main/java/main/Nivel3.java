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
public class Nivel3 {
    
    public void MayorOMenor() {
       //crear el arreglo
        int[] numeros = new int[10];
   //Leer los 10 numeros 
        for (int i = 0; i < numeros.length; ++i) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese susnumeros" + (i + 1)));
            //inicializar el mayor y el menor 
        }//Fin del for 
        int mayor = numeros[0];
        int menor = numeros[0];
       //busacr el mayor y menor
        for (int i = 0; i < numeros.length; ++i) {
           //encuentra el mayor 
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            //Encuentra el menor 
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        //Muestra el resultado
        JOptionPane.showMessageDialog(null, "Numero mayor:" + mayor
                + "Numero menor" + menor);
    } 
  
    public void BuscarAreglo(){
      // se crea un nuevo arreglo
        int[] numero= new int[8];
      // pedimos que ingrese los numeros 
        for(int i = 0; i < numero.length; ++i){
          numero[i] =Integer.parseInt(JOptionPane.showInputDialog("Ingrese los numeros"+(i+1)));
      }
      // se le pregunta al usuario por el nuemero que desea buscar 
      int buscar =Integer.parseInt(JOptionPane.showInputDialog("Que numero quiere buscar?"));
      // se inicializa la posicion
      // si sigue siendo -1 signofica que no se encontro la posicion
      int posicion =-1;
      // recorre el arreglo
      for(int i = 0; i < numero.length; ++i){
       //berifica si el numero que esta en la primera posicion es el que busco el usuario
       // y se revisa que todavia no haya una posicion
          if(numero[i]==buscar&&posicion ==-1) {
          posicion=i;  
        }  
      }
     //Muestra la posicion
      JOptionPane.showMessageDialog(null,"Primera posicion"+posicion);    
      }
}
