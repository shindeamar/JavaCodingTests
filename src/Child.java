import java.io.IOException;
import java.rmi.RemoteException;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

class Parent {
    protected static int count = 0;
    public Parent() { count++; }
    static int getCount() { return count; }
}

public class Child extends Parent {
    public Child() { count++; }
    public static void main(String [] args)  {
        System.out.println("Count = " + getCount());
        Child obj = new Child();
        System.out.println("Count = " + getCount());
    }
}