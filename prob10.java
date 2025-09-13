import java.util.ArrayList;

public class prob10 {
    public static void main(String[] args) {
        int arr[] = {6,13,21,25,1,2,3,4,4,5,9,11,13};
        int n = arr.length;
        int ans = countinginversion(arr, n);
        System.out.println(ans);
    }
    public static int countinginversion(int arr[],int n){
        return mergesort(arr,0,n-1);
    }

    public static int mergesort(int arr[],int low,int high){
        //base condition
        int cnt = 0;
        if(low >= high) return cnt;
        int mid = (low+high) / 2;
        cnt += mergesort(arr, low, mid);
        cnt += mergesort(arr, mid+1, high);
        cnt += countingpairs(arr,low,mid,high);
        merge(arr, low, mid, high);

        return cnt;
    }

    public static int countingpairs(int arr[],int low,int mid,int high){
        int right = mid+1;
        int cnt = 0;
        for(int i = low;i<=mid;i++){

            while (right <= high && arr[i] > 2*arr[right]) {
                right++;
            }
            cnt = cnt + (right -(mid+1));
        }
        return cnt;
    }


    public static void merge(int arr[], int low,int mid,int high){
        ArrayList <Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid+1;

        
        while(left <= mid && right <=high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        for(int i = low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
        //return cnt;
    }
}
