package polymorphism.music3;

import polymorphism.music.Note;

/**
 * Created by Ostin on 20.08.2015.
 */
class Percussion extends Instrument {
    void play(Note n){
        System.out.println("Percussion.play()" + n);
    }
    String what() {return "Percussion";};
    void adjust(){
        System.out.println("Adjusting Percussion");}
}
