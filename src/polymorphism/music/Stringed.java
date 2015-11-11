package polymorphism.music;

/**
 * Created by Ostin on 20.08.2015.
 */
class Stringed extends Instrument{
    public void play(Note n){
        System.out.println("Stringed.play()"+n);
    }
}
