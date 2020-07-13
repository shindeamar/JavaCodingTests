public class MyTest {
    public static void main (String [] args) {
        int a = 9, b = 2;
        float f;
        f = a / b;
        System.out.println("f = " + f);
        f = f / 2;
        System.out.println("f = " + f);
        f = a + b / f;
        System.out.println("f = " + f);

        Integer number1 = new Integer(1);
        Integer number2 = number1;
        number1+=1;
        System.out.println(number1);
        System.out.println(number2);
    }
}