/* Two Sum
 Given an array of integer nums and an integer target, return
 indices of the two numbers such that they add up to the
 target.
 You may assume that each input would have exactly one
 solution, and you may not use the same element twice.
 You can return the answer in any
 order.
 Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation:
 Because nums[0] + nums[1] == 9, we return [0, 1] */

 
import java.util.*;
public class prob26 {
    public static void main(String[] args) {
        int arr[] = {2,6,5,8,11};
        int target = 14;
        int n = arr.length;
       
        for(int i =0;i<n;i++){
            for (int j = i;j<n;j++){
                if(arr[i] +arr[j] == target){
                    System.out.println("yes");
                }
            }
        }
    }
}