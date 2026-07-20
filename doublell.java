import java.util.*;
 class Node{
    int val;
    Node next;
    Node prev;
    public Node(int val){
        this.val = val;
    }
    public Node(int val,Node next,Node prev){
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}
class DLL{
    Node head;
    public void insertfirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
    }
    public void display(){
        Node node = head;
        Node last = null;
        while(node!=null){
            System.out.print(node.val+"->");
            last = node;
            node = node.next;
        }
        System.out.println("END");
        System.out.println("print in reverse");
        while(last!=null){
            System.out.print(last.val+"->");
            last = last.prev;
        }
        System.out.print("START");

    }
   
}
public class doublell{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DLL list = new DLL();
        list.insertfirst(1);
        list.insertfirst(3);
        list.insertfirst(14);
        list.insertfirst(18);
        list.insertfirst(20);
        list.display();


    }
}