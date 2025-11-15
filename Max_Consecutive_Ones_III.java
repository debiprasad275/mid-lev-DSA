public class Max_Consecutive_Ones_III {

    public static void main(String[] args) {
        
        int arr[] = {0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1};
        int k = 3;
        int n = arr.length;
        int cnt = 0;
        for(int i =0;i<n;i++){
            if(arr[i] == 1){
                cnt++;
            }
            else{
                if(k>0){
                    if(arr[i] == 0){
                        k--;
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
