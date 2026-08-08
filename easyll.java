//delete every kth node
/*import java.util.*;
class LL {
    Node head;
    Node tail;
    int size;
    public LL(){
        this.size = 0;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        while(tail == null){
            tail = head;
        }
        size++;
    }
    public void deletelast(Node head,int k){
        if(head==null || k<=0){
            return;
        }
        if(k==1){
            head = null;
            tail = null;
            size = 0;
            return;
        }
        Node curr = head;
        Node prev = null;
        int count = 1;

        while(curr != null){
            if(count%k == 0){
                prev.next = curr.next;
                if(curr == tail) tail = prev;
                size--;
            }
            else{
                prev = curr;
            }
            curr = curr.next;
            count++;
        }
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
    public class easyll{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            LL list = new LL();
            int n = sc.nextInt();
            int k = sc.nextInt();
            for(int i=0;i<n;i++){
                int value = sc.nextInt();
                list.insertFirst(value);
            }
            list.display();
            list.deletelast(list.head,k);
            System.out.println("After deletion");
            list.display();
        }
    }

}*/

//return the middle index
//if odd length = return middle 
//if even length = return second middle
/*import java.util.*;
class LL{
    Node head;
    Node tail;
    int size;
    public LL(){
        this.size = 0;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public int getlength(Node head){
        int length = 0;
        while(head != null){
            length++;
            head = head.next;
        }
        return length;
    }
    public int middle(Node head){
        int length = getlength(head);
        int midIndex = length/2;
        while(midIndex>0){
            head = head.next;
            midIndex--;
        }
        return head.value;
    }
    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
    public class easyll{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            LL list = new LL();
            for(int i=0;i<n;i++){
                int value = sc.nextInt();
                list.insertFirst(value);
            }
            list.display();
            System.out.println("List length"+" "+list.getlength(list.head));
            System.out.println("Middle Index in the List"+" "+list.middle(list.head));

        }
    }
}*/

//count occurences in a linkedlist 
/*import java.util.*;
class LL{
    Node head;
    Node tail;
    int size;
    public LL(){
        this.size = 0;
    }
      public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public static int count(Node head,int k){
        if(head == null) return 0;
        int ans = count(head.next,k);
        if(head.value == k){
            ans++;
        }
        return ans;
    }
    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next ){
            this.value = value;
            this.next = next;
        }
    } 
    public class easyll{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            LL list = new LL();
            int n = sc.nextInt();
            int k = sc.nextInt();
            for(int i=0;i<n;i++){
                int value = sc.nextInt();
                list.insertFirst(value);
            }
            list.display();
            System.out.println("Occurences of a number in a linkelist"+" "+list.count(list.head,k));
        }
    }
}*/

//circular linkedlist
/*import java.util.*;
class cll{
    Node head;
    Node tail;
    public cll(){
        this.head = head;
        this.tail = tail;
    }
    public void insert(int val){
        Node node = new Node(val);
        if(head==null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void display(){
        Node node = head;
        if(head !=null){
            do{
                System.out.print(node.val+"->");
                node = node.next;
            }while(node != head);
        }
        System.out.println("HEAD");
    }
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
    }
    public class easyll{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            cll list = new cll();
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                int val = sc.nextInt();
                list.insert(val);
            }
            list.display();
        }
    }
}*/

//checking if a given list circular ll or not
/*import java.util.*;
public class cll {

    Node head;
    Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // Insert at end
    public void insert(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = tail = node;
            tail.next = head;
            return;
        }

        tail.next = node;
        tail = node;
        tail.next = head;
    }

    // Display
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.value + "->");
            temp = temp.next;
        } while (temp != head);

        System.out.println("HEAD");
    }

    // Check if circular
    public boolean check() {
        if (head == null)
            return true;

        Node temp = head.next;

        while (temp != null && temp != head) {
            temp = temp.next;
        }

        return temp == head;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        cll list = new cll();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.insert(value);
        }

        list.display();

        if (list.check()) {
            System.out.println("The given list is a circular linked list");
        } else {
            System.out.println("The given list is not a circular linked list");
        }

        sc.close();
    }
}*/

//circular linkedlist counting
/*import java.util.*;
class cll{
    Node head;
    Node tail;
    public cll(){
        head = null;
        tail = null;
    }
    public void insert(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void display(){
        Node temp = head;
        if(head != null){
            do{
                System.out.print(temp.value+"->");
                temp = temp.next;
            }while(temp != head);
        }
        System.out.print("HEAD\n");
    }
    public static int count(Node head, Node tail) {
    if (head == null) {
        return 0;
    }

    int count = 1;
    Node temp = head;

    while (temp != tail) {
        count++;
        temp = temp.next;
    }

    return count;
}
    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
}
    public class easyll{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            cll list = new cll();
            int n = sc.nextInt();
            for(int i= 0;i<n;i++){
                int value = sc.nextInt();
                list.insert(value);
            }
            list.display();
           System.out.print( "count: "+ " " +list.count(list.head,list.tail));
        }
    }*/
