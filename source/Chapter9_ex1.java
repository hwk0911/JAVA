import java.io.BufferedReader;
import java.util.Scanner;

public class Chapter9_ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;

        str = s.nextLine();

        for(int i = str.length() - 1 ; i >=0 ; i--){
            System.out.print(str.charAt(i));
        }
    }
}

//C++ 과 같이 조건식 안에 변수자체를 넣을 수 없는듯 하다.