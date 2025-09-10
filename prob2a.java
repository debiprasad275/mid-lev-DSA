public class prob2a {
    public static void main(String[] args) {
        int arr[] = {1,1,1,0,0,0,1,1,1,1,0};
        int n = arr.length;
        int k = 2;
        int res = findingconsecuones(arr, k, n);
        System.out.println(res);

    }

    static int findingconsecuones(int [] a, int k,int n){
        int l = 0;
        int r = 0;
        int maxlen = 0;
        int zeros= 0;

        while(r<n){
            //checks times of zeros
            if(a[r] == 0 ) zeros++; //we need only two 0's

            if(zeros > k){  //check zeros exceeds the k value or not
                if(a[l] == 0) zeros--;  //if yes the move the left pointer 
                //and if there is a zero decrease it for next if codition
                l++; // move forward
            }

            if(zeros >= k){  // if zeros are in the range of k the find the maxlen possible
                maxlen = Math.max(maxlen,r-l+1);
            }
            r++; // always look forward
        }
        return maxlen;  //at the end return the maxlen
    }
}
