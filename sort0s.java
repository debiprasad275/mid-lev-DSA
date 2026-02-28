import java.util.*;
public class sort0s{
    public static void main(String[] args) {
        int arr [] = {0,1,2,0,0,2,0,1,2};
    sort(arr);
    for (int i = 0; i < arr.length; i++) 
        System.out.print(arr[i]+" ");
    
}
    
    static void sort(int[] arr) {
        int n= arr.length;
int low =0;
int high = n-1;
int mid= 0;
   while(mid<=high){
    if(arr[mid] == 0){
        int temp = arr[mid];
        arr[mid] = arr[low];
        arr[low] = temp;
        mid++;
        low++;}
        else if(arr[mid] == 1)
            mid++;
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }

         

    }

   }



}

