package fr.univtln.ebagubair.tps;
import java.util.*;
/**
 * Hello world!
 */
public class App {
    
    public static void main(String[] args) {
        List<Animal> animaux = new ArrayList<Animal>();
        Animal lion1 = new Animal("Leo", 5, "Lion");
        Animal lion2 = new Animal("Leo", 3, "Lion");
        animaux.add(lion1);
        animaux.add(lion2);
        animaux.add(new Animal("Lecie", 4, "Chien"));
        animaux.add(new Animal("Cati", 2, "Chat"));
        animaux.add(new Animal("Toto", 2, "Lapin"));
        //assertTrue(animaux.add(lion1));
        //assertFalse(animaux.add(lion2));

        //System.out.println(animaux);
        InterfAnimal a = new Animal("gab", 5, "Lion");
        //a.parcourIterator(animaux);

        Collections.sort(animaux); // Trier par nom
        System.out.println(animaux);
        

        
    }
}
