public class subarray_with_0sum {
    public static void main(String[] args) {
        int arr[] = {6, -2, 2, -8, 1, 7, 4, -10};
        int target = 0;
        System.out.println(Length_of_the_longest_subarray_with_zero_Sum(arr, target));

    }

    static int Length_of_the_longest_subarray_with_zero_Sum(int arr[],int target ){
        int n = arr.length;
        int maxlength = 0;
        for(int i =0;i<n;i++){
            int sum = 0;
            
            for(int j = i;j<n;j++){
                sum = sum + arr[j];
                if(sum == target){
                   maxlength = Math.max(maxlength,j-i+1);

                }
            }
        }
        return maxlength;
    }
}
