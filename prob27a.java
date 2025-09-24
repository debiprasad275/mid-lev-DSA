/*2. Product of Array Except Self
 Given an integer array nums, return an array answer such
 that answer[i] is equal to the product of all the elements of
 nums except nums[I].
 The product of any prefix or suffix of nums is guaranteed to fit in
 a 32-bit integer.
 You must write an algorithm that runs in O(n) time and
 without using the division operation.
 Input: nums =
 [1,2,3,4] Output:
 [24,12,8,6]*/

public class prob27a {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n = arr.length;
        int ans [] = new int [n];

        int prefix = 1;
        for(int i  = 0;i<n;i++){
            ans[i] = prefix;
            prefix *= arr[i];
        }
        int surfix = 1;
        for(int i = n-1;i>=0;i--){
            ans[i] *= surfix;
            surfix *= arr[i];

        }

        for(int i  = 0;i<n;i++){
            System.out.print(ans[i]+",");
        }

    }


}
