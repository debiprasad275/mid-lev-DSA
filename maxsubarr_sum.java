public class maxsubarr_sum {
    public static void main(String[] args) {
        
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(find_max_sum(arr));
        
    }

    static int find_max_sum(int arr[]){
        int n = arr.length;

        int max_sum = Integer.MIN_VALUE;

        for(int i =0;i<n;i++){
            int sum = arr[i];
            for(int j = i+1;j<n;j++) {
                sum = sum + arr[j];
                max_sum = Math.max(max_sum,sum);
            
            }
           
            
        
        }
        return max_sum;
    }
}
