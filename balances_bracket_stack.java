import java.util.*;

public class balances_bracket_stack {
    public static void main(String[] args) {
        String s = "{[()]}";

        if(isbalance(s) == true) {
            System.out.println("all balanced");

    }
    else{
        System.out.println("not balanced");
    }
}


static boolean matching(char a,char b) {
    return ((a == '(' && b == ')' ) ||  
            (a == '{' && b == '}')  ||  
               ( a == '[' && b == ']' )) ;
}


static boolean isbalance(String s){
    ArrayDeque<Character> a = new ArrayDeque<Character>();

    for(int i = 0; i < s.length(); i++){

        if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '('){
            a.push(s.charAt(i));
                    }
        else{

            if(a.isEmpty() == true ){
                return false;
            }
            else if(matching(a.peek(),s.charAt(i)) == false){
                return false;
            }
            else{
                a.pop();
            }
            


            //method-2
            // if (!a.isEmpty() && 
            // ((a.peek() == '(' && s.charAt(i) == ')') ||
            //  (a.peek() == '{' && s.charAt(i) == '}') ||
            //  (a.peek() == '[' && s.charAt(i) == ']'))) {
            // a.pop(); 
        }
        
    }
    

 
return (a.isEmpty() == true);
}
}
