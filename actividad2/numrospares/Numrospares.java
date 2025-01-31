/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numrospares;

/**
 *
 * @author cristianV
 */
public class Numrospares {

    public static void main(String[] args) {
        int principio = 2;
        int fin = 100;
        
        int pares= (fin - principio) / 2 + 1;
        int[] numrospares = new int[pares];
        for (int i = 0; i < pares; i++) {
            numrospares[i] = principio + (i * 2);
        }
        System.out.println("Numeros pares del 2 hasta el 100: ");
        for (int i = 0; i < numrospares.length; i++){
            System.out.println(numrospares[i]);
        }
    }
}
