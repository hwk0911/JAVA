import java.io.IOException;

public class Chapter10_8 {
    public static void main(String[] args) throws IOException {
        String userName = "hanbit";
        String input = "";
        int key;

        try{
            System.out.print("이름 ==> ");
            while((key = System.in.read()) != '\n' ){
                input += Character.toString((char)key);
            }

            if(input.equals(userName))
                System.out.println(input + "님 어서오세요");
            else
                System.out.println(input + "님 등록이 안되었습니다 ~~");
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
