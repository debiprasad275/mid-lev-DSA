public class mele {
    //majority elements
    public static void main(String[] args) {
        int [] arr = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        int ans = majorityele(arr, 0);
        System.out.println("majority ele is:"+ans);
    }

    static int majorityele(int a [],int ele){
       
        int cnt = 0;
        int  n = a.length;
        ele =0;
        
         for(int i =0; i < n; i++)
            if (cnt == 0) {
                // cnt = 1;
              ele= a[i];}
            else if(a[i] == ele)
                cnt++;
             else
                cnt--;
        //     }
         int cnt1= 0;
         for(int i =0; i < n; i++){
            if(ele == a[i]){
                cnt1++;}
        }
        if(cnt1 > (n/2))
        return ele;
    
    return -1;
    }
   
} 
