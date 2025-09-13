import java.lang.reflect.Array;
import java.util.*;
public class prob12a {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,5};
        int n = arr.length;

        //Arrays.sort(arr);
        for(int i = 1;i<=5;i++){
            if(arr[i] == i){
                System.out.println(i);
            }
        }
    }
}
