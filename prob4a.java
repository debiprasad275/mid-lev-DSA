import java.util.*;
public class prob4a {
    public static void main(String[] args) {
        String str = "AAABBCCD";
        int k = 2;
        int res = maximum_repeating_char(str, k);
        System.out.println(res);
    }
    static int maximum_repeating_char(String s, int k){
        int l = 0,r = 0,maxlen = 0,maxfreq = 0;
        HashMap<Character,Integer> sh = new HashMap<>();
        while(r <s.length()){
           char c = s.charAt(r);
            sh.put(c,sh.getOrDefault(c,0)+1);

            maxfreq = Math.max(maxfreq,sh.get(c));
            int len = r-l+1;
            if(len - maxfreq > 2){
                char lchar = s.charAt(l);
                sh.put(lchar,sh.get(lchar) -1);
                l++;
            }
            maxlen = Math.max(maxlen,r-l+1);
            r++;

        }
        return maxlen;


    }
}
