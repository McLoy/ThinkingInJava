package generics;

/**
 * Created by Ostin on 21.11.2015.
 */

import net.mindview.util.*;
import typeinfo.pets.*;
import java.util.*;

public class ExplicitTypeSpecification {
    static void f(Map<Person, List<Pet>> petPeople){}

    public static void main(String[] args) {
        f(New.<Person,List<Pet>>map());
    }
}
