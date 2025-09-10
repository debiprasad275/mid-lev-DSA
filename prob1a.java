import java.util.*;
public class prob1a {
    public static void main(String[] args) {
        String string ="debiprasad";
        int res = findlongestdubstring(string);
        System.out.println(res);

    }
    static int findlongestdubstring(String s){
        int left = 0;
        int right = 0;
        int len = 0;
        HashMap <Character,Integer> sh = new HashMap<>();
        while(right < s.length()){  //till run right exceeds the length of the string
            if(sh.containsKey(s.charAt(right))){  // if present update the left means finding a new substring
                // if it present at any pos then find the last occurance index and add +1 on it
                left = Math.max(sh.get(s.charAt(right))+1, left);  //checks the left with max value 
            }
            
            sh.put(s.charAt(right),right);  // if not present and to map like adding d at index 7 also if dupli find update new right index
            len = Math.max(len, right-left+1);  // finding updated maxlen using current riight and updated left
            right++;
        }
        return len;
    }
}
