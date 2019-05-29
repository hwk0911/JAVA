class Car2{
    String color;
    int speed;
    private static int count = 0;

    Car2(){
        count++;
    }

    static int getCount(){
        return count;
    }
}

public class Chapter11_11 {
    public static void main(String[] args) {
        System.out.println(Car2.getCount());

        Car2 myCar = new Car2();
        System.out.println(myCar.getCount());
    }
}
