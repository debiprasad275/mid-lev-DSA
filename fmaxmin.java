import java.util.*;
public class fmaxmin {
  
//System.out.println("mindiff"+mindiff);
    
     public static void main(String[] args) {

       System.out.println("here is the ARRAY ");
        int arr  [] ={8,6,3,1,2,4};
        for (int i = 0; i < arr.length; i++){
             System.out.println(arr[i] + " ");

        }
       // System.out.println("min diff" + mindiff);
     }
   
  public static void findmaxmin(int []arr) {
        if(arr == null ||arr.length < 2)
        return;


        int minDiff = 0;
        int maxdiff = 0;

    for(int i = 1; i < arr.length; i++){
        int diff = arr[i] -arr[i-1];

        if(diff<minDiff){
            minDiff = diff;
    }
    if(diff>maxdiff){
        maxdiff = diff;
        }
}
 System.out.println("mindiff"+minDiff);

}
}