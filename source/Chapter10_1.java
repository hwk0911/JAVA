public class Chapter10_1 {
    public static void main(String[] args) {
        int[] aa = new int[3];
        try{
            aa[3] = 100;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stack overflow");
        }
    }
}
