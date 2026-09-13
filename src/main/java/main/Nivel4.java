/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Arrays;

/**
 *
 * @author krisl
 */
public class Nivel4 {
    
   public void Invertir(){
      int[] numeros={89,90,40,30,12,99};
      // se llega a la mitad del recorrido
      for(int i=0; i< numeros.length/ 2;++i){
     int invertir =numeros[i];
     numeros[i]=numeros[numeros.length-1 -i];
     numeros[numeros.length -1 -i]=invertir;
   }
      for(int v:numeros)System.out.print(v+"");
   }
   
   public void CopiaAreglo(){
       int[] originales = {30,80,70,40,50};
   int[] copia= new int[originales.length];
   for(int i=0;i<originales.length;++i){
    copia[i]=originales[i];   
   }
  copia[0]=99;
  System.out.println(originales[0]);
  int[] copia2=Arrays.copyOf(originales,originales.length);
   }
    
    
    
}
