import java.util.*;

public class isomorphic_String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Strings: ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println("Two String are"+ s1+"and"+ s2);

        if(check_isomorphic(s1, s2)) System.out.println("Both Strings are isomorphic");
        else System.out.println("Both Strings are not isomorphic");


    }

    public static boolean check_isomorphic(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        int n = s1.length();
        HashMap<Character,Character> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            char c1= s1.charAt(i);
            char c2 = s2.charAt(i);
            if(map.containsKey(c1)){
                if(map.get(c1) != c2) return false;
            }
            else if(map.containsValue(c2)){
                return false;
            }                                                       //main part 
           

            map.put(c1,c2);
        }
        return true;
    }

}