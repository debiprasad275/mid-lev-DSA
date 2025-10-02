public class prob38 {
    public static void main(String[] args) {
        
        String s1 = "adcwdae";
        String s2 = "dsir";
        String password = "";

        int i ,j;
        for(i = 0,j=0; i<s1.length() && j<s2.length(); i++,j++){
            password = password + s1.charAt(i) + s2.charAt(i);
        }
        
        if(i<s1.length()) password += s1.substring(i);
        else password += s2.substring(j);
        System.out.println(password);
    }
}
