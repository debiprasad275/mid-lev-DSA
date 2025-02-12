import java.util.*;

class Stack{
    static final int MAX = 1000;
    int top ;
    int a[] = new int [MAX];


    boolean isEmpty(){
        return(top<0);
    }

    Stack(){
        top  =-1;
    }


    boolean push(int i){
        if(top >= (MAX-1)){
            System.out.println("Stack overflow");
            return false;
        }

        else{
            a[++top] = i;
            System.out.println(i + " pushed to the stack");
            return true;
        }
}

int pop(){
    if(top < 0){
        System.out.println("Stack underflow");
        return 0;

    }
else{
    int i = a[top--];
    
    return i;
        }
                }   
}

public class array_stack{
    public static void main(String[] args) {
        
        Stack s = new Stack();   //s is the stack object

        //push ele

        s.push(10);
        s.push(19);
        s.push(29);

        System.out.println(s.pop()+" ele popped from stack");

        
    }
}