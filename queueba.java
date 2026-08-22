//implementation of queue using array

/*import java.util.*;
class Queue{
    int[] queue;
    int front = -1;
    int rear = -1;
    int size;
    Queue(int size){
        this.size = size;
        queue = new int[size];
    }
    
    void enqueue(int value){
        if(rear == size-1){
            System.out.println("Queue Overflow");
            return;
        }
        if(front == -1){
            front = 0;
        }
        rear++;
        queue[rear] = value;
        System.out.println(value+"inserted");
    }
    void dequeue(){
        if(front == -1||front>rear){
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println(queue[front]+" deleted");
        front++;
    }
    void display(){
        if(front == -1 || front>rear){
            System.out.println("Queue is empty: ");
            return;
        }
        System.out.print("Queue: ");
        for(int i=0;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
}
public class queueba{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue size: ");
        int n = sc.nextInt();
        Queue q = new Queue(n);
        while(true){
            System.out.println("\n1.Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3.Display");
            System.out.println("4.Exit");

            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    q.enqueue(value);
                    break;

                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("Program ended");
                    return;
                default:
                    System.out.println("Invalid choice...");
            }
        }
    }
}*/

//Implementation of circular queue using array
/*import java.util.*;
class circularqueue{
    int[] queue;
    int front = -1;
    int rear = -1;
    int size;
    circularqueue(int size){
        this.size = size;
        queue = new int[size];
    }
    void enqueue(int value){
        //Queue is full 
        if((rear+1)%size == front){
            System.out.println("Queue Overflow");
            return;
        }
        //first element
        if(front==-1){
            front = 0;
            rear = 0;
        }else{
            rear = (rear+1)%size;
        }
        queue[rear] = value;
        System.out.println(value+"inserted");
    }
    void dequeue(){
        //queue is empty
        if(front==-1){
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println(queue[front]+"deleted");
        //onlh one element
        if(front==rear){
            front = -1;
            rear = -1;
        }else{
            front = (front+1) %size;
        }
    }
    void display(){
        if(front==-1){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue: ");
        int i = front;
        while(true){
            System.out.println(queue[i]+" ");
            if(i == rear){
                break;
            }
            i  = (i+1)%size;
        }
        System.out.println();
    }
}
public class queueba{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue size...");
        int size = sc.nextInt();
        circularqueue q = new circularqueue(size);
        while(true){
            System.out.println("\n1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter value: ");
                    int value = sc.nextInt();
                    q.enqueue(value);
                    break;

                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("Program has ended....");
                    return;
                default:
                    System.out.println("Invalid choice..");
            }

        }
    }
}*/


/*import java.util.Scanner;

public class queueba {

    int[] queue;
    int size;
    int front = -1;
    int rear = -1;

    queueba(int size) {
        this.size = size;
        queue = new int[size];
    }

    // Enqueue operation
    void enqueue(int value) {

        // Check if queue is full
        if ((rear + 1) % size == front) {
            System.out.println("Queue is full");
            return;
        }

        // First element
        if (front == -1) {
            front = 0;
            rear = 0;
        } 
        else {
            rear = (rear + 1) % size;
        }

        queue[rear] = value;
    }

    // Display queue
    void display() {

        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");

        int i = front;

        while (true) {

            System.out.print(queue[i] + " ");

            if (i == rear) {
                break;
            }

            i = (i + 1) % size;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int size = sc.nextInt();

        queueba cq = new queueba(size);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter element: ");
            int value = sc.nextInt();

            cq.enqueue(value);
        }

        // Display at the end
        cq.display();

        sc.close();
    }
}*/

//queue linked list implementation
/*import java.util.*;
public class queueba{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node front = null;
    Node rear = null;

    //enqueue operation
    void enqueue(int value){
        Node node = new Node(value);
        //if queue is empty
        if(front==null){
            front = node;
            rear = node;
        }
        else{
            rear.next = node;
            rear = node;
        }
        System.out.println(value+" inserted");
    }
    //dequeue operation
    void dequeue(){
        if(front == null){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(front.data+" deleted");
        front = front.next;
        //if queue bemoes empty
        if(front == null){
            rear = null;
        }
    }
    void display(){
        if(front == null){
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        System.out.println("Queue: ");
        while(temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        queueba q = new queueba();
        System.out.println("Enter no.of elements.......");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter element: ");
            int value = sc.nextInt();
            q.enqueue(value);
        }
        q.display();
    }
}
*/