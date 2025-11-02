import java.util.*;
public class once_upon_a_time {
    public static void main(String[] args) {
        int arr[] ={4,1,2,1,2};
        Arrays.sort(arr);
        for(int i =0;i<arr.length;i++){
        System.out.println(arr[i]+" ");}  //1,1,2,2,4
            int cnt = 0;
            int crtele = arr[0];
        for(int i =0;i<arr.length;i++){
            if(crtele == arr[i]){
                cnt = cnt+1;
                crtele = arr[i];
            }
            else{
                crtele = arr[i+1];
                cnt =1;

            }

           
        }
         if(cnt == 1){
                System.out.println(crtele);}
    

    }
}
