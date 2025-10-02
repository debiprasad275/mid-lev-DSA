public class prob39 {
    public static void main(String[] args) {
        
        int arr[] = {10, 20, 30, 50, 10, 70, 30};
        int k = 3;
        int res = maxofmin(arr,k);
        System.out.println(res);
    }

    public static int maxofmin(int arr[], int k){
        int max = Integer.MIN_VALUE;

        for(int i = 0;i<=arr.length - k;i++){+
            int min = Integer.MAX_VALUE;
            for(int j = i;j<i+k;j++){
                min = Math.min(min,arr[j]);
            }
            max = Math.max(max,min);
        }
        return max;
    }
}
