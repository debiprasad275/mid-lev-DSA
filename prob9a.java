public class prob9a {
    public static void main(String[] args) {
        int arr[] = {2,3,4,0,1,-2,-5};
        int res = maximumsum(arr);
        System.out.println(res);
    }

    static int maximumsum(int arr[]){
        int prefix_prod = 1;
        int surfix_prod = 1;
        int maxprod = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0) prefix_prod = 1;
            if(arr[i] == 0) surfix_prod = 1;

            prefix_prod = prefix_prod * arr[i];
            surfix_prod = surfix_prod * arr[arr.length-i-1];
            

            maxprod = Math.max(maxprod,Math.max(prefix_prod,surfix_prod));
        }
        return maxprod;
    }
}
