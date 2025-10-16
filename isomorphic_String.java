import java.util.*;

public class isomorphic_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Strings: ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println("Two String are"+ s1+"and"+ s2);

        if(check_isomorphic(s1, s2)) System.out.println("Both Strings are isomorphic");
        else System.out.println("Both Strings are not isomorphic");


    }

    public static boolean check_isomorphic(String s ,String t){
        //edge case
        if(s.length()  != t.length()) return false;
        
        int len = s.length();

        int m1[] = new int[256];
        int m2[] = new int[256];

        for(int i = 0;i<len;i++){

            if(m1[s.charAt(i)] != m2[t.charAt(i)]) return false;

            m1[s.charAt(i)] = i+1;
            m2[t.charAt(i)] = i+1;

        }
        return true;
    }
}
