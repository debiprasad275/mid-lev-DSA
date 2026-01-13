import java.util.*;
public class unions {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,3,4,5,5};
        System.out.println(unionoftwoarr(arr1, arr2));
    }
    static HashSet<Integer> unionoftwoarr(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<arr1.length;i++){
            if(!set.contains(arr1[i])){
                set.add(arr1[i]);
            }

        }
        for(int i =0;i<arr2.length;i++){
            if(!set.contains(arr1[i])){
                set.add(arr2[i]);
            }
        }
        return set;
    }
}
