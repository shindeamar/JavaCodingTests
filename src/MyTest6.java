public class MyTest6 {
    public static void main(String[] args) {
        int a = 0;
        System.out.println((a != 0) ? "true" : "false");

        String e = "1";
        System.out.println(("1" != e) ? "true" : "false");

        int c = 0;
        System.out.println((0 == c++) ? "true" : "false");

        Double d = null;
        System.out.println((d instanceof Double) ? "true" : "false");

        boolean b = false;
        System.out.println((b = true) ? "true" : "false");
    }
}
