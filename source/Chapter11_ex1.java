class Pet{
    private String Statuus = "움직입니다.";
    private int month;
    private String name;
    static private int count = 0;

    Pet(String name, int month){
        this.name = name;
        this.month = month;
        count++;
    }


    void getStatus(){
        System.out.println(this.name + "가 움직입니다.");
    }
    void getMonth(){
        System.out.println(this.name + "는" + this.month + "개월입니다.");
    }
    static void getMari(){
        System.out.println("현재 우리집 애완동물 수는 " + count + "마리입니다.");
    }
}

public class Chapter11_ex1 {
    public static void main(String[] args) {
        Pet dog = new Pet("강아지", 8);
        Pet cat = new Pet("고양이", 13);

        dog.getStatus();
        cat.getStatus();
        dog.getMonth();
        cat.getMonth();

        Pet.getMari();
    }
}
