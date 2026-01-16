public class container_with_water{
    public static void main(String[] args){
        System.out.println("enter the heights of the container");
        int h [] = {7,3,6,2,9,4,5};
        for (int i = 0; i < h.length; i++){
            System.out.println("containers heights : "+ h[i]);
        }
        System.out.println("Size of the maximum container having maximum liters of water:"+maximum_container(h));

    }
    public static int maximum_container(int [] h){
        int left = 0;
        int right =h.length - 1;
        int maxArea = 0;
         

        while(left<right){
            int currentArea = Math.min(h[left],h[right]) * (right - left);
            maxArea =Math.max(maxArea,currentArea);
        if(h[left]<h[right]){
            left++;
        }
        else{
        right--;
        }
    }
    return maxArea;

}
}