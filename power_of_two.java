public class power_of_two {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(check_power_of_two(n));
    }

    static boolean check_power_of_two(int n){
        if(n<=0) return false;

        int logval = (int)(Math.log(n) / Math.log(2));
        
        if(Math.pow(2,logval) == n) return true;


        //2nd method
        //10000               //10001 & 10000 = 10000           
        //01000
        //------ &
        //00000


        // int res = n &(n-1);
        // if(res == 0) return true;
        

        return false;
    }

}
