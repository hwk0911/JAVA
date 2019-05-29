public class Chapter10_3 {
    public static void main(String[] args) {
        int a = 100, b = 0;
        int result;
        try{
            result = a / b;
        }catch(ArithmeticException e){
            System.out.println("부정");
            System.out.println(e.getMessage());
        }
    }
}
