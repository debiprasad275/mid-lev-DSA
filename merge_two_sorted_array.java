public class merge_two_sorted_array {
    public static void main(String[] args) {
        int arr1[] = {0};
        int m = 0;
        int arr2[] = {1};
        int n = 1;
        
        int res[] = new int [n+m];
        int left =0;
        int right = 0;
        int k = 0;
        while(left<m && right<n){
            if(arr1[left]<arr2[right]){
                res[k++] = arr1[left++];
            }
            else{
                res[k++] = arr2[right++];
            }
        }


        while(left<m){
            res[k++] = arr1[left++];

        }
        while(right<n){
            res[k++] = arr2[right++];
        }

        for(int i = 0;i<m+n;i++){
            System.out.println(res[i]+" ");
        }
    }
}
