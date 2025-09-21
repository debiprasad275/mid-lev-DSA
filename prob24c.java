import java.util.*;
public class prob24c {
     public static void main(String[] args) {
        int arr[] ={2,3,2,4,1,2,3};
        int n = arr.length;
        checkrepetation(arr, n);
    }

        static void checkrepetation(int arr[],int n ){

            Arrays.sort(arr);
            for(int i = 0;i<n;i++){
                if((i == 0 || arr[i] != arr[i-1]) && (i == n-1 || arr[i] != arr[i+1])){
                    System.out.println(arr[i]+" ");
                }
            }
        }
}
