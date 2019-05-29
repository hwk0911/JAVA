import java.io.BufferedReader;
import java.io.FileReader;

public class Chapter10_11 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("C:/WINDOWS/win.ini");
        BufferedReader br = new BufferedReader(fr);

        String str = null;
        int i = 1;
        while ((str = br.readLine()) != null) {
            System.out.printf("%d행 : ", i);
            System.out.println(str);
            i++;
        }

        br.close();
        fr.close();
    }
}
