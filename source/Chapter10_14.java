import java.io.FileWriter;
import java.util.Scanner;

public class Chapter10_14 {
    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(System.in);
        FileWriter fw = new FileWriter("C:/Users/Cpp/Desktop/abcd.txt");

        String str;

        while(!(str = s.nextLine()).equals("")){
            fw.write(str + "\r\n");
        }
        fw.close();
    }
}
