import java.util.ArrayList;

public class smallest_secsmallest2 {
    public static void main(String[] args) {
        int arr[] = {12,25,8,55,10,33,17};
        int n = arr.length;
        System.out.println(findele(arr, n));
    }
    static ArrayList<Integer> findele(int arr[],int n){

        int s = Integer.MAX_VALUE;
        int ss = Integer.MIN_VALUE;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0;i<n;i++){
            if(arr[i]<s){
                ss = s;
                s = arr[i];
            }
            else if(arr[i]<ss && arr[i] != s){
                ss = arr[i];
            }
        }

        if(ss == Integer.MAX_VALUE){
            list.add(-1);
            return list;

        }

        list.add(s);
        list.add(ss);
        return list;
    }
}
