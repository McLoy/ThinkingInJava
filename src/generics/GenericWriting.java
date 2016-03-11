package generics;

/**
 * Created by Ostin on 22.11.2015.
 */

import java.util.*;

public class GenericWriting {
    static <T> void writeExtract(List<T> list, T item){
        list.add(item);
    }
    static  List<Apple> apples = new ArrayList<Apple>();
    static List<Fruit> fruit = new ArrayList<Fruit>();

    static void f1(){
        writeExtract(apples, new Apple());
    }

    static <T> void writeWithWildcard(List<? super T> list, T item){
        list.add(item);
    }
    static void f2() {
        writeWithWildcard(apples, new Apple());
        writeWithWildcard(fruit, new Apple());
    }

    public static void main(String[] args) {
        {f1();f2();}
    }
}
