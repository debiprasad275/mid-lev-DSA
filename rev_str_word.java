public class rev_str_word {
   public static void main(String[] args) {
    String s = " Debi                  Prasad  Subudhi ";
    System.out.println(reverse_string_of_words(s));
   } 

   static String reverse_string_of_words(String s){

        String word[] = s.split(" +");
        StringBuilder str = new StringBuilder();
        for(int i = word.length-1;i>=0;i--){
            str.append(word[i]);
            str.append(" ");

        }
        return str.toString().trim();
   }
}
