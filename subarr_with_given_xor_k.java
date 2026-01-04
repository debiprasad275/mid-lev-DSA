public class subarr_with_given_xor_k {

    public static void main(String[] args) {
        int arr1[] = {4,2,2,6,4};
        int k = 6;
        System.out.println(Count_the_number_of_subarrays_with_given_xor_K(arr1, k));
    }

    public static int  Count_the_number_of_subarrays_with_given_xor_K(int arr[], int k){
        int n = arr.length;
        int cnt = 0;


        for(int i = 0;i<n;i++){
            int res = 0;

            for(int j = i;j<n;j++){
                res = res ^ arr[j];
                if(res == k){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    
}
