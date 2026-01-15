import java.util.Scanner;
public class bitoddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("check the input number is odd or even");

     if((num & 1) == 1){
        System.out.println("the "+ num +" is odd");
     }
    else{
        System.out.println("the "+ num +" number is even");
    }
}
}
// Description:-
//here we are using bit-wise and operator in place of logical operators to find a user input number is Even or Odd number
//process: and(&) operation btw given number and 1 to get the ans if the result is 0 it's a Even number otherwise it's a Odd number
//calulations: let's number is 15 (odd)
//15:-   1 1 1 1
//& operator
//1:-    0 0 0 1
//      _________
//rt:-   0 0 0 1

//ex:-2
//12:-   1 1 0 0
//1:-    0 0 0 1
//rt:-   0 0 0 0