/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tema4;
import java.util.Scanner;
/**
 *
 * @author alexn
 */
public class Tema4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el numero a consultar positivo :");
        int numeroIf = leer.nextInt();
         
        if(numeroIf<0){
        System.out.println("Es negativo");
        }
        else{
            System.out.println("Es positivo");
        }
        int numeroWhile=0;
        while(numeroWhile <3){
            numeroWhile++;
            System.out.println("Ciclo: "+numeroWhile);
        }
        
        do{ numeroWhile++;
            System.out.println("Ciclo Do While: "+numeroWhile);
        }while(numeroWhile <3);
        
        for(int numeroFor=0; numeroFor<=3; numeroFor++){
            System.out.println("Ciclo For: "+numeroFor);
        }
        
        
          System.out.println("Ingrese el caso:");
        int estacion = leer.nextInt();
      
        switch (estacion){
            
            case 1:
                    System.out.println("Invierno");
            break;
            
            case 2:
                    System.out.println("primavera");
            break;
            
            case 3:
                    System.out.println("Verano");
            break;
            
            case 4:
                    System.out.println("Otoño");
            break;
            
            default:
                System.out.println("Solo son 4 estaciones elija de 1 a 4");
        }
        
    }
}
