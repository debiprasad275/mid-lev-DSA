public class prob7 {
    public static void main(String[] args) {
        String str = "abcabc";
        int res = containsallthreeele(str);
        System.out.println(res);

    }
    static int containsallthreeele(String str){
        int s = str.length();

        int cnt = 0;
        for(int i = 0;i<s;i++){
            boolean ya = false,yb = false,yc = false;
            for(int j = i;j<s;j++){
                char ch = str.charAt(j);
                if(ch == 'a') ya = true;
                if(ch == 'b') yb = true;
                if(ch == 'c') yc = true;

                if(ya && yb && yc) cnt++;
                
            }
        }
        return cnt;
    }
}
