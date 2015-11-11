package polymorphism.music3;

import polymorphism.music.Note;

/**
 * Created by Ostin on 20.08.2015.
 */
class Stringed extends Instrument {
    void play(Note n){
        System.out.println("Stringed.play()" + n);
    }
    String what() {return "Stringed";};
    void adjust(){
        System.out.println("Adjusting Stringed");}
}
