package bucles;

public class Bucles {

    public static void main(String[] args) {

        System.out.println("\nBucle While");
        int i = 1;
        while(i <= 10) {
            System.out.println(i);
            i++;
        }
        
        i = 10;
        while(i >= 1) {
            System.out.println(i);
            i--;
            
        }
        
        i = 0;
        while(i <= 40) {
            System.out.println(i);
            i += 3;
        }
        
        System.out.println("\nBucle Do-While");
        i = 1;
        do {
            System.out.println(i);
            i++;
            
        } while (i <= 20);
        
        System.out.println("\nBucle For");
        
        for(int j = 1; j <= 10; j++)
            System.out.println(j);
    }
    
}