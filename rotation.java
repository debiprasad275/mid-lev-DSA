public class rotation {
    //left rotate the array by one place
    public static void main(String[] args) {
        
        int  arr [] = {1, 2, 3, 4, 5, 6};
        int n =  arr.length;
        System.out.println("original array");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");}
System.out.println();
         leftRotate(arr, n);
        System.out.println("after rotation:");
            for(int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
    }
    

    }

    static void leftRotate(int[] arr, int n ){
        int temp = arr[0];
        for(int i = 1; i < n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
}
