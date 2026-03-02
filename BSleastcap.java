public class BSleastcap {
    //least capacity to moved all the items in d days
    public static void main(String[] args) {
        int item[]= {1,2,3,4,5,6,7,8,9,10};  //items weight
        int d = 5; //given day to comp//
        int ans = leastweightcapacity(item, d);
        System.out.println("leastcapacity to move all items "+ ans);
    }

    //daysrequire
    static int daysrequire(int item[],int cap)
    {
        int n = item.length;
        int load =0;
        int day = 1;

        for(int i=0;i<n;i++){
            if(load + item[i] > cap){
                day = day+1;
                load =  item[i];}
            else
                load += item[i];
            
        }
        return day;
    }

    static int leastweightcapacity(int weights[],int d){
        
        int low = Integer.MIN_VALUE, high = 0;
        for (int i = 0; i < weights.length; i++) {
            high += weights[i];
            low = Math.max(low, weights[i]);
        }


        //optimal approach
        while(low<= high){
        int mid = (low+high)/2;
            int numberofDays = daysrequire(weights, mid);
        if(numberofDays <= d){
            high = mid-1;
        }
        else
            low = low + 1;
        

        }
        return low;
    
    // for(int i = max ;i<=sum ;i++){// bb approach
    //         if(daysrequire(item, i)<=d){  //i== cap
    //             return i;
    //         }
    //     }
        //return -1;
    }
}

