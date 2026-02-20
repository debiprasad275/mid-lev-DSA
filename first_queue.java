

    class QUEUE{
         //pointers

           int [] queue=new int[5];
           int size;
           int front;
           int rear;
// inssert = enqueue method
           public void enQueue(int data)
           {
                    queue[rear]=data;
                    rear=rear++;
                    size=size++;
                               }

                               //show method
             public void show()
                {
               System.out.print("Elements are :");
                    for(int i=0; i<size;i++){
                        System.out.print(queue[i] +" ");
                    }
                               }
                            
                               
    


                            
                            }


public class first_queue
 {
    public static void main(String[] args)
     {

        //create an object of class QUEUE

    QUEUE G=new QUEUE();
    G.enQueue(0);
    G.enQueue(1);
    G.show();
    
            

    }
}
    