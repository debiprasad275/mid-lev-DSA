public class prob37{
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 10;
        int product = 1;
        for(int i = n1;i<=n2;i++){
            product *= n1;
            n1++;
        }
        System.out.println("product of all numers from 1 to 5"+"is :"+product);
        int cntzeros = 0;
        // while(product != 0){
        //     int findzero = product % 10;
        //     if(findzero == 0){
        //         cntzeros++;
        //     }
        //     product /=10;
        // }
        int temp = product;
        while((temp%10) == 0){
            cntzeros += 1;
            temp = temp /10;
        }
        System.out.println("format to write "+product+": "+ temp+"*10^"+cntzeros);
        
    }
}