import java.util.*;
public class remove_outermost {
    public static void main(String[] args) {
        String s = "(())(((())))";

        System.out.println(remove_outermost_char(s));


    }
    static String remove_outermost_char(String s){
        
        String newStr = "";
        int counter = 0;
        for(char c: s.toCharArray()){

            if(c =='('){

                if(counter >0) newStr += c;

                counter++;// why after increment cause we want to add the 
                //index 1 ( if we increment first it take the 0 index para and add it so skip the first one 
            }
            else if(c == ')'){
                counter--;  // why first decrement cause is for continu ( 
                //char the counter value will 3 but for ) we need two iteration to avoid most outer most )
                if(counter > 0){
                    newStr +=c;
                }
            }
            
        }
        return newStr;
    }
    
}
