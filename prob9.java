import java.util.*;
public class prob9 {
    public static void main(String[] args) {
        int arr[] = {4,8,0,-3,-5,-5};
        int res = maxiprod(arr);
        System.out.println(res);

    }

    static int maxiprod(int arr[]){
        Arrays.sort(arr);
        int n = arr.length;

        int maxprod = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            int prod = 1;
            for(int j =i;j<n;j++){
                prod = prod * arr[j];
                maxprod = Math.max(maxprod,prod);
                
            }

        }
        return maxprod;
    }
}
