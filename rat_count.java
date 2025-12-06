import java.util.*;

public class rat_count{
    public static void main(String[] args) {
        int rats = 7;
        int unit = 4;
        int n = 8;
        int arr[] = {2,8,3,5,7,4,1,2};

        int total_food_required = rats * unit;

        int cnt = 0;
        int sum = 0;
        for(int i =0;i<n;i++){
            sum += arr[i];

            if(sum >= total_food_required){
                System.out.println(i+1);
                break;
            }
        }
    }
}