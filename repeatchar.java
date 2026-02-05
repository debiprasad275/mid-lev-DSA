import java.util.Scanner;
public class repeatchar {
    public static void main(String[] args) {
       Scanner sc  = new Scanner (System.in);
        System.out.println("here is the array of character");
        char[] charArray = new char[6];
        for(int i = 0; i <6; i++) 
        charArray[i] = (char) sc.nextInt();
    
    }
    public static void findrepeatchar(char [] charArray){
        int n = charArray.length;
        for(int i = 0 ; i < n; i++){
            int count = 1;

    for(int j =i+1; j < n; j++){
        if(charArray[i] == charArray[j]){
            count++;
            charArray[j] = '\0';
        }
    }}

    
}
