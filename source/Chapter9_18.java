class myInt{
    int a;
}

public class Chapter9_18 {
    static void function(myInt m){
        m.a = m.a + 1;
        System.out.println(m.a);
    }

    public static void main(String[] args) {
        myInt m = new myInt();
        m.a = 10;

        function(m);
        System.out.println(m.a);
    }
}
