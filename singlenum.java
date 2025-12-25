import java.util.*;
public class singlenum {
    public static void main(String[] args) {
        int arr[] = {2,4,1,2,1};
        Arrays.sort(arr);

        int res = 0;
        for(int i =0;i<arr.length;i++){
            res = res ^ arr[i];
        }
        System.err.println(res);
    }
}
