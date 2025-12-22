public class shiftHashfirst {
    public static void main(String[] args) {
        
        String s = "a#b#c#d#";
        int len = s.length();   
        char newString[] = new char [len];
        int j = 0;
        for(int i = 0;i<len;i++){
            if(s.charAt(i) == '#'){
                newString[j++] = s.charAt(i);
                
            }
           
        }
        for(int i =0;i<len;i++){
            if(s.charAt(i) != '#'){
                newString[j++] = s.charAt(i);
                
            }
        }
        System.out.println(new String(newString));
    }
}