import java.util.*;
public class memoi {
    public static void main(String[] args) {
        int n= 6 ;
        int  dp [] = new int [n+1];
        Arrays.fill(dp,-1);
        System.out.println("fibonacci value of"+ n +"of is:"+f(n, dp));
    }
    public static int f(int n,int []dp){
        if(n <=1)
        return n;

        //dynamically calculate
        if(dp[n]!= -1)
            return dp[n];
        return dp[n] =f(n-1,dp)+ f(n-2,dp);
        }
     
}
//tabulation method
/*dp[0]= 0;
  dp[1] = 1;
  for (int i =2 ; i<=n; i++)
    dp[i] = dp[i-1] +dp[i-2]
    Syso(dp[n]);

 */
//space optimZATIOn
/*
 prev2 =0
 prev1 =1
 for ( i = 2 ; i<=n; i++)    //time comp = O(n)
                             //space complexity = O(1) const buz instead of using array we use few varisables
 curr = prev1 +prev2
 prev2 = prev1;
 prev1 = curr

 System.out.println(prev1);
 */
