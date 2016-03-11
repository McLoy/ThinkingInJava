package generics.coffee;

/**
 * Created by Ostin on 21.11.2015.
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;
    public String toString(){
        return getClass().getSimpleName() + " " + id;
    }
}
