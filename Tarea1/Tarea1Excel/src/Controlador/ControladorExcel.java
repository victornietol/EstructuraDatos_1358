/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import Ventana.VentanaExcel;
import Modelo.ModeloExcel;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Victor
 */
public class ControladorExcel implements ActionListener{
    ModeloExcel modeloE = new ModeloExcel();
    VentanaExcel ventanaE = new VentanaExcel();
    JFileChooser selecArchivo = new JFileChooser();
    File archivo;
    int contAccion;
    
    public ControladorExcel(VentanaExcel ventanaE, ModeloExcel modeloExcel){
        this.ventanaE = ventanaE;
        this.modeloE = modeloExcel;
        this.ventanaE.botImportar.addActionListener(this);
        
    }
    
    public void AgregarFiltro(){
        selecArchivo.setFileFilter(new FileNameExtensionFilter("Excel (*.xls)", "xls"));
        selecArchivo.setFileFilter(new FileNameExtensionFilter("Excel (*.xlsx)", "xlsx"));
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        contAccion++;
        if(contAccion==1)AgregarFiltro();
        
        if(ae.getSource() == ventanaE.botImportar){
            if(selecArchivo.showDialog(null, "Seleccionar archivo")==JFileChooser.APPROVE_OPTION){
                archivo = selecArchivo.getSelectedFile();
                if(archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")){
                    JOptionPane.showMessageDialog(null, modeloE.Importar(archivo, ventanaE.jtDatos));
                } else {
                    JOptionPane.showMessageDialog(null, "Elija un formato valido");
                }
            }
        }
    }
    
}
