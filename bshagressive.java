import java.util.*;
public class bshagressive {
    public static void main(String[] args) {
        int stalls [] = {0,3,4,7,9,10};
       // Arrays.sort(stalls);
        int cows = 4;
        int ans = mindistancebtwcows(stalls, cows);
        System.out.println("maximum distance to place all the cows: "+ans);
    
    }

    static boolean possible(int stalls [],int dist, int cows){
        int n = stalls.length;
        int cntcows = 1;
        int last = stalls[0];
        for(int i = 1; i < n; i++)
            if(stalls[i] - last >= dist){
                cntcows++;
                last = stalls[i];
            }
        if(cntcows >= cows){
            return true;
                    }
        else
            return false;
        
        

}

 static int mindistancebtwcows(int stalls [],int cows){
    int n = stalls.length;
    int low = 1;
    int high = stalls[n - 1] - stalls[0];
    while(low<=high){
        int mid = (low + high) / 2;
        if(possible(stalls, mid, cows) == true){
            low = mid + 1;
        }
        else{
            high = mid-1;

        }
    }
    return high;
 }
}