public class MyTest2 {
    public MyTest2() {
        this(10);
    }
    public MyTest2(int data) {
        this.data = data;
    }
    public void display() {
        class Decrementer {
            public void decrement () {
                data--;
            }
        }
        Decrementer d = new Decrementer();
        d.decrement();
        System.out.println("data = " + data);
    }

    private int data;

    public static void main (String [] args) {
        int data = 0;
        MyTest2 t = new MyTest2();
        t.display();
        System.out.println("data = " + data);
    }
}