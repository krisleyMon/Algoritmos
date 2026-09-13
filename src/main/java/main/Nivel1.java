/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author krisl
 */
public class Nivel1 {
   
    public void modtrarLongitudYUltimoNumero(){
        //se declara el aregllo
        double[] numero = {2.5,5.5,7.7,4.9};
        // se muestra la longitud y el ultimo elemento
      System.out.print("La longitud del arreglo es"+numero.length);
      System.out.print("Ultimo elemento"+numero[numero.length-1]);  
    }
    
    public void MostrarValorAlmacenado (){
   // se declara el arreglo
        boolean[] valores={true,false,true,true,false,true,};
     //se muestran los valores almasenados 
    for (int i = 0; i < valores.length; i++){
      System.out.print(valores[i]);
    }
      
    
    
    }    
    
    
}
