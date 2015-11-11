package interfaces.filters;

/**
 * Created by Ostin on 02.10.2015.
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString(){return "Waveform "+ id;}

}
