public class kbit_sum {
    public static void main(String[] args) {
        
        int arr[] = {3,5,7,1,10};   
        int k = 1;
        System.out.println(sumIndicesWithKSetBits(arr, k));
    }
    static int sumIndicesWithKSetBits(int arr[], int k){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            if(Integer.bitCount(i) == k){
                sum += arr[i];                  //5+7+10
            }
        }
        return sum;  //22
    }
}
