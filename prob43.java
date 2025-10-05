import java.util.*;

public class prob43 {
    public static void main(String[] args) {
        String s = "({[]}))";
        boolean res = isValidparen(s);
        System.out.println(res);


    }

    static boolean isValidparen(String s){
        if(s.length() % 2 != 0) return false;
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){

            if(c == '{' || c == '[' || c == '(' ){
                st.push(c);
            }
            else{
                if(st.isEmpty()) return false;
                char top = st.pop();

                if(c == ')' && top != '(' ||c == '}' && top != '{'|| c == ']' && top != '[' )
                    return false;
            }
        }
        return st.isEmpty();
    }

}
