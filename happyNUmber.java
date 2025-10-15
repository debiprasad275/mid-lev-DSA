import java.util.*;
public class happyNUmber {
    public static void main(String[] args) {
        int n = 7;
        boolean res = isHappy(n);
        if(res == true) System.out.println("happy NUmber");
        else System.out.println("Not a happy number");

    }


    static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while(n != 1 && !seen.contains(n) ){
            seen.add(n);
            n = getNum(n);
        }

        // if(n == 1) return true;
        // return false;
        return n ==1;

    }

    static int getNum(int n){
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum = sum + (rem*rem);
            n = n/10;
        }
        return sum;
    }
}

     


