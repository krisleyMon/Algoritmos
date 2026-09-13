/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author krisl
 */
public class Nivel5 {
    
public void ParalelosAreglos (){
 int[] paralelos1 ={90,87,67,56,77};
 int[] paralelos2 ={97,34,20,30};
  //Crear un tecer arreglo del mismo tamaño 
 int[] resultado = new int[paralelos1.length];
 //suma los elementos de la misma posicion 
 for (int i=0; i<paralelos1.length; i++){
     resultado[i] =paralelos1[i]+paralelos2[i];
     
 }
    for(int i=0;i<resultado.length; i++){
      System.out.println(resultado[i]);
    }   
}

public void Precios(){
    double[] precio1={600.0,400.0,700.0,500.0};
    double[] precio2={90.0,100.0,400.0,200.0};
   double[] diferencia =new double[precio1.length];
   
     double suma=0;
   for(int i=0; i<precio1.length; i++){
    diferencia[i]= Math.abs(precio1[i]-precio2[i]); 
         suma = suma+diferencia[i];
   } 
   double promedio = suma/diferencia.length;
   System.out.println("El promedio de las deferencias"+promedio);
}
}
