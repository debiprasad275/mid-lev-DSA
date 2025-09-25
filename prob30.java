/*Maximum Subarray
 Given an integer array nums, find the subarray with the
 largest sum, and return its sum.
 Input: nums = [-2,1,-3,4,-1,2,1,-5,4] 
Output: 6 
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 Input: nums = [1] 
Output: 1 
Explanation: The subarray [1] has the largest sum of 1*/

public class prob30 {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int n = arr.length;
        int res = maxisum(arr, n);
        System.out.println(res);
    }

    public static int maxisum(int arr[], int n){
        int maxsum = Integer.MIN_VALUE;
        

        for(int i = 0;i<n;i++){
            int sum = 0;
            for(int j = i;j<n;j++){

                sum = sum + arr[j];
                maxsum = Math.max(maxsum, sum);
            }
           
        }
        return maxsum;
    }
    
}
