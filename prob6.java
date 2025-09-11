public class prob6{
    public static void main(String[] args) {
        int arr[] = {1,1,2,1,1};
        int k = 3;
        int res = nicesubarray(arr, k);
        System.out.println(res);
    }

    static int nicesubarray(int arr[], int k){
        int n = arr.length;
        
        int cnt = 0;

        for(int i = 0;i<n;i++){
            int oddcount = 0;
            for(int j = i;j<n;j++){

                if(arr[j] % 2 == 1){
                    oddcount++;
                }

                if(oddcount == k){
                    cnt++;
                }
                
            }       
            
        }
        return cnt;
    }

}
