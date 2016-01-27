package boletin18_1;

import javax.swing.JOptionPane;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Metodos18 {
    
    private int arrayNumeros[] = new int [50];
    
    public void cargarArray(){
        for (int i=0;i<arrayNumeros.length;i++){
            arrayNumeros[i]=i;
        }
    }
    public void numAleatorio(){
        int x;
        for (int j=0;j<6;j++){
            x = (int) (Math.random()*50);
            arrayNumeros[j] = Math.round(x);
            JOptionPane.showMessageDialog(null, x);
        }
    }
    
    
}
