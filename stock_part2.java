public class stock_part2 {
    public static void main(String[] args) {
        
        int arr[] = {7,1,5,3,6,4};
        int n = arr.length;
        int total_profit = 0;
        for(int i =0;i<n;i++){
            int maxprofit = 0;
            for(int j = i+1;j<n;j++){
                if(arr[i] < arr[j]){
                    maxprofit = Math.max(maxprofit,arr[j]-arr[i]);
                }
                
            }
            total_profit += maxprofit;
        }
    }
}
