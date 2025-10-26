import java.util.*;
public class long_substr_uniquechar {
    public static void main(String[] args) {
        
        String str = "baigejdvlad";
        System.out.println(find_len(str));

    }
    static int find_len(String s){
        if(s.length() == 0) return 0;
        int maxlen = 0;
        for(int i = 0;i<s.length();i++){
            Set<Character> st =   new HashSet<>();
            for(int j = i;j<s.length();j++){
                if(st.contains(s.charAt(j))){
                    break;
                }
                st.add(s.charAt(j));
                maxlen = Math.max(maxlen, (j-i)+1);

            } 

        }
        return maxlen;
    }
}
