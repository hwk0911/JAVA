import java.util.Scanner;

public class Chapter9_ex2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                System.out.print((char)(str.charAt(i) + ('a' - 'A')));
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                System.out.print((char)(str.charAt(i) - ('a' - 'A')));
            else
                System.out.print(str.charAt(i));
        }
    }
}
