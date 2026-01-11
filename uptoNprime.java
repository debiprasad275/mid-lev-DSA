public class uptoNprime{
    public static void main(String[] args) {
        int num = 11;
        int res[] = printPrime(num);
        for(int i = 0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }

    static int [] printPrime(int num){
        int cnt = 0;
        int temp [] = new int[num];

        for(int i = 2;i<=num;i++){
            boolean isPrime = true;

            for(int j = 2;j<=Math.sqrt(i);j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                } 
            }

            if(isPrime){
                temp[cnt] = i;
                cnt++;
            }
        }

        int answer[] = new int[cnt];
        for(int k = 0;k<cnt;k++){
            answer[k] = temp[k];
        }

        return answer;
    }
}