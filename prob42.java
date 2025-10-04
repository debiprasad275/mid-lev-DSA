public class prob42 {
    public static void main(String[] args) {
        String str = "babad";
        String res = longpalindromsubstring(str);
        System.out.println(res);

    }

    public static String longpalindromsubstring(String s){
        int n = s.length();
        String maxlen = "";

        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                String subStr = s.substring(i,j+1);  // for i = 0 j = i +1 means j = 1 so the substring cal as 1-0 = 1length or only 
                //char at position 0 index not include j value
                // a   (i=0,j=1)
                // ab  (i=0,j=2)
                // (i=1,j=1) → empty string
                // b   (i=1,j=2)
                // (i=2,j=1) → Exception (i > j)
                //  (i=2,j=2) → empty string
                // issuse with i =0, j=1
                if(ispaliindrome(subStr) && subStr.length() >= maxlen.length()){
                    maxlen = subStr;
                }
            }

        }
return maxlen;
    }

    static boolean ispaliindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (s.charAt(l) != s.charAt(r))
            return false;
        l++;
        r--;

        return true;
    }
}
