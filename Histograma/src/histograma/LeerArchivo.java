/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package histograma;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Victor
 */
public class LeerArchivo {
    public void lee(){
        try {
            FileReader entrada = new FileReader("C:\\Users\\Victor\\Desktop\\txt\\cuento.txt");
            int c = entrada.read();
            while(c!=-1){
                c = entrada.read();
                char letra = (char)c;
                System.out.print(letra);
            }
        } catch (IOException ex) {
            System.out.println("No se ha encontrado el archivo");
        }
    }
}
