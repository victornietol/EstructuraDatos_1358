/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerostel;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */
public class NumerosTel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nTelefonos;
        
        nTelefonos = Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad de números teléfonicos a ingresar: "));
        
        String[] telefonos = new String[nTelefonos];
        String[] modTelefonos = new String[nTelefonos];
        char tmp = '+';
        char tmp1 = '5';
        char tmp2 = '2';
        int pos = 0;
        
        System.out.println("Ingrese los números telefonicos: ");
        for(int i=0; i<nTelefonos; i++){
            System.out.print("Número "+(i+1)+": ");
            telefonos[i] = entrada.nextLine();
        }
        
        for(int i=0; i<nTelefonos; i++){
            if (tmp==telefonos[i].charAt(0)) {
                modTelefonos[i] = telefonos[i].replaceAll("\\s","");
            } else {
                modTelefonos[i] = "+"+telefonos[i].replaceAll("\\s", "");
            }
            
        }
        
        for(int i=0; i<nTelefonos; i++){
            if (tmp1==modTelefonos[i].charAt(1) && tmp2==modTelefonos[i].charAt(2)) {
                
            } else {
                modTelefonos[i] = modTelefonos[i].substring(0, pos) + modTelefonos[i].substring(pos+1);
                modTelefonos[i] = "+52"+modTelefonos[i];
            }
        }
        
        System.out.println("\nLos teléfonos son: ");
        for(int i=0; i<nTelefonos; i++){
            System.out.println("Número "+(i+1)+": "+modTelefonos[i]);
        }
    }
    
}
