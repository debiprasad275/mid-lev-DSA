import java .util. *;

public class String_Permutation{
    public static void main(String[] args) {
        String s = "abc";

        permutation_str(s);
    }


    static void strswap(StringBuilder s,int i,int j ){
        char temp = s.charAt(i);
        s.setCharAt(i, s.charAt(j));
        s.setCharAt(j,temp);

    }

    static void perstrrec(StringBuilder s,int i){
        // last char is fixed no need to swap using base case simply print the hole string
        if(i == s.length()-1){
            System.out.println(s);
            return;
        }
        for(int j=i;j<s.length();j++){
            strswap(s,i,j);
            perstrrec(s, i+1);
            strswap(s, i, j);
    }
}

static void permutation_str(String s){
    int index = 0;
    perstrrec(new StringBuilder(s),index); //main

}
}