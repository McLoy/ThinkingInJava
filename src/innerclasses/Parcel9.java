package innerclasses;

import sun.security.krb5.internal.crypto.Des;

/**
 * Created by Ostin on 23.10.2015.
 */
public class Parcel9 {
    public Destination destination(final String dest){
        return new Destination() {
            private String label = dest;
                public String readLabel(){return label;}
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Тасмания");
    }
}
