import com.sun.xml.internal.ws.api.model.CheckedException;

import java.util.*;
import java.util.function.*;
class Namer {
    final private String firstName,lastName;
    public Namer(String fn,String ln) { firstName=fn; lastName=ln;}
    public String getFirstName() { return firstName; }
    public String getLastName()  { return lastName;  }
}
class Sorter {
    public static void main(String[] args) {
        Consumer<Namer> printit = e -> System.out.println(e.getFirstName() + " " + e.getLastName());
        List<Namer> names = new ArrayList(Arrays.asList(
                new Namer("Harry","Smith"),new Namer("Joe","Smith"),new Namer("Jane","Doe"),
                new Namer("Mary","Jane"),new Namer("Harry","Homeowner")));

        Function<Namer,String> conv = i -> i.getFirstName();
        Comparator<Namer> comparator = Comparator.comparing(conv);
        names.sort(comparator.reversed());
        names.forEach(printit);

        Runnable r = () -> System.out.println("HI");
        new Thread(r).start();
    }
}
class MyException extends Exception{
    public String getReason() throws Exception{
        throw new Exception();
    }
}
class MyException2 extends RuntimeException {
    final Optional<String> reason;
    MyException2() {
        super();
        reason = Optional.empty();
    }
    MyException2(String s) {
        super(s);
        reason = Optional.ofNullable(s);
    }
    @Override public String getLocalizedMessage() {
        return reason.orElse("No Reason Given");
    }
}