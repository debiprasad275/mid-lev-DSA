public class sorting2 {
    public static void main(String[] args) {
        
         int [] arr={45,64,85,35,67,34};

         for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
int temp=0;
                if(arr[j]<arr[i])
{
                   temp =arr[i];
                   arr [i] =arr[j];
                   arr[j] =temp;
}
 
    }
            
System.out.print(arr[i] +" ");
    }
}
}