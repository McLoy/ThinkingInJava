package generics;

/**
 * Created by Ostin on 22.11.2015.
 */
public class ReturnGenericType<T extends HasF> {
    private T obj;
    public ReturnGenericType(T x){obj = x;}
    public T get(){return obj;}
}
