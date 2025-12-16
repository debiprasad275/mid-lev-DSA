public class reverseaWholeString1 {
    public static void main(String[] args) {
        String s = "I LOVE CODING";
        System.out.println(reverseWords(s));
    }


    public static String reverseWords(String s){

       String str[] = s.split(" +");
       StringBuilder sb = new StringBuilder();
       for(int i = str.length-1;i>=0;i-- ){
            sb.append(str[i]);
            sb.append(" ");
       }

        return str.toString().trim();
    }
}
