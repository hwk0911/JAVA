import java.util.Random;

public class Chapter9_ex3 {
    static int rand(int arr[]){
        Random r = new Random();
        int rand;
        do{
            rand = r.nextInt(45);
        }while(arr[rand] == 50);
        arr[rand] = 50;
        rand++;
        return rand;

    }

    public static void main(String[] args) {
        int arr[] = new int[45];

        for(int i = 0 ; i < 45 ; i++)
            arr[i] = i+1;

        for(int i = 0 ; i < 6 ; i++)
            System.out.print("\t" + rand(arr));
    }
}
