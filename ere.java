import java.util.*;
    // A class to represent a node of a linked list
class Node {
    int data; // the data stored in the node
    Node next; // the reference to the next node

    // A constructor to create a new node with the given data
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// A class to represent a linked list
class LinkedList {
    Node head; // the head of the list

    // A method to insert a new node at any position in the list
    public void insertAtPosition(int data, int position) {
        // Create a new node with the given data
        Node newNode = new Node(data);

        // If the position is 0, make the new node the head of the list
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Find the node before the position
        Node prev = head;
        for (int i = 0; i < position - 1; i++) {
            // If the position is invalid, print a message and return
            if (prev == null) {
                System.out.println("Invalid position!");
                return;
            }
            // Move to the next node
            prev = prev.next;
        }

        // Insert the new node after the previous node
        newNode.next = prev.next;
        prev.next = newNode;
    }

    // A method to print the list
    public void printList() {
        // Start from the head
        Node curr = head;
        // Loop until the end of the list
        while (curr != null) {
            // Print the data of the current node
            System.out.print(curr.data + " ");
            // Move to the next node
            curr = curr.next;
        }
        // Print a new line
        System.out.println();
    }
}

// A class to test the program
   public class ere{
public static void main(String[] args) {
        // Create a scanner object to get the user input
        Scanner sc = new Scanner(System.in);

        // Create a linked list object
        LinkedList list = new LinkedList();

        // Ask the user how many nodes to add
        System.out.println("How many nodes do you want to add?");
        int n = sc.nextInt();

        // Loop n times
        for (int i = 0; i < n; i++) {
            // Ask the user the data and the position of the node
            System.out.println("Enter the data and the position of the node:");
            int data = sc.nextInt();
            int position = sc.nextInt();

            // Insert the node at the given position
            list.insertAtPosition(data, position);

            // Print the list after insertion
            System.out.println("The list after insertion is:");
            list.printList();
        }

        // Close the scanner
        sc.close();
    }
}

    

