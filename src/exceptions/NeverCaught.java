package exceptions;

/**
 * Created by Ostin on 21.11.2015.
 */
public class NeverCaught {
    static void f(){
        throw new RuntimeException("Из f()");
    }
    static void g(){
        f();
    }

    public static void main(String[] args) {
        g();
    }
}
