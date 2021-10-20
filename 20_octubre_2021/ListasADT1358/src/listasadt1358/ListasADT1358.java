/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasadt1358;

import ico.fes.modelo.Empleado;
import ico.fes.unam.edd1358.DoubleLinkedList;
import ico.fes.unam.edd1358.LinkedListADT;

/**
 *
 * @author Victor
 */
public class ListasADT1358 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedListADT lsl = new LinkedListADT();
        lsl.append(new String("Jose"));
        lsl.append(new String("Diana"));
        lsl.append(new String("Santiago"));
        lsl.append("Daniela");   // es lo mismo que el string de arriba
        lsl.transversal();
        
        LinkedListADT lsl2 = new LinkedListADT();
        // objetos del tpo Empleado
        
        lsl2.append(new Empleado(1, "José", "Pérez", "García", 1850.5f, 2015, 4));
        lsl2.append(new Empleado(1, "Diego", "Pérez", "Hernandez", 1950.5f, 2017, 5));
        lsl2.append(new Empleado(1, "Diana", "Bonilla", "García", 2850.5f, 2010, 7));
        lsl2.append(new Empleado(1, "Daniela", "Casillas", "Lopèz", 3850.5f, 2019, 8));
        
        lsl2.transversal();
        
        LinkedListADT lsl3 = new LinkedListADT();
        lsl3.append(10);
        lsl3.append(20);
        lsl3.append(5);
        lsl3.append(20);
        lsl3.prepend(5);
        lsl3.transversal();
        System.out.println("------------------");
        lsl3.remove(20);
        lsl3.transversal();
        System.out.println(lsl3.pop());
        lsl3.transversal();
        System.out.println(lsl3.popFirst());
        lsl3.transversal();
        
        System.out.println("------- Lista doblemente ligada ---------");
        DoubleLinkedList ldl = new DoubleLinkedList();
        ldl.append(new Integer(10));
        ldl.append(new Integer(20));
        ldl.transversal();
        ldl.append(new Integer(30));
        ldl.transversal();
        ldl.append(new Integer(40));
        ldl.transversal();
        
    }
    
}
