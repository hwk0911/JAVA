public class Chapter10_4 {
    public static void main(String[] args) throws Exception {
        int a = 0, b = 10;
        int result;
        try{
            if (a==0)
                throw new Exception("0 by num = 0");
            result = a/ b;
        }catch(Exception e){
            System.out.println("부정");
            System.out.println(e.getMessage());
        }
    }
}
