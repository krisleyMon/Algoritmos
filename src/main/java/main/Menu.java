/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

public class Menu {

    private int opcion;

    public void MenuPrincipal() {

        Nivel1 n1 = new Nivel1();
        Nivel2 n2 = new Nivel2();
        Nivel3 n3 = new Nivel3();
        Nivel4 n4 = new Nivel4();
        Nivel5 n5 = new Nivel5();

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                  MEN\u00da PRINCIPAL
                                                                  
                                                                  1. Leer 8 n\u00fameros
                                                                  2. Mostrar caracteres
                                                                  3. Contar vocales
                                                                  4. Sumar \u00edndices pares e impares
                                                                  5. Contar cu\u00e1ntas veces aparece un n\u00famero
                                                                  6. Clasificar caracteres
                                                                  7. Rotar arreglo a la derecha
                                                                  8. Intercambiar dos \u00edndices
                                                                  9. Verificar si est\u00e1 ordenado
                                                                  10. Verificar si es capic\u00faa
                                                                  11. Salir
                                                                  
                                                                  Seleccione una opci\u00f3n:"""));

            switch (opcion) {

                case 1:
                    n1.leer8Numeros();
                    break;

                case 2:
                    n1.mostrarChar();
                    break;

                case 3:
                    n2.contadorVocales();
                    break;

                case 4:
                    n2.sumarIndices();
                    break;

                case 5:
                    n3.contarNumerosArreglo();
                    break;

                case 6:
                    n3.clasificarCaracteres();
                    break;

                case 7:
                    n4.rotarPosicionDerecha();
                    break;

                case 8:
                    n4.intercambiarIndices();
                    break;

                case 9:
                    n5.verificarOrden();
                    break;

                case 10:
                    n5.capicua();
                    break;

                case 11:
                    JOptionPane.showMessageDialog(null, "Programa finalizado.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }

        } while (opcion != 11);
    }
}
