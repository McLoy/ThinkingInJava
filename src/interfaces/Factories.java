package interfaces;

import com.sun.istack.internal.Pool;

/**
 * Created by Ostin on 03.10.2015.
 */
interface Service{
    void method1();
    void method2();
}

interface ServiceFactory{
    Service getService();
}

class Implementation1 implements Service{
    Implementation1(){}
    public void method1(){
        System.out.println("Implementation1 method1");
    }
    public void method2(){
        System.out.println("Implementation1 method2");
    }
}

class Implemenation1Factory implements ServiceFactory{
    public Service getService(){
        return new Implementation1();
    }
}

class Implementation2 implements Service{
    Implementation2(){}
    public void method1(){
        System.out.println("Implementation2 method1");
    }
    public void method2(){
        System.out.println("Implementation2 method2");
    }
}

class Implemenation2Factory implements ServiceFactory{
    public Service getService(){
        return new Implementation2();
    }
}

public class Factories {
    public static void serviceConsumer(ServiceFactory fact){
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Implemenation1Factory());
        serviceConsumer(new Implemenation2Factory());
    }
}
