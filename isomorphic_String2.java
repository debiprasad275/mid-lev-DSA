import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class isomorphic_String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Strings: ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println("Two String are"+ s1+"and"+ s2);

        if(isIsomorphic(s1, s2)) System.out.println("Both Strings are isomorphic");
        else System.out.println("Both Strings are not isomorphic");


    }
    
    public static boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()) return false;
        int len = s.length();
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> used = new HashSet<>();

       for(int i = 0;i<len;i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(map.containsKey(ch1)) {
                if(map.get(ch1) != ch2) {
                    return false;
                }
            } else if(used.contains(ch2)){
                return false;
            }
            map.put(ch1, ch2);
            used.add(ch2);
            
        }
        return true;
    }
}

