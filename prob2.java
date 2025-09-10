public class prob2 {
    public static void main(String[] args) {
       int arr[] = {1,1,1,0,0,0,1,1,0,0,1};
       int k = 3;
       int maxlen = 0;
       for(int i =0;i<arr.length;i++){
        int zeros = 0;
            for(int j = 0;j<arr.length; j++){

                if(arr[j] == 0){
                    zeros++;
                }
        if(zeros <= k){
           int len = j-i+1;
           maxlen = Math.max(maxlen,len);

        }
        else break;

        
            }
    }
    System.out.println(maxlen);
}
}
