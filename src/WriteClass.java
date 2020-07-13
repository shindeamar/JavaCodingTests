import java.io.*;
import java.util.stream.*;
class WriteClass {
    public static void main(String[] args) throws Exception {
        File file = new File("Data.txt");
        FileWriter output = new FileWriter(file);
        for (int i = 0; i < 5; i++)
            output.write(String.valueOf(i));

        PrintWriter p = new PrintWriter(output);
        Stream.of('0','1','2','3','4').forEach(p::write);

        output.write(new char[] {'0', '1', '2', '3', '4'});
        output.flush();
    }
}