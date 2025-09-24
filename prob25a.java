public class prob25a {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7};
        int n = arr.length;
        int k = 2;
        rotatearray(arr, n, k);
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotatearray(int []arr,int n,int k){

        reverseele(arr,0,k);
        reverseele(arr,k+1,n-1);
        reverseele(arr,0,n-1);
    }

    public static void reverseele(int arr[],int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
