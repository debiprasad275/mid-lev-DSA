import java.util.*;
public class prob20b {
    public static void main(String[] args) {
        
        String s = "hello";
        HashMap <Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }

        System.out.println("freq of each char:");
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println("char:"+ entry.getKey() +"-"+ "freq"+ entry.getValue());
        }

    }
}
