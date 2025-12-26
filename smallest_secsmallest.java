import java.util.*;
public class smallest_secsmallest {
    public static void main(String[] args) {
        int arr[] = {3,2,6,8,5};

        System.out.println(findele(arr));

    }

    static ArrayList<Integer> findele(int arr[]){
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int small = Integer.MAX_VALUE;
        int secsmall = Integer.MAX_VALUE;

        for(int i = 0;i<n;i++){
            small = Math.min(arr[i],small);
        }
        for(int i =0;i<n;i++){
            if(arr[i] != small){
                secsmall = Math.min(secsmall, arr[i]);
                            }
        }

        if(secsmall == Integer.MAX_VALUE){
            list.add(-1);
            return list;
        }

        list.add(small);
        list.add(secsmall);


        return list;

    }
}
