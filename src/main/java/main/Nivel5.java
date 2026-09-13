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

    /*Leer un arreglo y determinar si está ordenado de forma ascendente sin 
modificarlo. int */
    //Esté es el nivel 19 = Heyeri
    public void verificarOrden() {
        int[] numeros = {1, 2, 3, 4, 8, 10};
        boolean ordenado = true;

        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                ordenado = false;
            }//Fin del if
        }//Fin del for

        if (ordenado) {
            System.out.println("El arreglo está ordenado de forma ascendente ");
        } else {
            System.out.println("El arreglo no está ordenado ");
        }//Fin del if
    }//Fin de verificarOrden

    /*Determinar si un arreglo es capicúa: se lee igual de izquierda a derecha que de 
derecha a izquierda. int */
    //Esté es el nivel 20 = Heyeri
    public void capicua(){
        int[] numeros = {1, 3, 3, 1};
        boolean capicua = true;
        
        for (int i = 0; i < numeros.length / 2; i++){
            if (numeros[i] != numeros[numeros.length - 1 - i]){
                capicua = false;
            
        }//Fin del if
    }//Fin del for
    
        if (capicua){
            System.out.println("El arreglo es capicúa ");
        }else {
            System.out.println("El arreglo no es capicúa ");
        }//Fin del if
    }//Fin de capicua
}//Fin de la clase Nivel5
