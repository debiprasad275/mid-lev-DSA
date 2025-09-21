public class prob24a {
    public static void main(String[] args) {
        int arr[] = {2,2,3,4,1,3};
        int n = arr.length;
        for(int i =0;i<n;i++){
            int cnt = 0;
            for(int j = 0;j<n;j++) {
                if(arr[i] == arr[j]) 
                cnt++;
            }
            if(cnt == 1) System.out.println(arr[i]);
        }
    }
}
