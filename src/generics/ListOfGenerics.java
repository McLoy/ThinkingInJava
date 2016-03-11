package generics;

/**
 * Created by Ostin on 22.11.2015.
 */

import java.util.*;

public class ListOfGenerics<T> {
    private List<T> array = new ArrayList<T>();
    public void add(T item){array.add(item);}
    public T get(int index){ return array.get(index);}
}
