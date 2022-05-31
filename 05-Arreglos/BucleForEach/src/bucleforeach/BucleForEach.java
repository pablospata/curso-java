
package bucleforeach;

public class BucleForEach {

    public static void main(String[] args) {
        
        String[] nombres = {"Alejandro", "Maria", "Luis", "Juan", "Narcisa", "Juan"};
        
        for(int i = 0; i < 6; i++) {
            System.out.println(nombres[i]);
        }
        
        for(int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
        
        //For each o mejorado
        System.out.println("\nBucle con for each o mejorado");
        
        for(String i:nombres) {
            System.out.println(i);
            
        }
        
    }
    
}
