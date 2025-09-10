import java.util.*;

public class prob3a {
    public static void main(String[] args) {
        int arr[] = {3,3,3,1,2,2,2,1,3,3,4};
        int res = fruitonbasket(arr);
        System.out.println(res);
        
    }
    static int fruitonbasket(int arr[]){
        int l = 0;
        int r = 0;
        int maxlen=  0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(r<arr.length){
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);

            while(map.size() > 2){
                map.put(arr[l],map.get(arr[l])- 1);
                if(map.get(arr[l]) == 0){
                    map.remove(arr[l]);
                }
                l++;

            }
           
            maxlen = Math.max(maxlen, r-l+1);
            
            r++;
        }
        return maxlen;
    }


}
