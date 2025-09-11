public class prob6a {
    public static void main(String[] args) {
        int nums[] = {2,4,6};
        int k = 1;
        int res1 = nicesubarrayodd(nums, k);
        int res2 = nicesubarrayodd(nums, k-1);
        System.out.println(res1 - res2);
    }

    static int nicesubarrayodd(int arr[], int k){
        int l= 0,r =0,oddcount =0,cnt=0;

        while(r < arr.length){

            // if(arr[r] % 2 == 0){
            //     return 0;
            // }

            if(arr[r] % 2 == 1){
                oddcount++;
            }

            if(oddcount > k){
                oddcount -= arr[r];
                l++;
            }

            cnt = cnt + (r-l+1);
            r++;
        }
        return cnt;
    }
}
