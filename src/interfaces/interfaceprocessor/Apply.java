package interfaces.interfaceprocessor;

/**
 * Created by Ostin on 02.10.2015.
 */


public class Apply {
    public static void process(Processor p, Object s){
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));

    }
}
