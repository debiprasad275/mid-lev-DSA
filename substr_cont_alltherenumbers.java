public class substr_cont_alltherenumbers {
    public static void main(String[] args) {
        
        String s = "abcabc";
        System.out.println(count_all_3_char(s));

    }
    public static int count_all_3_char(String s){
        int slen = s.length();

        int cnt = 0;
        int left = 0;
        int freq[] = new int [3];
        for(int right = 0;right<slen;right++){

            freq[s.charAt(right) - 'a']++;

            while(freq[0] > 0 && freq[1] > 0 && freq[2] > 0){
                cnt += (slen - right);

                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return cnt;
    }
}
