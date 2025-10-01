import java.util.*;
public class prob36a {  
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char c1[] = s1.toCharArray();
        Arrays.sort(c1);
        char c2[] = s2.toCharArray();
        Arrays.sort(c2);

        String str1 = new String(c1);
        String str2 = new String(c2);

        if(str1.equals(str2)) System.out.println("1");
        else System.out.println("0");

            }

}
