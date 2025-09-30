public class prob34 {
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3};
        int n  = arr.length;

        int currentele = arr[0];
        int cnt = 0;
        for(int i = 0;i<n;i++){
            if(arr[i] == currentele) cnt++;

            
        }
        //System.out.println(cnt);
        if(cnt > 1) System.out.println(arr[i]);
    }
}
