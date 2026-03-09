public class koko {
    public static void main(String[] args) {
        int bana[]= {3,6,7,11};
        int hours = 8;
        int ans = minnumbersofbananas(bana, hours);
        System.out.println("kok can eat " + ans +" bananas");
    }

    static int totalhours(int b [], int h){
        int n = b.length;
        int totalh= 0;
        for(int i = 0; i < n; i++){
            totalh += Math.ceil((double)b[i]/(double) h);
        }
        return totalh;
    }
    static int minnumbersofbananas(int b [],int h){
        int n = b.length;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            maxi = Math.max(b[i],maxi);
        }
        int low = 1;
        int high = maxi;
        while(low <= high){
            int mid = (low + high) / 2;
            int totalh = totalhours(b,mid);
            if(totalh <= h){
                high = mid-1;
            }
            else{
                low = mid+1;
            }

        }
        return low;
        
    }
}
