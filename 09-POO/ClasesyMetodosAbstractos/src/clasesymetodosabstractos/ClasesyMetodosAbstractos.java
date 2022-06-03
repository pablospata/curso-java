package clasesymetodosabstractos;

public class ClasesyMetodosAbstractos {

    public static void main(String[] args) {
    
        //SerVivo servivo = new SerVivo();
        //Animal animal = new Animal();
        
        Planta planta = new Planta();
        AnimalCarnivoro carnivoro = new AnimalCarnivoro();
        AnimalHerbivoro herbivoro = new AnimalHerbivoro();
        
        planta.alimentarse();
        carnivoro.alimentarse();
        herbivoro.alimentarse();        
       
    }
    
}
 
/*
Tambien explica el polimorfismo... 
Upcasting, downcasting...

*/
 