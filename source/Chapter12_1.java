class Car3 {
    String color;
    int speed;

    void upSpeed(int value) {
        speed += value;
    }

    void downSpeed(int value) {
        speed -= value;
    }
}

class Sedan extends Car3{
    int seatNum;

    int getSeatNum(){
        return seatNum;
    }
}

class Truck extends Car3{
    int capacity;

    int getCapacity(){
        return capacity;
    }
}

public class Chapter12_1 {
    public static void main(String[] args) {
        Sedan sedan1 = new Sedan();
        Truck truck1 = new Truck();

        sedan1.upSpeed(100);
        truck1.upSpeed(200);

        sedan1.seatNum = 50;
        truck1.capacity = 100;

        System.out.println(sedan1.speed + " " + sedan1.getSeatNum());
        System.out.println(truck1.speed + " " + truck1.getCapacity());
    }
}
