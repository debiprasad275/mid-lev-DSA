public class jump_game {
    public static void main(String[] args) {
        int arr[] = {3,2,1,0,4};   // for this the last position stil 4;

        
        
        int lastpos = arr.length-1;
        for(int i = arr.length-2;i>=0;i--){
            if(i+arr[i] >= lastpos){
                lastpos = i;
            }
        }
        System.out.println(lastpos);
        if(lastpos == 0) System.out.println("true");
        else System.out.println("false");
        
    }
}
