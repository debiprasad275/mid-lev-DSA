public class ransom_note {
    public static void main(String[] args) {
        
        String r_note = "aa";
        String m_note = "aab";
        System.out.println(canConstruct(r_note, m_note));

    }

    static boolean canConstruct(String s1, String s2){
        int freq[] = new int[26];

        for(char c:s2.toCharArray()){
            freq[c-'a']++;
        }
        for(char c:s1.toCharArray()){
           if( freq[c-'a'] == 0){
            return false;
           }
           freq[c-'a']--;
        }
        return true;

    }
}
