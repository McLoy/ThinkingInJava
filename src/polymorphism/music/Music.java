package polymorphism.music;

/**
 * Created by Ostin on 20.08.2015.
 */
public class Music{
    public static void tune(Wind i){
        i.play(Note.MIDDLE_C);
    }
    public static void tune(Stringed i){
        i.play(Note.MIDDLE_C);
    }
    public static void tune(Brass i){
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute);
        tune(violin);
        tune(frenchHorn);
    }
}

//public class Music {
//    public static void tune(Instrument i){
//        i.play(Note.MIDDLE_C);
//    }
//
//    public static void main(String[] args) {
//        Wind flute = new Wind();
//        tune(flute);
//    }
//}
