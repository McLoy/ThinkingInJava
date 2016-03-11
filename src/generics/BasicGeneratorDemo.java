package generics;

/**
 * Created by Ostin on 21.11.2015.
 */
import net.mindview.util.*;

public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
        for (int i = 0; i <5;i++)
            System.out.println(gen.next());
    }
}
