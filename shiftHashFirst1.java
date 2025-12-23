public class shiftHashFirst1 {
    public static void main(String[] args) {
        
        String s = "##ab#c#ds";

        StringBuffer hash = new StringBuffer();
                StringBuffer letters = new StringBuffer();


        for(char c : s.toCharArray()){
            if(c == '#') hash.append('#');
            else letters.append(c);

        }

        System.out.println(hash.toString() + letters.toString());
    }
}
