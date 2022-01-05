/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        double[][] ventas = new double[2][5];
        double suma = 0;
        String cadena = "";
        
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.println("Ingrese las ventas del día");
                ventas[i][j] = entrada.nextDouble();
                suma = suma + ventas[i][j];
            }
            cadena = String.format("%sVendedor(a) %s\n", cadena, vendedores[i]);
        }
        
        System.out.println(cadena);
        System.out.println("Ha realizado un total de " + suma + "$ en ventas");
    
    
    
    
    
    }
}
