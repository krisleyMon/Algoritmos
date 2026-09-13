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
public class Nivel4 {

    /*Rotar un arreglo una posición hacia la derecha: el último elemento pasa a la 
primera posición y los demás se desplazan una posición. int */
    //Esté es el nivel 15 = Heyeri
    //Esté me costó mucho ya que es algo nuevo, sin embargo con un video logré comprenderlo mejor y creo que lo logré
    public void rotarPosicionDerecha() {
        int[] numeros = {1, 2, 3, 4, 5, 6};

        //El -1 es el último es decir = 6
        int ultimo = numeros[numeros.length - 1];

        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }//Fin del for

        numeros[0] = ultimo;

        for (int i = 0; i < numeros.length; i++) {

            System.out.println(numeros[i]);

        }//Fin del for
    }//Fin de rotarPosicionDerecha

    /*Solicitar dos índices válidos e intercambiar los valores almacenados en esas 
posiciones. Validar que ambos índices pertenezcan al arreglo. int */
    //Esté es el nivel 16 = Heyeri
    public void intercambiarIndices() {
        Scanner valores = new Scanner(System.in);

        int[] numeros = {10, 20, 30, 40, 50};

        System.out.print("Ingresa el primer índice; ");
        int indice1 = valores.nextInt();

        System.out.print("Ingresa el segundo índice; ");
        int indice2 = valores.nextInt();

        if (indice1 >= 0 && indice1 < numeros.length && indice2 < numeros.length) {

            int temporal = numeros[indice1];
            numeros[indice1] = numeros[indice2];
            numeros[indice2] = temporal;

            System.out.println("Valores que están intercambiados: ");

            for (int i = 0; i < numeros.length; i++) {
                System.out.println(numeros[i]);
            }//Fin del for

        } else {
            System.out.println("Uno o ambos índices no son validos");

        }//Fin del if
    }//Fin de intercambiarIndices
}//Fin de la clase Nivel4
