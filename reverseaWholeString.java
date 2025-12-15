public class reverseaWholeString {
    public static void main(String[] args) {
        String s = "I LOVE CODING";
        System.out.println(reverseWords(s));
    }


    public static String reverseWords(String s){

        s = s.trim().replaceAll("\\s+"," ");
        
        StringBuilder str = new StringBuilder(s);
        str.reverse();

        int n = str.length();
        int start = 0;
        for(int i = 0;i<n;i++){
            if(i == n || str.charAt(i) == ' '){
                str.replace(start, i, new StringBuilder(str.substring(start, i)).reverse().toString());
                start = i+1;
            }
        }


        return str.toString();
    }
}
