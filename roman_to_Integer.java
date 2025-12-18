import java.util.HashMap;

public class roman_to_Integer{
    public static void main(String[] args) {
        
        String s = "IV";
        System.out.println(find_roman_to_int(s));

    }

    static int find_roman_to_int(String s){
        int len = s.length();

    HashMap <Character,Integer> map =new HashMap<Character,Integer>();
    map.put('I',1);
      map.put('V',5);
       map.put('X',10);
        map.put('L',50);
         map.put('C',100);
          map.put('D',500);
           map.put('M',1000);

           int res = map.get(s.charAt(len-1));

           for(int i = len-2;i>=0;i--){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                res = res-map.get(s.charAt(i));
            }
            else{
                res = res+map.get(s.charAt(i));
            }
           }
           return res;
    }
}