import java.util.*;
public class add_two_int {
    // addition of two integer without using + and - opperators
    //^(xor) opperators using when carry is not present like addition of 2(010) and 1(001) so htere is no carry our result is 011 as xor operartor .
        public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);
            System.out.println("enter two numbers:");
            int a= scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("sum of the two integer number is :"+getsum(a, b));
        }
        public static int getsum(int a, int b) {
            while(b!=0){
                int c = (a&b);
                 a= a^b;
                b= (c)<<1;
            }
            return a;
}
}
