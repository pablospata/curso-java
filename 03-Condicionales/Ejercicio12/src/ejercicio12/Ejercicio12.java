/*
 EJERCICIO 12

Pedir una nota de 0 a 10 y mostrarla de la forma:
Insuficiente (4 o menos)
Suficiente (5)
Bien (6)
Notable (7 u 8)
Sobresaliente (9 o 10)

 */
package ejercicio12;

import javax.swing.JOptionPane;

public class Ejercicio12 {
    
    public static void main(String[] args) {

        int nota;
        String notaString = " ";
        
        nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su nota"));
        
        switch(nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                notaString = "Insuficiente";
                break;
            case 5:
                notaString = "Suficiente";
                break;
            case 6:
                notaString = "Bien";
                break;
            case 7:
            case 8:
                notaString = "Notable";
                break;
            case 9:
            case 10:
                notaString = "Sobresaliente";
                break;
            default: {
            JOptionPane.showMessageDialog(null, "Nota incorrecta");
            return;
            }
        }
                                             
        JOptionPane.showMessageDialog(null, "Su nota es: "+notaString);
        
        
    }
    
}


/*
Con if y else seria:


        if(nota <= 4 && nota >= 0)
            notaString = "Insuficiente";
        else if(nota == 5)
            notaString = "Suficiente";
        else if(nota == 6)
            notaString = "Bien";
        else if(nota == 7 || nota == 8)
            notaString = "Notable";
        else if(nota == 9 || nota == 10)
            notaString = "Sobresaliente";
        else
        {
            JOptionPane.showMessageDialog(null, "Nota incorrecta");
            return;
        }

*/