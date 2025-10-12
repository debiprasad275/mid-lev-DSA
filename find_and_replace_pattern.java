import java.util.ArrayList;
import java.util.List;

public class find_and_replace_pattern {
    public static void main(String[] args) {
        String words[] = {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";
        
        List<String> result = checkNumberOfString(words,pattern);
        System.out.println(result);

       }
    public static boolean check_isomorphic(String s ,String t){
        //edge case
        if(s.length()  != t.length()) return false;
        
        int len = s.length();

        int m1[] = new int[256];
        int m2[] = new int[256];

        for(int i = 0;i<len;i++){

            if(m1[s.charAt(i)] != m2[t.charAt(i)]) return false;

            m1[s.charAt(i)] = i+1;
            m2[t.charAt(i)] = i+1;

        }
        return true;
    }

    public static List<String> checkNumberOfString(String [] words , String pattern){

        List<String> lt = new ArrayList<>();
        for(String word : words){
            if(check_isomorphic(word, pattern)){
                lt.add(word);
            }
        }
        return lt;


    }
}
