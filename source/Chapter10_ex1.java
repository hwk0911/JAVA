import java.util.Scanner;

public class Chapter10_ex1 {
    public static void main(String[] args) throws Exception{
        int first, second;
        char symbol;
        Scanner s = new Scanner(System.in);

        first = s.nextInt();
        symbol = s.next().charAt(0);
        second = s.nextInt();
        switch (symbol){
            case '+':
                System.out.println(first + second);
                break;
            case '-':
                System.out.println(first - second);
                break;
            case '*':
                System.out.println(first * second);
                break;
            case '/':
                try{
                    System.out.println(first / second);
                }catch (ArithmeticException e){
                    System.out.println(e.getMessage());
                }
        }
    }
}
