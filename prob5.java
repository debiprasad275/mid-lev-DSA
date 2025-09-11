public class prob5 {
    public static void main(String[] args) {
        int arr[] = {1,0,0,1,1,0};
        int goal = 2;
        int ans = longestbinarysubarrayequalsum(arr, goal);
        
        System.out.println(ans);
        
    }

    static int longestbinarysubarrayequalsum(int arr[], int goal){
        int n = arr.length;
        int cnt = 0;

        for(int i = 0;i<n;i++){
            int sum = 0;

            for(int j =i;j<n;j++){
                sum += arr[j];

                if(sum == goal){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
