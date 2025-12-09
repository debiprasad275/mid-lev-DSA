public class removeduplicateon_sortedarray {
    public static void main(String[] args) {
        
        int arr[] = {2,2,3,3,3,4,5,5};

        int len = arr.length;
        int singlecnt [] = new int[4];
        
        int index = 0 ;
        for(int i = 1;i<len;i++){
            if(arr[i] != arr[i-1]){
                singlecnt[index++] = arr[i-1];
            }
        }
        singlecnt[index] = arr[len-1];
        for(int i =0;i<=index;i++){
            System.out.print(singlecnt[i]);
        }

    }
}
