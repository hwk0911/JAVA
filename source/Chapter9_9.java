public class Chapter9_9 {
    public static void main(String[] args) {
        String str1 = "Java Programming";
        String str2 = "Java Programming";
        String str3 = new String("Java Programming");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
    }
}

// Java String 은 동일한 문자열로 초기화 되었을때 같은 메모리 주소에 자리잡는다.
// 하지만 new String 의 경우 내용은 같지만 new 연산자를 사용했기때문에 별도의 메모리에 저장된다.