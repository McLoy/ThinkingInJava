package interfaces.interfaceprocessor;

/**
 * Created by Ostin on 02.10.2015.
 */
public interface Processor {

    String name();
    Object process(Object input);
}
