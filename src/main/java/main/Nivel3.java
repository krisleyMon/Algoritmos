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
public class Nivel3 {

    /*Leer 12 números y solicitar un valor. Contar cuántas veces aparece dentro del 
arreglo. int*/
    //Esté es el nivel 11 = Heyeri
    public void contarNumerosArreglo() {
        Scanner valores = new Scanner(System.in);

        int[] numeros = new int[12];
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número" + (i + 1) + ": ");
            numeros[i]
                    = valores.nextInt();
        }//Fin del for

        System.out.print("Ingresa el valor que deseas buscar: ");
        int valor = valores.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                contador++;
            }//Fin del if
        }//Fin del for

        System.out.println("El valor aparece " + contador + " veces.");
    }//Fin de contarNumerosArreglo

    /*Dado un arreglo de caracteres, contar por separado vocales, consonantes y otros 
símbolos. char */
    //Esté es el nivel 12 = Heyeri
    //Esté ejercicio es similar al 7
    public void clasificarCaracteres() {

        char[] caracteres = {'¡', 'H', 'o', 'l', 'a', '2', '0', '2', '6', '!'};

        int vocales = 0;
        int consonantes = 0;
        int otrosSimbolos = 0;

        for (int i = 0; i < caracteres.length; i++) {

            if (caracteres[i] == 'a' || caracteres[i] == 'e' || caracteres[i] == 'i' || caracteres[i] == 'o' || caracteres[i] == 'u') {
                vocales++;
                //Esto le dice al programa que cualquier letra de a z, pero primero se pregunta si es vocal
            } else if ((caracteres[i] >= 'a' && caracteres[i] <= 'z') || (caracteres[i] >= 'A' && caracteres[i] <= 'Z')) {
                consonantes++;
            } else {
                otrosSimbolos++;
            }//Fin del if
        }//Fin del for

        System.out.println("Las vocales son: " + vocales );
        System.out.println("Las consonantes son: " + consonantes );
        System.out.println("Los otros simbolos son: " + otrosSimbolos );
        
}//Fin de clasificarCaracteres

}//Fin de la clase Nivel3
