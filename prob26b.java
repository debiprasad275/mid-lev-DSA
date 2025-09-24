import java.util.HashMap;

public class prob26b {
    public static void main(String[] args) {
        
         int arr[] = {2,6,11,5,8};
        int n = arr.length;
        int target = 34;
        boolean res = twosumcheck(arr, n, target);
        System.out.println(res);
    }

    public static boolean twosumcheck(int arr[], int n ,int k){
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            int num = arr[i];
            int needmore = k - num;
            if(map.containsKey(needmore)){
                return true;
            }

            map.put(arr[i],i);
        }
        return false;


    }

}
