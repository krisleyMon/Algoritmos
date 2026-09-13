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
/*package main;

import javax.swing.JOptionPane;*/
public class Menu {

    private int opcion;

    public void MenuPrincipal() {

        Nivel1 n1 = new Nivel1();
        Nivel2 n2 = new Nivel2();
        Nivel3 n3 = new Nivel3();
        Nivel4 n4 = new Nivel4();
        Nivel5 n5 = new Nivel5();

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "MENÚ PRINCIPAL\n\n"
                    + "1. Leer 8 números\n"
                    + "2. Mostrar caracteres\n"
                    + "3. Contar vocales\n"
                    + "4. Sumar índices pares e impares\n"
                    + "5. Contar cuántas veces aparece un número\n"
                    + "6. Clasificar caracteres\n"
                    + "7. Rotar arreglo a la derecha\n"
                    + "8. Intercambiar dos índices\n"
                    + "9. Verificar si está ordenado\n"
                    + "10. Verificar si es capicúa\n"
                    + "11. Salir\n\n"
                    + "Seleccione una opción:"
            ));

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