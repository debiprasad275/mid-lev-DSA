import java.util.*;
public class leading_ele{
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        System.out.println(find_ele(arr));
    }

    static List<Integer> find_ele(int arr[]){
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        int max = 0;
        for(int i = n-1;i>=0;i--){
            if(arr[i]> max){
                list.add(arr[i]);
                max = arr[i];

            }
        }
        Collections.reverse(list);
        return list;
    
}}
