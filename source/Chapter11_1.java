class myCar{
    private String color;
    private int speed;


    public void setColor(String color){
        this.color = color;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    String getColor(){
        return color;
    }
    int getSpeed(){
        return speed;
    }
}

public class Chapter11_1 {
    public static void main(String[] args) {
        myCar car = new myCar();
        car.setColor("빨강");
        car.setSpeed(150);

        System.out.println(car.getColor());
        System.out.println(car.getSpeed());
    }
}
