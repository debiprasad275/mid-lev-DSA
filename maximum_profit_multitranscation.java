public class maximum_profit_multitranscation {
    public static void main(String[] args) {
        int prices[] = {1,2,3,4,5};
        int n = prices.length;
        System.out.println(get_maxprofit(prices, n));
    }

    static int get_maxprofit(int arr[], int n){
        int prof = 0;
        for(int i = 1;i<n;i++){
            if(arr[i] > arr[i-1]){
                prof += arr[i] - arr[i-1];
            }
        }
        return  prof;
    }
}
