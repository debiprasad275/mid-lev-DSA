  import java .util.*;

      
public class String_sort {
    
     public static void main(String[] args) {
        
         ArrayList<String> al=new ArrayList<String>();

            al.add("j");
            al.add("k");
            al.add("o");
            al.add("a");
            al.add("b");

          //  Collections.sort(al);
        Collections.sort(al,Collections.reverseOrder());

            System.out.println("list of sorting arrays [using Collection.sort()]"+ al);
            

     }
}
