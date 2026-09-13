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
public class Menu {

    private int opcion;

    public void MenuPrincipal() {

        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                              MENU
                                                              Nivel1
                                                              Nivel2
                                                              Nivel3
                                                              Nivel4
                                                              Nivel5
                                                              Salir"""));

            switch (opcion) {
                case 1:
                Nivel1 n = new Nivel1();
                n.MostrarValorAlmacenado();
                n.modtrarLongitudYUltimoNumero();
                break;

                case 2:
                Nivel2 l = new Nivel2();
                l.Asistencia();
                l.Promedio();
                    break;

                case 3:
                Nivel3 k = new Nivel3();
                k.BuscarAreglo();
                k.MayorOMenor();
                    
                    break;

                case 4:
                Nivel4 e = new Nivel4();
                e.CopiaAreglo();
                e.Invertir();
                    break;

                case 5:
                Nivel5 f =new Nivel5();
                f.ParalelosAreglos();
                f.Precios();
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "No disponible");
            }

        } while (opcion != 6);
    }
}
