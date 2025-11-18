public class longest_subarray {
    public static void main(String[] args) {
        int arr[] = {2,3,5,1,9};
        int k = 10;
        System.out.println(length_of_longest_subarray(arr,k));
    }

    static int length_of_longest_subarray(int arr[], int k){
       
        int len = 0;
        int n = arr.length;
        for(int i =0;i<n;i++){
             int sum = 0;
            for(int j =0;j<n;j++){
                sum += arr[j];
                if(sum == k){
                    len = Math.max(len, j - i +1);
                }


            }
        }
        return len;
    }
}
