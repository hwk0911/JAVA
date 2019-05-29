import java.io.File;
import java.util.Scanner;

public class Chapter10_12 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(new File("C:/Users/Cpp/Desktop/abcd.txt"));

        int hap = 0;

        while (s.hasNextLine()) {
            hap += s.nextInt();
        }

        System.out.println(hap);

        s.close();
    }
}
