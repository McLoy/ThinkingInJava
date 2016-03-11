package generics;

/**
 * Created by Ostin on 22.11.2015.
 */

import java.util.*;

public class CompilerIntelligence {
    public static void main(String[] args) {
        List<? extends Fruit> flist = Arrays.asList(new Apple());
        Apple a = (Apple)flist.get(0);
        flist.contains(new Apple());
        flist.indexOf(new Apple());
    }
}
