package typeinfo;

/**
 * Created by Ostin on 16.11.2015.
 */

import typeinfo.interfacea.*;
import typeinfo.packageaccess.*;
import java.lang.reflect.*;


public class HiddenImplementation {
    public static void main(String[] args) throws Exception {
        A a = HiddenC.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        callHiddenMethod(a,"g");
        callHiddenMethod(a,"u");
        callHiddenMethod(a,"v");
        callHiddenMethod(a,"w");

    }
    static void callHiddenMethod(Object a, String methodName) throws Exception{
        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }
}
