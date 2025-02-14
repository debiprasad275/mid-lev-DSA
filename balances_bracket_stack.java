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

static boolean isbalance(String s){
    ArrayDeque<Character> a = new ArrayDeque<Character>();

    for(int i = 0; i < s.length(); i++){

        if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == ')'){
            a.push(s.charAt(i));
                    }
        else{

            if (!a.isEmpty() && 
            ((a.peek() == '(' && s.charAt(i) == ')') ||
             (a.peek() == '{' && s.charAt(i) == '}') ||
             (a.peek() == '[' && s.charAt(i) == ']'))) {
            a.pop(); 
        }
        else{
            return false;
        }
    }
    

}  
return (a.isEmpty() == true);
}
}