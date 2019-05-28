import java.util.Scanner;

public class Chapter2_ex1 {
    public static void main(String[] args) {
        int a[];
        a = new int[4];


        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("계산할 값을 입력 : ");
            a[i] = s.nextInt();
        }
        System.out.print(a[0] + "+" + a[1] + "+" + a[2] + "+" + a[3] + "=" + (a[0] + a[1] + a[2] + a[3]));
    }
}
