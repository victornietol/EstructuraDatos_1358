/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegopuntaje;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class JuegoPuntaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int jugador1 = 0;
        int jugador2 = 0;
        String jugador1a = "ADV";
        String jugador2a = "ADV";
        int estado = 0;
        int punto;
        
        System.out.println("Jugador 1: "+jugador1+" | Jugador 2: "+ jugador2);
        
        while (jugador1<=40 && jugador2<=40) {            
            System.out.print("Punto para el jugador: ");
            punto = entrada.nextInt();
            if (punto==1) {
            jugador1 = jugador1 + 15;
            } else {
            jugador2 = jugador2 + 15;
            }
            System.out.println("Jugador 1: "+jugador1+" | Jugador 2: "+ jugador2);
        }
        System.out.println("Prueba de marcador hasta 40"); 
    }
    
}
