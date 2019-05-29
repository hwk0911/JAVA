import java.io.*;

public class Chapter10_ex3 {
    public static void main(String[] args) throws Exception{
        FileInputStream fi = new FileInputStream("C:/Users/Cpp/Desktop/abcd.txt");
        FileOutputStream fo = new FileOutputStream("C:/Users/Cpp/Desktop/abcd2.txt");

        String str = "";
        int ch;

        while((ch = fi.read()) != -1){
            str += (char)ch;
        }
        for(int i = str.length() - 1 ; i >= 0 ;i--){
            fo.write(str.charAt(i));
        }
        fi.close();
        fo.close();
    }
}
