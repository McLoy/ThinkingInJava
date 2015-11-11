package polymorphism.music3;

import polymorphism.music.Note;

/**
 * Created by Ostin on 20.08.2015.
 */
class Wind extends Instrument {
    void play(Note n){
        System.out.println("Wind.play()" + n);
    }
    String what() {return "Wind";};
    void adjust(){
        System.out.println("Adjusting Wind");}
}

