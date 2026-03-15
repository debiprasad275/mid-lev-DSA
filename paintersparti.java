public class paintersparti {
    public static void main(String[] args) {
        int units [] = {10,20,30,40};
        int p = 2;
        int  ans = painterspartition(units,p);
        System.out.println(ans); 
    }


static int painterspartition (int u [], int p) { 
    int n = u.length;
    int low = Integer.MIN_VALUE;
    int high= 0;
    for(int i = 0; i < n; i++) {
        low= Math.max(low,u[i]);
        high = high + u[i];
    }
    for( p = low; p <= high; p++) {
        if(countpainterspart(u, p) <=p){
            return p;
        }
    
}
return low;
}



static int countpainterspart(int u [], int t) {
    int n = u.length;
    int countpainters = 1;
    long totaluwork = 0;
    for(int i = 0; i < n; i++) {
        if(totaluwork + u[i] <=t){
            totaluwork = totaluwork + u[i];

        }
        else{
            countpainters ++;
            totaluwork = u[i];

        }
}
return countpainters;}
}

