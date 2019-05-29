import java.io.FileInputStream;

public class Chapter10_9 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("C:/Users/Cpp/Desktop/abcd.txt");

        int ch;

        while((ch = fis.read()) != -1){
            System.out.print((char)ch);
        }

        fis.close();
    }
}
