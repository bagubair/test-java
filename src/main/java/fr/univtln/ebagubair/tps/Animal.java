package fr.univtln.ebagubair.tps;
import java.time.LocalDate;
import java.util.*;

public class Animal implements InterfAnimal, Comparable<Animal>{

    private String nom;
    private int age;
    private String espece;
    private double poids;
    private LocalDate dernierExamen;

    public Animal( String nom, int age, String espece){
        this.nom = nom;
        this.age = age;
        this.espece = espece;
    }
    
    public String getNom(){
        return nom;
    }
    public int getAge(){
        return age;
    }
    public String getEspece(){
        return espece;
    }
    public double getPoids(){
        return poids;
    }

    public void setNom(String nom){
        this.nom = nom;
    }
    public void setAge( int age){
        this.age = age;
    }
    public void setEspece( String espece){
        this.espece = espece;
    }
    public void setPoids( double poids){
        this.poids = poids;
    }
    public String toString ( ) {
        return "Animal(nom="+nom+",age="+age+",espece="+espece+")";
    }
    

    @Override
    public boolean equals(Object objet){
        if( this == objet ){
            return true;
        }
        if (objet == null || getClass() != objet.getClass()) return false;
        Animal animal = (Animal)objet;
        return nom == animal.getNom();
    }

    @Override
    public int hashCode() {
        return nom == null ? 0 : nom.hashCode();
    }
    @Override
    public void parcourIterator( Set<Animal> animaux){
        Iterator<Animal> itAnimeauxIterator = animaux.iterator();
        while (itAnimeauxIterator.hasNext()){
            System.out.println(itAnimeauxIterator.next());
        }
    }

    public void parcourForEatch(Set<Animal> animaux){
        for(Animal animal : animaux) {
            System.out.println(animal);
        }
    }

    public int compareTo (Animal a) {
        return nom.compareTo(a.nom);
    }
    

}
