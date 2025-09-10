import java.util.*;


public class prob1{
    public static void main(String[] args) {
        String s = "debiprasad";
        int len = lenoflongestsubstringwithoutdupli(s);
        System.out.println(len);
    }

    public static int lenoflongestsubstringwithoutdupli(String s){

        if(s.length() == 0) return 0;

        int maxlen = Integer.MIN_VALUE;
        for(int i =0;i<s.length();i++){
            Set <Character> ch = new HashSet<>();
            for(int j = i;j<s.length();j++){
                    if(ch.contains(s.charAt(j))){  //after finding the duplicate char the if condition satisfy and the current j index will
                        // be 8 this case so as our index srt from 0 before dupli a it total 8 unique character
                        maxlen = Math.max(maxlen, j-1);
                        break;
                    }

                    ch.add(s.charAt(j));
            }
        }
        return maxlen;
    }
}