package polymorphism.music3;

import polymorphism.music.Note;

/**
 * Created by Ostin on 20.08.2015.
 */
class Brass extends Wind{
    void play(Note n){
        System.out.println("Brass.play()" + n);
    }

    void adjust(){
        System.out.println("Adjusting Brass");}
}
