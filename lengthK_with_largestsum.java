import java.util.*;

public class lengthK_with_largestsum {
    public static void main(String[] args) {
        
     List<Integer> list = Arrays.asList(2,5,3,9,15,33,6,18,20);
   
     int k = 3;
     System.out.println(maxSubsequence(list, k));

    }
    static List<Integer> maxSubsequence(List<Integer> list,int k){
        
        List<Integer> l = new ArrayList<>();
        int count = 0;
        Collections.sort(list);
        for(int i = list.size()-1;i>=0;i--){
            if(count<k){
                l.add(list.get(i));
            }
            count++;
        }

        //Collections.sort(l);
        return l;
    }
}
