package innerclasses;

/**
 * Created by Ostin on 23.10.2015.
 */
public class Parcel11 {
    private static class ParcelContents implements Contents{
        private int i = 11;
        public int value(){return i;}
    }
    protected static class ParcelDestination implements Destination{
        private String label;
        private ParcelDestination(String whereTo){
            label = whereTo;
        }
        public String readLabel(){return label;}
        public static void f(){}
        static int x = 10;
        static class AnotherLevel{
            public static void f(){
                int x = 10;
            }
        }
    }
    public static Destination destination(String s){return new ParcelDestination(s);}
    public static Contents cont(){return new ParcelContents();}

    public static void main(String[] args) {
        Contents c = cont();
        Destination d = destination("Тасмания");
    }
}
