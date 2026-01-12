import java.util.HashMap;

public class unique_string_concat {
    public static void main(String[] args) {
        
        String s1 = "aacdb";
        String s2 = "gafd";

        System.out.println(String_concat(s1, s2));

    }
    public static String String_concat(String s1, String s2){

        String res = "";

        HashMap <Character, Integer> map = new HashMap<>();

        for(int i = 0;i<s2.length();i++){
            map.put(s2.charAt(i),1);
        }

        for(int i =0;i<s1.length();i++){
            if(!map.containsKey(s1.charAt(i))){
                res += s1.charAt(i);
            }
            else{
                map.put(s1.charAt(i),2);
            }
        }

        for(int i =0;i<s2.length();i++){
            if(map.get(s2.charAt(i)) == 1){
                res += s2.charAt(i);
            }
        }
        return res;

    }
    
}
