public class rotatebykplace {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        int k =1;
        array_rotation(arr, k);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
    static void array_rotation(int arr[], int k){
        swap(arr,0,k-1);
        swap(arr,k,arr.length-1);
        swap(arr,0,arr.length-1);

    }
    static void swap(int arr[], int s, int end){
        while(s<end){
            int temp = arr[s];
            arr[s]= arr[end];
            arr[end]= temp;
            s++;
            end--;

        }
    }
}
