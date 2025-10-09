public class climbing_stair{
    public static void main(String[] args) {
        int n = 12;
        System.out.println("Numbers of Stairs:" + countnum_of_stairs(n));

    }
    static int countnum_of_stairs(int n){

    
        int a = 1; // two stairs before n
        int b = 2;  // one stair before n
        int c = 0;
        if(n == a) return a;
        if(n == b) return b;

        
        for(int i = 0;i<n-2;i++){
            c = a + b;
            a = b;
            b = c;
        }
         return c;
    }
    }
