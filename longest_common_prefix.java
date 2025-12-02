import java.util.*;
public class longest_common_prefix {
    public static void main(String[] args) {
        
        String str[] = {"flower","flow","flight"};
        System.out.println(find_common_prefix(str));

    }

    static String find_common_prefix(String str[]){
        Arrays.sort(str);

        String first = str[0];
        String last = str[str.length - 1];

        String res = "";
        for(int i =0;i<Math.min(first.length(),last.length());i++){

            if(first.charAt(i) != last.charAt(i)) return res;

            res = res+first.charAt(i);
        }

        return res;
    }
}
