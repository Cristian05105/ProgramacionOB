/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2pob;

/**
 *
 * @author cristianV
 */
import java.util.Scanner;
public class Actividad2pob {

    public static void main(String[] args) {
        System.out.println("--------------ACTIVIDAD 1----------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cual es tu nombre?");
        String nombre= scanner.nextLine();
        System.out.println("Hola " + nombre);
        
        String nombreesp = "Cristian Villalpando Arreola";
        if(nombre.equals(nombreesp)){
            System.out.println("Hola " + nombre +"  Que tengas un excelente dia");
        }else{
            System.out.println("el nombre no coincide para el destinatario");
        }          
    }
}





