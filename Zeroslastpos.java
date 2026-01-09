public class Zeroslastpos {
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,0,0,4,0,1};
        zerosatlast(arr);
        
    }
    static void zerosatlast(int arr[]){
        int cnt =0;
        
        int newarr[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++)
        if(arr[i] != 0){
            
            newarr[cnt] = arr[i];
            cnt++;
            
        }
        for(int i =0;i<arr.length;i++){
            System.out.println(newarr[i]+" ");
        }
    }
}
