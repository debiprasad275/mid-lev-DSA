
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class prob40a {
     public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter a String :");
        String s = sc.next();
        System.out.println(s);
        System.out.println(findmaxlenofnonrepeatingstr(s));

    }

    public static int findmaxlenofnonrepeatingstr(String s){
        int n = s.length();
        int maxLen = Integer.MIN_VALUE;

        if(n == 0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
       
            for(int right = 0;right<n;right++){

                char c = s.charAt(right);
                if(map.containsKey(c)) left = Math.max(left,map.get(c) + 1);

                map.put(c,right);
                maxLen = Math.max(maxLen, right - left +1);
            }
        
        return maxLen;
    }
}
