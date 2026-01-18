public class Alargest {
    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 4, 5};
        int l = arr[0];
        int s =arr[arr.length-1];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i]>l && arr[i]<s) {
                l = arr[i];
                s = arr[i];
            }
    }
    System.out.println("largest is " + l);
}
}