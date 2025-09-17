// reverse a number
import java.util.*;
import java.util.Scanner;
public class prob16a{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int reverseoder = 0;
        while(n>0){
            int lastdigit = n % 10;
            reverseoder = (reverseoder*10) + lastdigit;
            n = n/10;
        }
        System.out.println(reverseoder);
        sc.close();
    }
}