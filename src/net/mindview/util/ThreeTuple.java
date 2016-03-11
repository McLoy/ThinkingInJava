package net.mindview.util;

/**
 * Created by Ostin on 21.11.2015.
 */
public class ThreeTuple<A,B,C>  extends TwoTuple<A,B>{
    public final C third;
    public ThreeTuple(A a, B b, C c){super(a,b);third = c;}
    public String toString(){
        return "(" + first + ", " + second + ", " + third + ")";
    }
}
