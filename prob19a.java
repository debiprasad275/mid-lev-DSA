import java.util.*;
public class prob19a {
    public static void main(String[] args) {
        String str1 = "debi";
        String str2 = "edbi";

        boolean res = analogcheck(str1, str2);
        System.out.println(res);

    }

    public static String sortString(String str){
        char c[] = str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public static boolean analogcheck(String s1, String s2){

        if(s1.length() != s2.length()) return false;

        s1 = sortString(s1);
        s2 = sortString(s2);

        for(int i = 0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
            
        }
        return true;
    }
}
