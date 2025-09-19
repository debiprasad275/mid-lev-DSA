import java.util.*;
public class prob19b {

    public static void main(String[] args) {
        String str1 = "FSK";
        String str2 = "KFT";

        boolean res = anagramcheck(str1, str2);
        System.out.println(res);
    }
    static boolean anagramcheck(String s1,String s2){

        if(s1.length() != s2.length()) return false;

        int freq[] = new int[26];
        for(int i = 0; i<s1.length();i++){
            freq[s1.charAt(i) - 'A']++;
        }
        for(int i = 0; i<s1.length();i++){
            freq[s2.charAt(i) - 'A']--;
        }

        for(int i =0;i<26;i++){
            if(freq[i] == -1) return false;
        }
        return true;
    }
}
