package arrays;

/**
 * Created by Ostin on 22.11.2015.
 */

import java.util.*;

public class MultidimentionalObjectArrays {
    public static void main(String[] args) {
        BerylliumSphere[][] spheres = {
                {new BerylliumSphere(), new BerylliumSphere()},
                {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()},
                {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(),
                        new BerylliumSphere(), new BerylliumSphere()},
        };
        System.out.println(Arrays.deepToString(spheres));
    }
}
