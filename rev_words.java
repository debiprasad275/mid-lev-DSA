public class rev_words {
    public static void main(String[] args) {
        String  s = "Debi Prasad";
        String[] words = s.split(" ");

        StringBuilder str = new StringBuilder();

        for(int i = words.length -1;i>=0;i--){
            str.append(words[i]);
            if(i != 0) str.append(" ");

        }
        System.out.println(str.toString());
    }
}
