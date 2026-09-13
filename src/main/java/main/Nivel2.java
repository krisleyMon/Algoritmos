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
public class Nivel2 {

    /*Dado un arreglo de caracteres, contar cuántas vocales contiene. char */
    //Esté es el nivel 7 = Heyeri
    public void contadorVocales() {

        char[] caracteres = {'B', 'i', 'e', 'n', 'v', 'e', 'n', 'i', 'd', 'o', 's'};
        int contador = 0;

        for (int i = 0; i < caracteres.length; i++) {
            //El simbolo || se usa como si fuera la letra "o", es decir esto "o" lo otro, (Realizo notas para material de estudio)
            if (caracteres[i] == 'a' || caracteres[i] == 'e' || caracteres[i] == 'i' || caracteres[i] == 'o' || caracteres[i] == 'u') {
                contador++;
            }//Fin del if
        }//Fin del for

        System.out.println("Cantidad de vocales: " + contador);
    }//Fin de contadorPalabras

    /*Leer 15 números. Mostrar la suma de los elementos ubicados en 
índices pares y, por separado, la suma de los ubicados en índices 
impares. int */
    //Esté es el nivel 8 = Heyeri
    /*Esté ejercicio se parece a uno que hicimos en clases, así que con esa inf me guie, 
    tambien en inicialización de la presentación ubo inf útil */
    public void sumarIndices() {
        Scanner valores = new Scanner(System.in);
        int[] numeros = new int[15];
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el número" + (i + 1) + ": ");
            numeros[i] = valores.nextInt();

            /*Recuerdo que esto lo hizo la profe en clases sumaPares += numeros[i]; el +=, 
es igual que poner sumaPares = sumaPares + numeros[i];*/
            if (i % 2 == 0) {
                sumaPares += numeros[i];
            } else {
                sumaImpares += numeros[i];
            }//Fin del if
        }//Fin del for

        System.out.println("Suma de los índices pares: " + sumaPares);
        System.out.println("Suma de los índices impares: " + sumaImpares);

    }//Fin de sumarIndices

}//Fin de la clase Nivel2

/*Tuve unos conflictos de compilación, pero no es gracias al algoritmo, 
sino a que mi compañera trabaja con una versión más actualizada, ella esta con la 26 y yo con la 25.

IMPORTANTE: no puedo descargar la versión 26, ya que uso una computadora de prestamo de la UCR, 
y al intentar instalar me dice que debo pedir una contraseña, para cambiar parte de la computadora, 
pero sé que el codigo complila correctamente*/