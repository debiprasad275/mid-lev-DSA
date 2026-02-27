import java .util.*;
public class BSkthele{
    // find the kth element in two sorted array
    public static void main(String[] args) {
       ArrayList<Integer> list1 = new ArrayList<>();
       list1.add(2);list1.add(3);list1.add(6);list1.add(7);list1.add(9);

       ArrayList<Integer> list2 = new ArrayList<>();
       list2.add(1);list2.add(4);list2.add(8);list2.add(10);

       int kthelement = findkth_element(list1, list2,list1.size(),list2.size(),5);
       System.out.println("The kth element is " + kthelement);
    }

    static int findkth_element(ArrayList<Integer> list1,ArrayList<Integer> list2,int m,int n,int k) {
      //merged array
      ArrayList<Integer> list3 = new ArrayList<>();
    //   1,2,3,4,6,7,8,9,10
      
     // int k = 4;

      int i =0;
      int j = 0;
      while(i<m && j<n) {
        if(list1.get(i) < list2.get(j)) {
        list3.add(list1.get(i++));}
        
        else{ 
            list3.add(list2.get(j++));
        }
        }
        //if in case some elements are left

        while(i<m){
            list3.add(list1.get(i++));}
        
        while(j<n){
            list3.add(list2.get(j++));}
        




return list3.get(k - 1); //why k - 1(k= 4 ans 4 is at index3 so )
    }
}

