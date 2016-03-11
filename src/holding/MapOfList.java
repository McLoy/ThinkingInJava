package holding;

/**
 * Created by Ostin on 19.11.2015.
 */

import typeinfo.pets.*;
import java.util.*;


public class MapOfList {
    public static Map<Person, List<? extends  Pet>>
    petPeople = new HashMap<Person, List<? extends Pet>>();
    static {
        petPeople.put(new Person("Dawn"),
                Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
        petPeople.put(new Person("Kate"), Arrays.asList(new Cat("Shakleton"), new Cat("Elsie May"), new Dog("Margarett")));
        petPeople.put(new Person("Marlyn"),
                Arrays.asList(new Pug("Loike aka Louis Snorkelstein Dupree"),
                new Cat("Standford aka Stinky el Negro"),
                new Cat("Pinkola")));
        petPeople.put(new Person("Luke"),
        Arrays.asList(new Rat("Fuzzy"), new Rat("Fizzy")));
        petPeople.put(new Person("Isaac"),
                Arrays.asList(new Rat("Freckly")));
    }

    public static void main(String[] args) {
        System.out.println("People: " + petPeople.keySet());
        System.out.println("Pets: " + petPeople.values());
        for (Person person : petPeople.keySet()){
            System.out.println(person + " has:");
            for (Pet pet:petPeople.get(person))
                System.out.println("    " + pet);
        }
    }
}
