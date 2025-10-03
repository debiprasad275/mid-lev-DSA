import java.util.*;

public class prob40{
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

        for(int i = 0;i<n;i++){
            Set<Character> set = new HashSet<>();
            for(int j = i;j<n;j++){

                char c = s.charAt(j);
                if(set.contains(c)) break;

                set.add(c);
                maxLen = Math.max(maxLen, j - i +1);
            }
        }
        return maxLen;
    }
}