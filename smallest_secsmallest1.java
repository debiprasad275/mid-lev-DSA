import java.util.*;

public class smallest_secsmallest1 {
     public static void main(String[] args) {
        int arr[] = {1,1,1};

        System.out.println(findele(arr));

    }
    static ArrayList<Integer> findele(int arr[]){
        Arrays.sort(arr);
        
        int smallest = arr[0];
        int secsmallest = Integer.MIN_VALUE;
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0;i<n;i++){
            if(arr[i] != smallest){
                secsmallest = arr[i];
                break;
            }
        }
        
        if(secsmallest == Integer.MIN_VALUE){
            list.add(-1);
            return list;
        }
        
            list.add(smallest);
            list.add(secsmallest);
            
            
        
        return list;
        
        
    }
}
