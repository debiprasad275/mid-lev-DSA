public class consucative1s {
    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1};
            int k = 3;
            System.out.println(findconones(arr, k));

    }
            static int findconones(int arr[], int k){
            int n = arr.length;
            int maxlen =0;
            for(int i = 0;i<n;i++){//<------------------------------
                int countzeros =0;                                        
                for(int j = i;j<n;j++){                                             

                    if(arr[j] == 0) countzeros++;
                                                                                
                    if(countzeros>k) break;  //exists from innerloop -

                    maxlen = Math.max(maxlen,j-i+1);
                }
                }
                return maxlen;
            }
        }
           
        
    


