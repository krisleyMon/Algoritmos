/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author krisl
 */
public class Nivel1 {

    
    /*Leer 8 números enteros desde teclado y almacenarlos en un arreglo. Al 
finalizar, mostrar todos los valores uno por línea. int */
    
    //Esté es el nivel 3 = Heyeri
    public void leer8Numeros() {
        Scanner valores = new Scanner(System.in);

        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el número " + (i + 1) + " : ");
            numeros[i] = valores.nextInt();

        }//Fin del for

        for (int i = 0; i < numeros.length; i++) {

            System.out.println(numeros[i]);
        }//Fin del for
    }//Fin de leer8Numeros

    /*Convertir una palabra conocida a un arreglo de caracteres y mostrar cada 
carácter por separado. Chart */
    
    //Esté es el nivel 4 = Heyeri
    public void mostrarChar() {

        /*Vi un video que me enseño a usarlo con "toCharArray", sin embargo sé que lo hemos visto diferente en clases,
        así que lo haré como lo hemos echo en clases, pero dejaré acá el comentario, para material de estudio
        
        String palabrasChar = "Hola";
        char[] caracteres = palabrasChar.toCharArray(); */
        
        char[] palabrasChar = {'H', 'o', 'l', 'a'};

        for (int i = 0; i < palabrasChar.length; i++) {

            System.out.println(palabrasChar[i]);
        }//Fin del for

    }//Fin de mostrarChar

}//Fin de la clase Nivel1

