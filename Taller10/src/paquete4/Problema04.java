/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       double[][] datos = new double[2][2];
       for (int i = 0; i < datos.length; i++) {
           for (int j = 0; j < datos[i].length; j++) {
               System.out.println("Ingrese un valor");
               datos[i][j] = entrada.nextDouble();
           }
       }
   } 
}
