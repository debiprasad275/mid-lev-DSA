import java.util.*;
import java.util.Scanner;
public class prob16b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
       
        String s = "";
        while(n != 0){
            int lastd = n % 10;
            s = s + Integer.toString(lastd);
            n /= 10;
        }
        System.out.println(s);
        sc.close();

}
}
