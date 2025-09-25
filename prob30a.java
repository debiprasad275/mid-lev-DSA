public class prob30a {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int n = arr.length;
        int res = maxisum(arr, n);
        System.out.println(res);
    }

    public static int maxisum(int arr[], int n){
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum = sum + arr[i];

            if(sum > maxsum) maxsum = sum;

            if(sum < 0) sum = 0;
        }
        return maxsum;
}
}