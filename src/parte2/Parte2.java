/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte2;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("elige una actividad al azar entre");
        System.out.println("un numero del 1 al 5");
        int numero1 =leer.nextInt();
        
        switch(numero1){
        
           case 1: 
                 System.out.println("elegiste correr");
                 break;
            case 2: 
                System.out.println("elegiste saltar");
                break;
            case 3:
                System.out.println("elegiste comer");
                break;
            case 4: 
                System.out.println("elegiste dormir");
                break;
            case 5:
                System.out.println("elegiste estudiar");
                break;
            default:
                System.out.println("no valido");}
    }
    
}
