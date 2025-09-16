public class prob15a {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int n = arr.length;
        int res = stockbuysell(arr, n);
        System.out.println(res);
    }

    public static int stockbuysell(int arr[],int n){
        int maxprof = 0;
        int minprof = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            minprof = Math.min(arr[i],minprof);
            maxprof = Math.max(maxprof , arr[i]-minprof);
        }
        return maxprof;
    }
}
