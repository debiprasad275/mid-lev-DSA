import java.util.*;
public class validparen {
    public static void main(String[] args) {
        String s = "[{()}])";

        if(isvalid(s) == true){
            System.out.println("is a valid string");
        }
        else{
            System.out.println("not a valid string");
        }

    }

    public static boolean isvalid(String s){
        Stack <Character> st = new Stack<>();
        for(char it : s.toCharArray()){
            if(it == '[' || it == '{' || it == '('){
                st.push(it);
            }

            else{
                if(st.isEmpty()) return false;
                char ch = st.pop();
                if((it == ']' && ch == '[') || (it == ')' && ch == '(') || (it == '}' && ch == '{')) continue;
                else return false;
            }
        }

        return st.isEmpty();  // this part of code have ability to give true or false
    } 
}
