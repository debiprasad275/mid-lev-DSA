public class prob15 {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int n = arr.length;
        int res = stockbuysell(arr, n);
        System.out.println(res);

    }
    public static int stockbuysell(int arr[],int n){
        int profit = 0;
        for(int i = 0;i<n;i++){
             for(int j = 1;j<n;j++){
                if(arr[i] < arr[j]){
                    profit = Math.max(arr[j] - arr[i], profit);
                }
                
            }
            
        }
        return profit;
    }
}