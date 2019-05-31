interface Car5{
    void work();
}

interface Cannon{
    void fire();
}

class Tank2 implements Car5, Cannon{
    public void work(){
        System.out.println("탱크가 앞으로 굴러갑니다.");
    }

    public void fire(){
        System.out.println("대포 발사");
    }
}

public class Chapter12_11 {
    public static void main(String[] args) {
        Tank2 tk = new Tank2();
        tk.work();
        tk.fire();
    }
}
