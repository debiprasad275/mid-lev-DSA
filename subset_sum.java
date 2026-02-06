// logic is use sum as main character int this logic if the element is from the set always have 
//the sum as a result is 0 which is satisfied the base case and return the value.
//(why sum is 0 from our recursive call we include a logic as sum - arr[n-1])
//if inti sum is 0 then count is 1   (*)


public class subset_sum {
    public static void main(String[] args) {
        int sum = 0;
        int arr [] = {10,20,15};
        int n = arr.length;
        int count = 0;

        int result = subsetSum(arr, sum, n, count);
        System.out.println("The number of possible subset is: "+ result);
        
    }

    static int subsetSum(int [] arr,int sum,int n,int count) {
        if(n == 0){
            return (sum == 0) ? count+1 : count;
        }

        return subsetSum(arr,sum,n-1,count) + subsetSum(arr,sum - arr[n-1], n-1,count);
    }

}
