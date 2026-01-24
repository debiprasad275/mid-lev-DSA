import java.util.*;
public class remove_single_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         System.out.println("Enter a array:  ");
        int arr [] = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++)
        
        System.out.println("Elements of the array: "+arr[i]);

        System.out.print("key: ");
        int key = sc.nextInt();
            int indexToRemove = -1;

        for (int j = 0; j < arr.length; j ++){
            if(arr[j] == key){
                indexToRemove = j;
                break;
            }
        }
        System.out.println("remove index: " + indexToRemove);

       int[] newArr = new int[arr.length - 1]; 
        int src;
        int dst;
        for ( src = 0,dst = 0; src < arr.length; src++){
            if(arr[src] != indexToRemove ){
                newArr[dst] = arr[src];
                dst += 1;
                
            }
           // System.out.println("newArr: " + newArr);

        }
        arr = newArr;
        System.out.println(arr);
    }
}
