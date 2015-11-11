package interfaces.filters;

/**
 * Created by Ostin on 02.10.2015.
 */
public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input){return input;}
}
