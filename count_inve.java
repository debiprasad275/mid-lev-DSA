public class count_inve {
    public static void main(String[] args) {
        int [] arry = {2,4,1,6,5};
        for (int i = 0; i < arry.length; i++) {
            System.out.println("arrays elements are:"+ arry[i]);

    }
    System.out.println("after counting inversion the array becomes:"+getinv_count(arry));
    
}
   public static int getinv_count(int[] arry) {
    int inv_count = 0;
    for (int i = 0; i <=arry.length-1; i++) {
        for (int j = i+1; j <= arry.length-1 ;j++){
            if(arry[i] > arry[j]  ){
                inv_count++;
            }
        }
    }
    return inv_count;
}
}