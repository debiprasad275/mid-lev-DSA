import java.util.*;
public class prob35 {
    public static void main(String[] args) {
        int arr[] = {4,5,6};
        int n = arr.length;
        int m = 1;
        List<Integer> ans = factorialdiv(arr, n, m);
        System.out.println(ans);
    }
    public static List<Integer> factorialdiv(int arr[], int n,int m){
        List<Integer> result = new ArrayList<>();
        
        long modulo = (long)Math.pow(10,m);
        int fact = 1;
        for(int i = 0;i<n;i++){
            while(arr[i] > 0){
                fact = fact * arr[i];
                arr[i] = arr[i] - 1;
            }
        if(fact % modulo == 0) result.add(arr[i]);
        }
       return result;
    }

}
