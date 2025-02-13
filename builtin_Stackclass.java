import java.util.*;
//In single thread environment we use ArrayDeque instead of stack class
//cause Stack needs threads
// aslo both the class have all the functionality like push,peekand pop in java collections


public class builtin_Stackclass{
    public static void main(String[] args) {

        //Stack<Integer> stack = new Stack<Integer>();

        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        // ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(23);
        stack.push(12);

        System.out.println(stack.peek());   //only return 
        System.out.println(stack.pop());  //return and remove
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

    }
}
