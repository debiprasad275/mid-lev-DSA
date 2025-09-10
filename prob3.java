import java.util.*;
public class prob3 {
    public static void main(String[] args) {
        int arr [] = {3,3,3,1,2,2,2,1,3,3,4};
        int types = 2;
        int res = fruitcount(arr, types);
        System.out.println(res);
    }
    static int fruitcount(int arr[], int t){
        int maxlen =0;
        for(int i = 0;i<arr.length;i++){
            HashSet<Integer> sh = new HashSet<>() ;  // for every index create a hashset
            // cause global hashset stores all the ele 
                for(int j = i;j<arr.length;j++){
                    sh.add(arr[j]);
                    if(sh.size() <= t){
                        maxlen = Math.max(maxlen, j-i+1);
                    }
                    else{
                        break;
                    }

                }
            }
            return maxlen;
        }
    }

