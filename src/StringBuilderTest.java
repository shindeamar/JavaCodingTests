import java.io.*;
import java.util.Properties;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class StringBuilderTest{
    public StringBuilderTest() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        StringBuilder builder = new StringBuilder("Wellcome everybody");
        StringJoiner joiner = new StringJoiner(" ","H","?");
        builder.replace(0, 7, "elcome");
        builder.setCharAt(7, '!');
        joiner.add("ello and").add(builder);
        System.out.println(joiner.toString());

       // BufferedReader inputStream = new BufferedReader("input.dat");
        //BufferedReader inputStream = new BufferedReader(new InputStreamReader("input.dat"));
        //BufferedReader inputStream = new BufferedReader(new File("input.dat"));
        //FileReader inputStream = new FileReader("input.dat");
        //BufferedReader inputStream = new BufferedReader(new FileReader("input.dat"));

             Properties p = new Properties();
                     p.load(new FileInputStream("props.properties"));
                     Stream.of(p.getProperty("a"),new Integer(p.getProperty("b")))
                                .forEach(s -> System.out.print(s));
               }

}