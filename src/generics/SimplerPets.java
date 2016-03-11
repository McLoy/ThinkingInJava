package generics;

/**
 * Created by Ostin on 21.11.2015.
 */
import net.mindview.util.*;
import typeinfo.pets.*;
import java.util.*;

public class SimplerPets {
    public static void main(String[] args) {
        Map<Person,List<? extends Pet>> petPeople = New.map();
    }
}
