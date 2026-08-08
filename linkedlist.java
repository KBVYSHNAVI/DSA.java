import java.util.*;
class ll{
    private Node head;
    private Node tail;
    private int size;
    public ll(){
        this.size = 0;
    }
    public void insertfirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail==null){
            tail = head;
        }
        size+=1;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
            System.out.print("END");

    }
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
}
public class linkedlist{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ll list = new ll();
        for (int i = 0; i < 9; i++) {
            int n = sc.nextInt();
            list.insertfirst(n);
        }
        list.display();
    }
}