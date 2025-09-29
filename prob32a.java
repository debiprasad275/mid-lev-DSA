/*7. Trapping Rain Water
 Given n non-negative integers representing an elevation map
 where the width of each bar is 1, compute how much water it
 can trap after rain.
 Input: height = [0,1,0,2,1,0,1,3,2,1,2,1] 
Output: 6 
Explanation: The above elevation map (black section) is
 represented by an array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of
 rain water (blue section) are trapped.*/

public class prob32a {
    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int n = arr.length;

        int leftmax[]  = new int [n];
        int rightmax[] = new int [n];

        leftmax[0] = arr[0];
        for(int i = 1;i<n;i++){
            leftmax[i] = Math.max(leftmax[i-1], arr[i]);
            System.out.print(leftmax[i]+",");
        }
                    System.out.println();

        rightmax[n-1] = arr[n-1];
        for(int i = n-2;i>=0;i--){
            rightmax[i] = Math.max(rightmax[i+1], arr[i]);
            System.out.print(rightmax[i]+",");
        }
        System.out.println();
        int total  = 0;
        for(int i = 0;i<n;i++){
                if(arr[i] < leftmax[i] && arr[i] < rightmax[i]) total += ((Math.min(leftmax[i],rightmax[i])) - arr[i]);
        }

        System.out.println("Total water stored is:"+ total);
    }
}
