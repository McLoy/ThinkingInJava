package interfaces.filters;

/**
 * Created by Ostin on 02.10.2015.
 */

public class LowPass extends Filter{
    double cutoff;
    public LowPass(double cutoff){this.cutoff = cutoff;}
    public Waveform process(Waveform input){
        return input;
    }
}
