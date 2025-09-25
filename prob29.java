/*Search in Rotated Sorted Array
 Given the array nums after the possible rotation and an integer
 target, return the index of the target if it is in nums, or -1 if it is
 not in nums.
 You must write an algorithm with O(log n) runtime
 complexity.
 Input: nums = [4,5,6,7,0,1,2], target = 0
 Output: 4*/

 
public class prob29 {
    public static void main(String[] args) {
        int arr[] = {0,1,3,4,5,6,7};
        int n = arr.length;
        int k = 3;
        rotatearray(arr, n, k);
        int target = 3;
        for(int i = 0;i<n;i++){
             //System.out.print(arr[i] +" ");  4 5 6 7 0 1 3

            if(arr[i] == target){
                System.out.println(i);
            }
        
        }

    }
    public static void rotatearray(int arr[], int n, int k){

        operrotate(arr,0,k-1);
        operrotate(arr,k,n-1);
        operrotate(arr,0,n-1);

    }

    public static void operrotate(int arr[], int s,int e){
        while(s <= e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
