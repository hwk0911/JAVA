import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Chapter10_15 {
    public static void main(String[] args) throws Exception{
        FileInputStream fi = new FileInputStream("C:/Users/Cpp/Desktop/abcd.txt");
        FileOutputStream fo = new FileOutputStream("C:/Users/Cpp/Desktop/abcd2.txt");

        int ch;

        while((ch = fi.read()) != -1){
            fo.write((byte)ch);
        }

        System.out.println("복사완료");
        fi.close();
        fo.close();
    }
}
