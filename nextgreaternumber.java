//Given an array, print the Next Greater Element (NGE) for every element. 

//The Next greater Element for an element x is the first greater element on the right side of x in the array. Elements for which no greater element exist, consider the next greater element as -1. 


public class nextgreaternumber {

   /*  public static void main(String[] args) {
        int arr[]={11,13,21,3};
        printNGE(arr);
    }
    

       public static void printNGE(int arr[]){
        int next=-1;
        for(int i=0; i<arr.length; i++){  //outer loop of thr arr
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<=arr[j]){
                   next=arr[j];
                    break;

                }
               // next=arr[j];
            }

       
       System.out.println(arr[i ]+"-->"+next);
    }
}
*/
static void printNGE(int arr[])
    {
        int next, i, j;
    //    next=-1;
        for (i = 0; i < arr.length; i++) {
            next = -1;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    next = arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + " -- " + next);
        }
    }
 
    public static void main(String args[])
    {
        int arr[] = { 11, 13, 21, 3 };
      //  int n = arr.length;
        printNGE(arr);
}}
       
