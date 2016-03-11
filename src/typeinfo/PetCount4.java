package typeinfo;

/**
 * Created by Ostin on 14.11.2015.
 */
import typeinfo.pets.*;
import java.util.*;
import net.mindview.util.*;

public class PetCount4 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for (Pet pet: Pets.createArray(20)){
            System.out.println(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        System.out.println();
        System.out.println(counter);
    }
}
