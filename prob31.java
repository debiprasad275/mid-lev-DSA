
/*Best Time to Buy and Sell Stock
 You are given an array of prices where prices[i] is the price of a
 given stock on an ith day. You want to maximize your profit by
 choosing a single day to buy one stock and choosing a different
 day in the future to sell that stock. Return the maximum profit
 you can achieve from this transaction. If you cannot achieve
 any profit, return 0
 Input: prices = [7,1,5,3,6,4] 
Output: 5 
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6),
 profit = 6-1 = 5 */
import java.util.*;

public class prob31 {
    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        int n = arr.length;
        int res = maxprofit(arr, n);
        System.out.println(res);
    }

    public static int maxprofit(int arr[], int n){
        int mprofit = Integer.MIN_VALUE;
        
        for(int i = 0;i<n;i++){
            int profit = 0;
            for(int j = i+1; j<n;j++){
                if(arr[i] < arr[j]){
                    profit = arr[j] - arr[i];
                    mprofit = Math.max(mprofit, profit);
                }
            }
            
    }
    return mprofit;
}
    
}
