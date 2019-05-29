import java.io.FileOutputStream;

public class Chapter10_13 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fo = new FileOutputStream("C:/Users/Cpp/Desktop/abcd.txt");

        int ch;

        while((ch = System.in.read()) != '\n'){
            fo.write((byte) ch);
        }
        fo.close();
    }
}
