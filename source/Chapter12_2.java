class Car4{
    Car4(){
        System.out.println("슈퍼클래스 생성자 호출");
    }
}

class Sedan2 extends Car4{
    Sedan2(){
        System.out.println("서브 클래스 생성자 호출");
    }
}

class fff extends Sedan2{
    fff(){
        System.out.println("Sedna2의 상속 클래스 생성자 호출");
    }
}

public class Chapter12_2 {
    public static void main(String[] args) {
        fff f = new fff();
    }
}
