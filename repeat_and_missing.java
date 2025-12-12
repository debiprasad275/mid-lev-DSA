import java.util.*;

public class repeat_and_missing {
    public static void main(String[] args) {
        int arr[] = {3,1,2,5,3};

       int res [] = find_ele(arr);
       System.out.println(res[0] +","+res[1]);
    }
    static int[] find_ele(int arr[]){

        int n = arr.length;
        int repeat = -1;
        int missing = -1;

        for(int i = 1;i<=n;i++){
            int cnt = 0;
            for(int j =0;j<n;j++){
                if(arr[j] == i) cnt++;
            }

            if(cnt == 2) repeat = i ;
            if(cnt == 0) missing = i;

            if(repeat != -1 && missing != -1){
                break;
            }
        }

        int ans[] = {repeat,missing};

        return ans;

       
        
    }
}
