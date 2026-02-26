
import java.util.*;
public class DPstock {
    public static void main(String[] args) {
        //best time to buy and sell a stock
      //  int arr [] = {1,7,5,3,6,4};
      int [] arr = {4,9,3,15};
System.out.println("the maximum profit is: "+max_profit(arr));
    }
    static int max_profit(int [] arr) {

         int profit = 0;
         int min = arr[0];
         for (int i = 1; i < arr.length; i++) {
          int  cost = arr[i] - min;
          profit  = Math.max(profit, cost);
          min = Math.min(min, arr[i]);
}
return profit;
        }
}