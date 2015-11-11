package polymorphism.music;

/**
 * Created by Ostin on 20.08.2015.
 */
class Brass extends Instrument {
    public void play(Note n) {
        System.out.println("Brass.play()"+n);
    }
}
