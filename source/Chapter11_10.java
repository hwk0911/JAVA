class Car{
    String color;
    int speed;
    static int count = 0;

    Car(){
        count++;
    }
}

public class Chapter11_10 {
    public static void main(String[] args) {
        Car myCar1 = new Car();
        System.out.println(myCar1.count);

        Car myCar2 = new Car();
        System.out.println(myCar2.count);

        Car myCar3 = new Car();
        System.out.println(myCar3.count);
    }
}
