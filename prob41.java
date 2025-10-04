import java.util.*;

public class prob41 {
    public static void main(String[] args) {
        String str[] = {"dog","racecar","rose"};
        String res = prefixcommonstring(str);
        System.out.println(res);
        }

    public static String prefixcommonstring(String[] s){
        if(s == null || s.length == 0){
            return "";
        }

        String prefix = s[0];
        for(int i = 1;i<s.length;i++){
            while(s[i].indexOf(prefix)  != 0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
    
}
