package exceptions;

import innerclasses.AnonymousConstructor;

/**
 * Created by Ostin on 21.11.2015.
 */

class Annoyance extends Exception{}
class Sneeze extends Annoyance{}

public class Human {
    public static void main(String[] args) {
        try{
            throw new Sneeze();
        }catch (Sneeze s){
            System.out.println("Перехвачено Sneeze");
        }catch (Annoyance a){
            System.out.println("Перехвачено Annoyance");
        }

        try{
            throw new Sneeze();
        }catch (Annoyance a){
            System.out.println("Перехвачено Annoyance");
        }
    }
}
