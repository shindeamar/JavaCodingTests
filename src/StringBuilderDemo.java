import java.util.Scanner;
public class StringBuilderDemo {
    public static void main(String[] argList) {
        String[] args = new String[]{"Test", null, "Test", "1", "2", "3", "test"};
        StringBuilder str = new StringBuilder();
        for (String arg : args) {
            if (str.indexOf(arg) < 1)
                str.append(arg + " ");
        }
        System.out.println(str.toString());
        Scanner sc = new Scanner(str.toString());
        while (sc.hasNext()) {
            if (sc.hasNextInt())
                System.out.print(sc.nextInt() + " ");
            else
                sc.next();
        }
    }
}