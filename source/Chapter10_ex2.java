import java.io.FileOutputStream;

public class Chapter10_ex2 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fo = new FileOutputStream("C:/Users/Cpp/Desktop/abcd.txt");

        String str = "";
        int ch;


        for(int i = 2 ; i <= 9 ; i++){
            str += (" #제" + i + "단# ");
        }
        for(int i = 0 ; i < str.length() ;i++){
            fo.write(str.charAt(i));
        }
        fo.write('\n');
        str = "";
        for(int i = 2 ; i <= 9 ;i++){
            for(int j = 1 ; j <= 9 ;j++){
                str += (" " + j + " X " + i + " = " + i*j);
            }
            for(int k = 0 ; k < str.length() ; k++){
                fo.write(str.charAt(k));
            }
            fo.write('\n');
            str = "";
        }
        fo.close();
    }
}
