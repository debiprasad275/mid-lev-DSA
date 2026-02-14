      // Given an array of integers, find the nearest smaller number for every element such that the smaller element is on the left side.
public class prevsmallestelement {


    public static void main(String[] args) {
        int arr[]={1,3,5,8,19};
        int n=arr.length;
        printPSN(arr,n);
    }
    //prints smaller elements on left side of every element
    public static void printPSN(int arr[],int n)
    {
        //always print empty or '_' for first element
        //buz their is no element
        System.out.print("_, ");
        //start form sec element
        for(int i=1;i<n;i++){   //outer loop 
            //look for smaller elements on left of 'i'
            for(int j=i-1;j>=0;j--){
                if(arr[j]<arr[i]){
                    System.out.print(arr[j]+",");
                    break;
                }
            
            //if there is no smaller element on the left of 'i'
          if(j==-1)
                System.out.print("_, ");
            
            }

        }

    }
    
}
