import java.util.*;
public class greatString {
    public static void main(String[] args) {
        
        String s = "aABbcCcba";
        System.out.println(checkGreatORnot(s));
    }



        static String checkGreatORnot(String s){
        StringBuilder res = new StringBuilder();

        for(char ch: s.toCharArray()){
            int n = res.length();

            if(n>0 && (res.charAt(n-1)+32 == ch||res.charAt(n-1)-32 == ch)){
                res.deleteCharAt(n-1);
            } 
            else{
                res.append(ch);
            }
        }
        return res.toString();

    }
}
