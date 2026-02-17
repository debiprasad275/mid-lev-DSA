public class lsumsubarray {
    public static void main(String[] args) {
        int [] arr ={-2,-3,4,-1,-2,1,5,-3};
        int n=arr.length;
        System.out.println("largest sum of the subarray is"+ maxsubarray(arr,n));}

        public static int maxsubarray(int[] arr,int n){
            
            int currsum=arr[0];
            int maxsum=arr[0];
            for(int i=0;i<arr.length;i++){
                // update the current sum by adding the current element
                currsum+=arr[i];
                //if( the current sum  becomes negative ,resset it to zero
                if(currsum<0){
                    currsum=0;

                }
                //update the maximum sum if the curre sum is greater than it
                if(currsum>maxsum){
                    maxsum=currsum;
                }

        }
return maxsum;
    }
}
    
