public class remove_ele {
    public static void main(String[] args) {
        int arr[] = {3,2,2,3};
        int val = 3;

        int cnt = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] != val){
                arr[cnt] = arr[i];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
