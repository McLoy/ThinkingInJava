package innerclasses;

/**
 * Created by Ostin on 23.10.2015.
 */
public interface ClassInInterface {
    void howdy();
    class Test implements ClassInInterface{
        public void howdy(){
            System.out.println("Привет!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
