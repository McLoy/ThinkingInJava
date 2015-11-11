package interfaces.filters;

/**
 * Created by Ostin on 02.10.2015.
 */
public class HighPass extends Filter{
    double cutoff;
    public HighPass(double cutoff){this.cutoff = cutoff;}
    public Waveform process(Waveform input){return input;}
}
