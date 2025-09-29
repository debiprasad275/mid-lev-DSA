/*8. 3Sum
 @coding_knowladge
 Given an integer array nums, return all the triplets [nums[i],
 nums[j], nums[k]] 
such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k]
 == 0.
 Notice that the solution set must not contain duplicate triplets.
 Input: nums = [-1,0,1,2,-1,-4] 
Output: [[-1,-1,2],[-1,0,1]] 
Explanation: nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0. 
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0. 
The distinct triplets are [-1,0,1] and [-1,-1,2]*/

import java.util.*;
public class prob33 {
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        int n  = arr.length;
        
        

    }

        public static List<List<Integer>> triplets(int arr[],int n){

        Set<List<Integer>> list = new HashSet<>() ;
            
        

        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                for(int k = j+1;k<n;k++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        temp.sort(null);
                        list.add(temp);


                    }
                }
            }
                        
                    }
                    List<List<Integer>> ans = new ArrayList<>();
                    return ans;

                }
            }
        

