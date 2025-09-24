public class prob27 {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4};
        int n = arr.length;
        
       int product [] = new int [n];

        for(int i = 0;i<n;i++){
            int prod = 1;
            for(int j = 0;j<n;j++){
                if(i != j)
                prod = prod * arr[j];
            }
            
            product[i] = prod;
        }
        for(int i = 0;i<n;i++){
            System.out.println(product[i]+" ");
        }
    }
}
