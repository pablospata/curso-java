/*
 MIEMBROS ESTATICOS

*/
package miembrosestaticos;

public class MiembrosEstaticos {

    private static String frase = "Primera frase";    
    
    public static void main(String[] args) {
        MiembrosEstaticos ob1 = new MiembrosEstaticos();
        MiembrosEstaticos ob2 = new MiembrosEstaticos();
        
        ob2.frase = "Segunda frase";
        
        System.out.println(ob1.frase);
        System.out.println(ob2.frase);        
        
        
        System.out.println(MiembrosEstaticos.frase);
        
    }
    
}

