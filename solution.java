class Solution {
        public static void main(String [] args){
    System.out.print("the elementof an array is :");
        int[] arr = {3,7,11,15};
        for(int element : arr)
    System.out.print(element+",");
    System.out.println();
    int target = 18;
    System.out.println("Enter the target " + target);
    
        int indices[] = twoSum(arr, target);
        if(indices.length == 2)
    System.out.print("So,here is the two indices "+indices[0]+" "+indices[1]);
    }
    public static int[] twoSum(int[] arr, int target) {
        for(int i = 0;i < arr.length;i++){
            for(int j =1;j < arr.length;j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
    
        return new int[] {};
    
}
    }