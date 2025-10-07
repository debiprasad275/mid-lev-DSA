public class add_binary {
    public static void main(String[] args) {
        
        String s1 = "01001001";
        String s2 = "0110101";
        System.out.println(get_binary_sum(s1, s2));

    }

    static String get_binary_sum(String s1,String s2){
        int a = s1.length()-1;
        int b= s2.length() -1;

        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while(a >= 0 || b>= 0 || carry == 1){
            int sum = carry;

            if(a >= 0){
                sum = sum + s1.charAt(a)-'0';
                a--;
            }
            if(b >= 0){
                sum = sum + s2.charAt(b)-'0';
                b--;
            }

            sb.append(sum%2);
            carry = sum /2;
        }

        String res = sb.reverse().toString();

        int k = 0;  //index at i=0 position to remove leading zeors;
        while(k<res.length()-1 && res.charAt(k) == '0') k++;  // if there are some leading 0 then k++ to skip those;

        return res.substring(k);  // if there are k number of index then from k+1 to end
    }
}
