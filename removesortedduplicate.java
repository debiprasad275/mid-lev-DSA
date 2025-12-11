public class removesortedduplicate {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        int n = arr.length;
        int newarr[] = new int [n];
        int cur = -1;
        int cnt = 0;
        for(int i =0;i<n;i++){
            if(cur != arr[i]){
                newarr[cnt] = arr[i];
                cur = arr[i];
                cnt++;
            }
        }
        for(int i =0;i<n;i++){
            System.out.println(newarr[i]+" ");
        }
    }
}
