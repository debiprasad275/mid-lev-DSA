public class rotate_array {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        left_rotation(arr, k);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        //left rotation
    }

    static void left_rotation(int arr[] ,int k){
        int n = arr.length;
        k = k%n;

        // reverse_partof(arr,0,k-1);  // 3214567
        // reverse_partof(arr,k,n-1);   //3217654
        // reverse_partof(arr,0,n-1);   //4567123 


       
        // right rotation
        reverse_partof(arr,0,n-1); //whole original arr   7654321
        reverse_partof(arr,0,k-1);  // rev arr from 0 to 2 index   5674321
        reverse_partof(arr,k,n-1);  // from 3 to n-1= 6th index   5671234

    }

    static void reverse_partof(int arr[] , int start, int end){

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
