public class prob31a{
public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        int n = arr.length;
        int res = maxprofit(arr, n);
        System.out.println(res);
    }

    public static int maxprofit(int arr[], int n){
        int mprofit = Integer.MIN_VALUE;
        int minip = arr[0];
        for(int i = 1;i<n;i++){
            int curprofit = arr[i] - minip;
            mprofit = Math.max(mprofit,curprofit);
            minip = Math.min(minip, arr[i]);
            
            }
            
    
    return mprofit;
}
}