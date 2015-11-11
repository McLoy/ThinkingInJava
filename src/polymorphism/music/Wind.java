package polymorphism.music;

/**
 * Created by Ostin on 20.08.2015.
 */
public class Wind extends Instrument{
    public void play(Note n){
        System.out.println("Wind.play()" + n);
    }
}
