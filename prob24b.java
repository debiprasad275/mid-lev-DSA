import java.util.*;

public class prob24b {
    public static void main(String[] args) {
        int arr[] ={2,3,2,4,1,2,3};
        int n = arr.length;
        List <Integer> res = checkrep(arr, n);
        System.out.println(res);
    }

    public static List<Integer> checkrep(int arr[],int n){
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0 )+1);
        }

        List <Integer> ele = new ArrayList<>();
        for(int num : arr){
            if(map.get(num) == 1){
                ele.add(num);
            }
        }
        return ele;
        
    }
}
