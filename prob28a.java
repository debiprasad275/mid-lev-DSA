/*Median of Two Sorted Arrays
 Given two sorted arrays nums1 and nums2 of size m and n
 respectively, return the median of the two sorted arrays.
 The overall run time complexity should be O(log (m+n)).
 Input: nums1 = [1,3], nums2 = [2] 
Output: 2.00000 
Explanation: merged array = [1,2,3] and the median is 2  */

import java.util.*;
public class prob28a {
    public static void main(String[] args) {
        int arr1[] = {1,3};
        int arr2[] ={2};
        int res = medianoftwoarray(arr1, arr2);
        System.out.println(res);

    }
    public static int medianoftwoarray(int arr1[],int arr2[]){
        int m = arr1.length;
        int n = arr2.length;
        int marray[] = new int [m+n];
        int i =0,j =0,k =0;
        while(i <m && j < n){
            if(arr1[i] < arr2[j]){
                marray[k++] = arr1[i++];
            }
            else{
                marray[k++] = arr2[j++];
            }

            while(i<m) marray[k++] = arr1[i++];
            while(j<n) marray[k++] = arr2[j++];

        }

        int len = marray.length;
        System.out.println(len);
        if(len % 2 == 1 ){ return marray[len/2];}
        else {return ((marray[len/2 + 1] + marray[(len/2)]) / 2);}

    }
}
