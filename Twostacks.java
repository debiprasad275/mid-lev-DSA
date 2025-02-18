import java.util.*;



    class Twostacks {
        int size;
        int top1;
        int top2;
        int arr[];

        Twostacks(int n) {
            arr = new int[n];
            size = n;
            top1 = -1;
            top2 = size;
        }

        void push1(int n) {

            if (top1 < top2 - 1) {
                top1++;
                arr[top1] = n;

            } else {
                System.out.println("stack overflow");
                System.exit(1);
            }
        }

        void push2(int n) {
            if (top1 < top2 - 1) {
                top2--;
                arr[top2] = n;
            } else {
                System.out.println("stack overflow");
                System.exit(1);
            }
        }

        int pop1() {

            if (top1 >= 0) {
                int n = arr[top1];
                top1--;
                return n;
            }

            else {
                System.out.println("stack underflow");
                System.exit(1);
                ;
            }

            return 0;
        }

        int pop2() {
            if (top2 < size) {
                int n = arr[top2];
                top2++;
                return n;
            }

            else {
                System.out.println("stack underflow");
                System.exit(1);
            }

            return 0;
        }

        int size1(){
            return top1+1;
        }
        int size2(){
            return size-top2;}

    
    public static void main(String[] args) {

        Twostacks ts = new Twostacks(6);

        ts.push1(1);
        ts.push2(2);
        ts.push1(3);
        ts.push2(4);
        ts.push1(5);
        ts.push2(6);

        System.out.println("pop element from stack1:" + ts.pop1());
        System.out.println("pop element from stack2:" + ts.pop2());
        System.out.println("size of the stack1 "+ ts.size1());
        System.out.println("size of the stack1 "+ ts.size2());

    }

    

}