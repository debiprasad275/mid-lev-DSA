public class odd_string {
    public static void main(String[] args) {
        String s = "4206";
        int maxlen = 0;
       
       
        for(int i =0;i<s.length();i++){
             String str = "";
            for(int j = i;j<s.length();j++){
                
                str = str+ s.charAt(j);
                // System.out.println(str);
                 
                 if(Integer.parseInt(str) % 2 == 1){
                    if(maxlen < Integer.parseInt(str)){
                        maxlen = Integer.parseInt(str);
                    }
                 }
            }
 
        }
        String res = Integer.toString(maxlen);
        //res = res.replaceFirst("^0+", "");
       System.out.println(res);

    }
}
