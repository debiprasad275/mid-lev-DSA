import java.util.*;

public class prob4{
    public static void main(String[] args) {
        String str = "BAABAABBBAA";
        int k = 2;
        int res = maximum_repeating_char(str, k);
        System.out.println(res);
    }

    static int maximum_repeating_char(String s, int k){
        int maxlen = 0;
        int n = s.length();

        for(int i = 0;i<n;i++){
            HashMap <Character, Integer> freq = new HashMap<>();
            int maxfreq = 0;

            for(int j = i;j<n;j++){
                char c = s.charAt(j);
                freq.put(c,freq.getOrDefault(c,0) +1);


                maxfreq = Math.max(maxfreq,freq.get(c));
                int windowlen = j-i+1;
                int changeNeed = windowlen - maxfreq;

                if(changeNeed <= k){
                    maxlen = Math.max(maxlen,windowlen);
                }
            }
        }
        return maxlen;
    }
}