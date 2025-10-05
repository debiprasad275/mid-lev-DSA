import java.util.*;


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
};
public class prob44 {

private static Node arrtoll(int arr[]){
    Node head = new Node(arr[0]);
    Node mover = head;

    for(int i = 1;i<arr.length;i++){
        Node temp = new Node(arr[i]);
        mover.next = temp;
        mover = temp;
    }
    return head;
}

private static void print(Node head){
    Node temp = head;
    while(temp!= null){
        System.out.print(temp.data+"->");
        temp= temp.next;
    }
    System.out.println("null");
    System.out.println();
   
}

static Node reverseLL(Node head){
    Node temp = head;
    Stack <Integer> st = new Stack<>();
    while(temp != null){
        st.push(temp.data);
        temp = temp.next;
    }

    temp = head;
    while(temp != null){
        temp.data =st.pop();
        
        temp = temp.next;
    }
    return head;
}

    public static void main(String[] args) {
        int arr[] = {1,3,4,5};

        Node head = arrtoll(arr);
        print(head);
        
        head = reverseLL(head);
        print(head);
    }
}
