import java.util.*;
public class medianofsortedarray {
    public static void main(String[] args) {
        int arr1[] = {1,2};
        int arr2[] = {3,4};
        System.out.println(findMedianSortedArrays(arr1,arr2));
    }
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int left=0,right=0,both=0;
        int res [] = new int[n+m];

        while(left<n && right<m){
            if(nums1[left]<=nums2[right]){
                res[both++] = nums1[left++];
            }
            else{
                res[both++] = nums2[right++];
            }
        }

        while(left<n){
            res[both++] = nums1[left++];
        }
        while(right<m){
            res[both++] = nums2[right++];
        }

        int len = res.length;
        if(len%2 == 1){
            return res[len/2];
        }
        else return (res[(len/2)-1]+res[len/2])/2.0;
    }
}
