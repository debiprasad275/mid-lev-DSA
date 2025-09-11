public class prob5a {
    public static void main(String[] args) {
        int nums[] = {1,0,0,1,1,0};
        int goal = 2;
        int res1 = longestbinarysubarrayequalsum(nums, goal);

        int res2 = longestbinarysubarrayequalsum(nums, goal-1);
        System.out.println(res1 - res2);

    }
    static int longestbinarysubarrayequalsum(int arr[], int goal){
        if(goal < 0) return 0;

        int r =0,l = 0,sum = 0,cnt = 0;

        while(r<arr.length){
            sum += arr[r];

            while(sum > goal){
                sum -= arr[l];
                l++;
            }
            cnt = cnt + (r-l+1);
            r++;
        }
        return cnt;

    }


}
