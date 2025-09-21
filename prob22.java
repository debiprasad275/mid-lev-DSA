import java.util.*;
public class prob22{
    public static void main(String[] args) {
        int n = 153;
        int cnt = (int) (Math.log10(n) + 1);
        System.out.println(cnt);
        int amsnum = 0;
        while(n>0){
        int lastd = n % 10;
        amsnum = amsnum + (int)Math.pow(lastd, cnt);
        n = n/ 10;

    
    }
    System.out.println(amsnum);

    }
}