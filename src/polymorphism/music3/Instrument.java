package polymorphism.music3;

/**
 * Created by Ostin on 20.08.2015.
 */
import polymorphism.music.Note;


class Instrument {
    void play(Note n){
        System.out.println("Instrument.play()" + n);
    }
    String what() {return "Instrument";};
    void adjust(){
        System.out.println("Adjusting Instrument");
    }
}
