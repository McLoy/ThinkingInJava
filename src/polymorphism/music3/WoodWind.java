package polymorphism.music3;

import polymorphism.music.Note;

/**
 * Created by Ostin on 20.08.2015.
 */
class WoodWind extends Wind {
    void play(Note n){
        System.out.println("WoodWind.play()" + n);
    }
    String what() {return "WoodWind";}
    }
