public class Chapter9_7 {
    public static void main(String[] args) {
        String str = "  한글  ABCD    efgh    ";
        String result = "";

        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) != ' ')
                result+=str.charAt(i);
        }

        System.out.println(str);
        System.out.println(result);
    }
}
