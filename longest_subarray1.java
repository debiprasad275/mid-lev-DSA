public class longest_subarray1 {
    public static void main(String[] args) {
        int arr[]  = {2,3,5,1,9};
        int k = 10;
    }
    static int lenofsubarray(int arr[], int k){
        int n = arr.length;
        int left = 0;
        int right;
        int sum =0;
        int maxlen = 0;
        for(right=0;right<n;right++){
            sum += arr[right];
            if(sum == k){
                
            }

        }
    }
}
