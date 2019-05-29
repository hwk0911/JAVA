public class Chapter10_2 {
    public static void main(String[] args) {
        int[] aa = new int[3];
        try{
            aa[2] = 100 / 0;
            aa[3] = 200;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Stack overflow");
        }catch (ArithmeticException e){
            System.out.println("부정");
        }finally{
            System.out.println("상시출력");
        }
    }
}
