import java.util.*;
public class longest_cons_seq {
    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, -10};
//}
    
    //static int find_number_of_longestconsuSeq(int arr[]){
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        System.out.println();

        int currentele = arr[0];
        int cnt=1;
        int maxcnt = 0;
        for(int i =1;i<arr.length;i++){
            if(currentele+1 == arr[i]){
                currentele = arr[i];
                cnt++;
            }
            else{
                currentele = arr[i];
                cnt = 1;
            }
            // if(maxcnt<cnt){
            //     maxcnt = cnt;
            // }
        }
        System.out.println(cnt);

    }

}