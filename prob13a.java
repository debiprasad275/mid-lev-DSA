public class prob13a {
    public static void main(String[] args) {
        int arr[] = {4,4,2,4,3,3,3,3,4,4,3,2,4,4};
        int n = arr.length;
        int res = majorityele(arr, n);
        System.out.println(res);
    }
    public static int majorityele(int arr[],int n ){
        int cnt = 0;
        int el = 0;
        for(int i = 0;i<n;i++){
            if(cnt == 0){
                cnt = 1;
                el = arr[i];
            }
            else if(el == arr[i]) cnt++;
            else cnt--;
        }

        int cnt1 = 0;
        for(int i = 0;i<n;i++){
            if(el == arr[i]) cnt1++;
        }
        if(cnt1 > (n/2)) return el;
        return -1;
    }
}
