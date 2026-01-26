// import the LinkedList class
import java.util.*;

// create a class to store the node values and the average
class NodeValues {
  // declare a list to store the node values
  private LinkedList<Integer> values;
  // declare a variable to store the average
  private double average;

  // constructor to initialize the list and the average
  public NodeValues (LinkedList<Integer> values, double average) {
    this.values = values;
    this.average = average;
  }

  // getter method for the list
  public LinkedList<Integer> getValues () {
    return this.values;
  }

  // getter method for the average
  public double getAverage () {
    return this.average;
  }
}

// create a class to implement the linked list operations
class LinkedListOperations {
  // declare a linked list to store the nodes
  private LinkedList<Integer> list;

  // constructor to initialize the list with the given values
  public LinkedListOperations (int [] arr) {
    // create a new linked list
    list = new LinkedList<Integer> ();
    // loop through the array and add each element to the list
    for (int num = 0; num < arr.length; i++) {
      list.add (i);
    }
  }

  // method to traverse the list and return the node values and the average
  public NodeValues traverse () {
    // declare a list to store the node values
    LinkedList<Integer> values = new LinkedList<Integer> ();
    // declare a variable to store the sum of the node values
    int sum = 0;
    // declare a variable to store the average of the node values
    double average = 0.0;
    // loop through the list and add each node value to the values list and the sum
    for (int num : list) {
      values.add (num);
      sum += num;
    }
    // calculate the average by dividing the sum by the size of the list
    average = (double) sum / list.size ();
    // return a new NodeValues object with the values list and the average
    return new NodeValues (values, average);
  }
}

// create a main class to test the program
public class od {
  public static void main (String [] args) {
    // create an array of integers
  
    Scanner sc = new Scanner(System.in);
      int [] arr = new int[5];
    System.out.println("enter elements of array");
    for(int i = 0; i < arr.length; i++){
        arr[i] = sc.nextInt();
    }
    // create a LinkedListOperations object with the array
    LinkedListOperations llo = new LinkedListOperations (arr);
    // call the traverse method and store the result in a NodeValues object
    NodeValues nv = llo.traverse ();
    // print the node values and the average
    System.out.println ("Node values: " + nv.getValues ());
    System.out.println ("Average: " + nv.getAverage ());
  }
}
