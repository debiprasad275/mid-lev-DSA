public class prob7a {
    public static void main(String[] args) {
        String s = "bbacba";
        int res = substringwithatleastabc(s);
        System.out.println(res);

    }

    static int substringwithatleastabc(String s){
        int l = s.length();
        int left =0,right = 0,cnt = 0;

        int freq [] = new int [3];

        while (right < l){
            freq[s.charAt(right) - 'a']++;

            while(freq[0] > 0 && freq[1] > 0 && freq[2]> 0){
                cnt = cnt+ (l-right);

                freq[s.charAt(left) - 'a']--;
                left++;

            }
            right++;

        }
        return cnt;



    }
}
