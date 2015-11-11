package innerclasses;

import interfaces.interfaceprocessor.StringProcessor;
import sun.security.krb5.internal.crypto.Des;

/**
 * Created by Ostin on 23.10.2015.
 */
public class Parcel10 {
    public Destination
    destination(final String dest, final float price){
        return new Destination() {
          private int cost; {
                cost = Math.round(price);
                if(cost>100)
                    System.out.println("Превышение бюджета!");
            }
            private String label = dest;
            public String readLabel(){return label;}
        };
    }

    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Тасмания", 101);
    }
}
