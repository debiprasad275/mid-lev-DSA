
import java.util.*;
public class prob26a{
    public static void main(String[] args) {
        
        int arr[] = {2,6,11,5,8};
        int n = arr.length;
        int target = 14;
        boolean res = twosumcheck(arr, n, target);
        System.out.println(res);


    }

    public static boolean twosumcheck(int arr[], int n ,int k){
        // In this  approach we are first sort the array beacause we are using two pointer
        // approach left indicate first and right indicate last ele in this array when ever
        // there is a match by adding left and right ele same as target give TRUE ,if sum is
        // low the target we need bigger number from left side so left++ other right--

        int left = 0, right = n-1;
        Arrays.sort(arr);
        
        while(left < right){
        int sum = arr[left]+ arr[right];
        if(sum == k){
            return true;
                    }
            else if(sum < k) left++;
            else right--;
    }
    return false;
}
}