package switchyternario;

import javax.swing.JOptionPane;

public class SwitchyTernario {

    public static void main(String[] args) {

        int dato;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero "
                + "entre 1 y 4"));
        
        switch(dato) {
            case 1: JOptionPane.showMessageDialog(null,"Es el numero 1");
                break;
            case 2: JOptionPane.showMessageDialog(null,"Es el numero 2");
                break;
            case 3: JOptionPane.showMessageDialog(null,"Es el numero 3");
                break;
            case 4: JOptionPane.showMessageDialog(null,"Es el numero 4");
                break;              
            default: JOptionPane.showMessageDialog(null,"El numero no esta en "
                    + "el rango de 1 a 4");
            
        }
        
        /*
            
        OPERADOR TERNARIO
        valor = (Condicion) ? valor1 : valor2

        */
            
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite otro "
                + "entero "));
        
        String mensaje = (dato % 2 == 0) ? "es par" : "es impar";
        
        JOptionPane.showMessageDialog(null,"El numero " + mensaje);
        
    }
    
}
