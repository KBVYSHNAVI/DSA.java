//deletion from beginning
/*import java.util.*;
class easyll2{
    Node head;
    Node tail;
    public easyll2(){
        head = null;
        tail = null;
    }
    public void insert(int value){
        Node node = new Node(value);
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
        Node temp = head;
        if(head != null){
            do{
                System.out.print(temp.value+"->");
                temp = temp.next;
            }while(temp != head);
        }
        System.out.println("HEAD");
    }
    public void deleteFirst() {
    if (head == null) {
        return;
    }

    if (head == tail) {
        head = null;
        tail = null;
        return;
    }

    head = head.next;
    tail.next = head;
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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        easyll2 list = new easyll2(); 
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int value = sc.nextInt();
            list.insert(value);
        }
        list.display();
        list.deleteFirst();
        list.display();
    }
}*/

//deletion at particular linkedlist
/*import java.util.*;
class easyll2{
    Node head;
    Node tail;
    public easyll2(){
        head = null;
        tail = null;
    }
    public void insert(int value){
        Node node = new Node(value);
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
        Node temp = head;
        if(head != null){
            do{
                System.out.print(temp.value+"->");
                temp = temp.next;
            }while(temp != head);
        }
        System.out.println("HEAD");
    }
    public void deletionSpecific(int k) {

    // Empty list
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    Node curr = head;
    Node prev = tail;

    do {

        if (curr.value == k) {

            // Only one node
            if (head == tail) {
                head = null;
                tail = null;
                return;
            }

            // Delete head
            if (curr == head) {
                head = head.next;
                tail.next = head;
                return;
            }

            // Delete tail
            if (curr == tail) {
                prev.next = head;
                tail = prev;
                return;
            }

            // Delete middle node
            prev.next = curr.next;
            return;
        }

        prev = curr;
        curr = curr.next;

    } while (curr != head);

    System.out.println("Value not found");
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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        easyll2 list = new easyll2(); 
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i=0;i<n;i++){
            int value = sc.nextInt();
            list.insert(value);
        }
        list.display();
        list.deletionSpecific(k);
        list.display();
    }
}*/

//deletion at ending
/*import java.util.*;
class easyll2{
    Node head;
    Node tail;
    public easyll2(){
        head = null;
        tail = null;
    }
    public void insert(int value){
        Node node = new Node(value);
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
        Node temp = head;
        if(head != null){
            do{
                System.out.print(temp.value+"->");
                temp = temp.next;
            }while(temp != head);
        }
        System.out.println("HEAD");
    }
    public void deletelast(Node head){
        if (head == null) {
        System.out.println("List is empty");
        return;
    }

    // Only one node
    if (head == tail) {
        head = null;
        tail = null;
        return;
    }

    Node temp = head;

    // Find the node before the tail
    while (temp.next != tail) {
        temp = temp.next;
    }

    // Update tail
    temp.next = head;
    tail = temp;
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
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    easyll2 list = new easyll2();

    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
        list.insert(sc.nextInt());
    }

    list.display();

    list.deletelast(list.head);

    System.out.println("After deleting last:");

    list.display();
}
}
*/



