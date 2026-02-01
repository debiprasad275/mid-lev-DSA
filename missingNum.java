import java.util.*;

public class missingNum {
    public static void main(String[] args) {
        int [] nums = {3,0,5,4};
        for (int i = 0; i < nums.length; i++) {
            System.out.println("eles of the array " + nums[i]);
    }
    System.out.println("missing number is:" + missingNum(nums));
}
public static int missingNum(int[] nums) {
    Arrays.sort(nums);
    int left =0,right = nums.length , mid=(left+right)/2;
    while(left < right) {
       mid= (left+right)/2;
       if(nums[mid]>mid) right= mid;
        else left = mid +1;
}
return left;
}
}