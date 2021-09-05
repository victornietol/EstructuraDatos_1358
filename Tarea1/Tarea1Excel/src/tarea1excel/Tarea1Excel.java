/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1excel;

import Controlador.ControladorExcel;
import Modelo.ModeloExcel;
import Ventana.VentanaExcel;

/**
 *
 * @author Victor
 */
public class Tarea1Excel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModeloExcel modeloE = new ModeloExcel();
        VentanaExcel ventanaE = new VentanaExcel();
        ControladorExcel contraControladorE = new ControladorExcel(ventanaE,modeloE);
        ventanaE.setVisible(true);
        ventanaE.setLocationRelativeTo(null);
        
    }
       
}
