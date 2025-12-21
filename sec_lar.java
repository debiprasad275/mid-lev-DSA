public class sec_lar {
    public static void main(String[] args) {
        
        int arr[] = {3,10,2,5};
        int n = arr.length;

        int first_lar = Integer.MIN_VALUE;
        int second_lar = 0;

        for(int i  =0;i<n;i++){
            if(arr[i]>first_lar) first_lar = arr[i];
        }
        System.out.println(first_lar);

        for(int i =0;i<n;i++){
            if(arr[i]<first_lar) second_lar = Math.max(second_lar,arr[i]);
        }
        System.out.println(second_lar);
    }
}
