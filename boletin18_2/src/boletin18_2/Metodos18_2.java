package boletin18_2;

import javax.swing.JOptionPane;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Metodos18_2 {
    private int numAlumnos = pedirAlumnos();
    private int arrayNotas[] = new int [numAlumnos];
    
    
    
    public int pedirAlumnos(){
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce o numero de alumnos"));
    }
    public int pedirNota() {
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce nota: "));
    }
    public void cargarArray() {
        for (int i = 0; i < arrayNotas.length; i++) {
            arrayNotas[i] = pedirNota();
        }
    }
    public void numAprobSusp(){
        int a=0;
        int s=0;
        for (int i = 0; i < arrayNotas.length; i++){
            
            if (arrayNotas[i]<5){
                s++;
            }
            else
                a++;
        }
        JOptionPane.showMessageDialog(null, "Aprobados: "+a+"\nSuspensos: "+s);
    }
    public void calcularNotaMedia(){
        int acumulador=0;
        int notaMedia;
        
        for (int i=0; i<arrayNotas.length;i++){
            acumulador = acumulador+arrayNotas[i];
        }
        notaMedia = acumulador / arrayNotas.length;
        JOptionPane.showMessageDialog(null, "Nota media: "+notaMedia);
    }
    public void notaAlta(){
        int i, j, aux;
        for (i = 0; i < numAlumnos - 1; i++) {
            for (j = i + 1; j < numAlumnos; j++) {
                if (arrayNotas[i] > arrayNotas[j]) {
                    aux = arrayNotas[i];
                    arrayNotas[i] = arrayNotas[j];
                    arrayNotas[j] = aux;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "A nota mais alta e: "+arrayNotas[i]);
    }
    
   
    
}
    
