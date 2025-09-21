import java.util.*;
public class prob23a {
    public static void main(String[] args) {
        String [] str = {"ktk","ababa","daefw","yyyyyyyyyyy"};
        String res = longestpalindrom(str);
        System.out.println(res);

        
    }
    
    public static String longestpalindrom(String[] str){
        String longest = "";
        for(String word: str){
            if(ispalindrome(word) && word.length() > longest.length()) longest = word;
        }
        return longest.isEmpty() ? "not found" : longest;
    }

    public static boolean ispalindrome(String str){
        int len = str.length();
        int left = 0, right = len-1;
        while(left<right){
            if(str.charAt(left) == str.charAt(right)) return true;

            left ++;
            right --;
        }

        return false;
    }
}
