import java.util.Set;

public class JavaClass {
    public static void main(String arg[]) {
        //meth(arg);
    }
    public void meth(String[] arg) {
        System.out.println(arg);
        System.out.println(arg[1]);
    }
}

class MyCollection<T> {
    private Set<T> set;
    public Set<T> getCollection() {
        return this.set;
    }

    public void TestCollection(MyCollection<?> collection) {
        Set<?> set = collection.getCollection();
    }
}

