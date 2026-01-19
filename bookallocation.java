import java.util.*;
public class bookallocation{
    public static void main(String[] args) {
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(25, 46, 28, 49, 24));
        int m = 4;
        int n = 5;
        int ans = allocateminbook(b, m, n);
        System.out.println(ans);

    }
    //function to count number of students

    static int countStudent(ArrayList<Integer> b, int pages){
        int n = b.size();
       int  student = 1;
       long  pageno =0;
       for(int i = 0; i < n; i++){
        if(pageno + b.get(i) <= pages){
            pageno += b.get(i);
        }
        else{
            student++;
            pageno = b.get(i);
        }
    }
return student;
}
  static int allocateminbook(ArrayList<Integer> b, int m,int n){
  

    //for in valid case

    if (m > n)
        return -1;
    
    int low = Collections.max(b);
    int high = b.stream().mapToInt(Integer::intValue).sum();


    while(low<=high){
        int mid = (low + high)/2;
        int nostud = countStudent(b, mid);
        if(nostud > m){
            low = mid+1;
        }else{
            high = mid -1;
        }

  }
  return low;
  }
}