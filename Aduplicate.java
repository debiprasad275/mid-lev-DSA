//import java .util.*;
//remove duplicates from a sorted array
public class Aduplicate {
    public static void main(String[] args) {
       // int n =7;
        int arr [] ={1,1,2,2,2,3,3};
       for(int i = 0; i < arr.length; i++){
           System.out.print(arr[i]+" ");
     }
     System.out.println();
     int k = duplicates(arr);
        System.out.println("total unq eles are:" +k);
            
             System.out.println("after removing duplicates:");
             for(int j = 0; j < k; j++){
                System.out.print(arr[j]+" ");
    }
}
    static int duplicates(int arr[]) {
//two pointers burteforce
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];

            }          
}
            return i + 1;
        
    }
}      


  