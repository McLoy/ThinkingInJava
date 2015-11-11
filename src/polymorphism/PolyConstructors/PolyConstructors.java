package polymorphism.PolyConstructors;

/**
 * Created by Ostin on 24.09.2015.
 */

class Glyph {
    void draw(){
        System.out.println("Glyph draw()");
    }
    Glyph(){
        System.out.println("Glyph() перед вызовом draw()");
        draw();
        System.out.println("Glyph() после вызова draw()");
    }
}

class RoundGlyph extends Glyph{
    private int radius = 1;
    RoundGlyph(int r){
        radius = r;
        System.out.println("RoundGlyph RoundGlyph().radius = " + radius);
    }
    void draw(){
        System.out.println("RoundGlyph.draw().radius = " + radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
