import java.util.*;
public class prob20a {
    public static void main(String[] args) {

        String s = "hello";
        int freq[] = new int[26];

        for(int i = 0;i<s.length();i++){
            freq[s.charAt(i) - 'a']++;
        }

        for(int i = 0;i<26;i++){
            if(freq[i] > 0) System.out.println(freq[i]);
        }


        
    }
}

