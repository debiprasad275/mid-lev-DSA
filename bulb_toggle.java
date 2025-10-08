public class bulb_toggle {
    public static void main(String[] args) {
        int n = 64;
        System.out.println(Count_toggle_bulb(n));
    }

    static int Count_toggle_bulb(int n){
        return (int)Math.sqrt(n);
    }
}
