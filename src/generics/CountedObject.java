package generics;

/**
 * Created by Ostin on 21.11.2015.
 */
public class CountedObject {
    private static long counter = 0;
    private final long id = counter++;
    public long id(){return id;}
    public String toString(){return "CountedObject " + id;}
}
