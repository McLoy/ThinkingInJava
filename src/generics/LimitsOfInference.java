package generics;

/**
 * Created by Ostin on 21.11.2015.
 */
import net.mindview.util.New;
import typeinfo.pets.*;
import java.util.*;

public class LimitsOfInference {
    static void
    f(Map<Person,List<? extends Pet>> petPeople){}

    public static void main(String[] args) {
        //f(New.map()); не компилируется
    }
}
