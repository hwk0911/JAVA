import java.util.Scanner;

public class Chapter2_ex2 {
    public static void main(String[] args) {
        int a, b;
        int sym;
        int result;

        Scanner s = new Scanner(System.in);
        System.out.print("첫번째 계산할 값을 입력하세요 ==>");
        a = s.nextInt();
        System.out.print("<1>덧셈 <2>뺼셈 <3>곱셈 <4>나눗셈");
        sym = s.nextInt();
        System.out.print("두번째 계산할 값을 입력하세요 ==>");
        b = s.nextInt();

        switch(sym){
            case 1:
                result = a+b;
                break;
            case 2:
                result = a  - b;
                break;
            case 3:
                result = a * b;
                break;
            default:{
                if(b != 0)
                    result = a / b;
                else {
                    System.out.print("부정");
                    return ;
                }
            }
        }
        System.out.print(result);
    }
}

// 0으로 나눔에 대한 예외처리 완료.