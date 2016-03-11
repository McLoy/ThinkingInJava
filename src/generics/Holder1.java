package generics;

/**
 * Created by Ostin on 21.11.2015.
 */

class Automobile{}

public class Holder1 {
    private Automobile a;
    public Holder1(Automobile a){this.a = a;}
    Automobile get(){return a;}
}
