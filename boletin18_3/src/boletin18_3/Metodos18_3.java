package boletin18_3;

import javax.swing.JOptionPane;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Metodos18_3 {
    private int numAlumnos = pedirAlumnos();
    private int arrayNotas[] = new int [numAlumnos];
    private String arrayNomes[] = new String [numAlumnos];
    
    
    public int pedirAlumnos(){
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce o numero de alumnos"));
    }
    public int pedirNota() {
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce nota: "));
    }
    public String pedirNome() {
        return JOptionPane.showInputDialog("Introduce nome: ");
    }
    public void cargarArray() {
        for (int i = 0; i < arrayNotas.length; i++) {
            arrayNomes[i] = pedirNome();
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
    
    public void verAprobados(){
        String resultados="";
        for (int i = 0; i < arrayNotas.length; i++){
            if (arrayNotas[i]>=5){
                resultados = resultados + "\n Nome: " + arrayNomes[i] + "| Nota: " + arrayNotas[i];
            }        
        }
        JOptionPane.showMessageDialog(null, "APROBADOS\n"+resultados);
    }
    public void ordenacion() {
        int i, j, aux;
        String nomaux;
        for (i = 0; i < numAlumnos - 1; i++) {
            for (j = i + 1; j < numAlumnos; j++) {
                if (arrayNotas[i] > arrayNotas[j]) {
                    aux = arrayNotas[i];
                    arrayNotas[i] = arrayNotas[j];
                    arrayNotas[j] = aux;

                    nomaux = arrayNomes[j];
                    arrayNomes[j] = arrayNomes[i];
                    arrayNomes[i] = nomaux;
                }

            }

        }
    }
    public void visualizar() {
        String resultados = "";
        for (int i = 0; i < arrayNomes.length; i++) {
            resultados = resultados + "\n Nome: " + arrayNomes[i] + "| Nota: " + arrayNotas[i];
        }

        JOptionPane.showMessageDialog(null, resultados);
    }
    public void buscarNotaAlum() {
        
        String nomeBuscar = pedirNome();
        boolean atopado = false;
        for (int i = 0; i < arrayNomes.length; i++) {
            if (nomeBuscar.equalsIgnoreCase(arrayNomes[i])) {
                JOptionPane.showMessageDialog(null, "Nota= " + arrayNotas[i]);
                atopado = true;
            }
        }
        if (atopado==false)
            JOptionPane.showMessageDialog(null, "Nome non atopado");
    }
    
 
}
    
