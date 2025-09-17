import java.util.*;
import java.util.Scanner;
public class prob17a {
    public static void main(String[] args) {
        int n = 5;
        int f= 0;
        int sf = 1;
        if( n == 0){
            System.out.println("no fibbonaci");

        }
        else{
            System.out.print(f +" "+ sf+" ");
            int current = 0;
            for(int i =2;i<n;i++){
                current = f+ sf;
                f = sf;
                sf = current;
                System.out.print(current+" ");
            }
        }
        
    }
}
