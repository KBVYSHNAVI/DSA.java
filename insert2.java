import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Insert at end
    void insertLast(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = node;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
    }

    // Recursive insert
    Node insert(Node node, int value, int index) {

        if (index == 0) {
            Node temp = new Node(value);
            temp.next = node;
            return temp;
        }

        node.next = insert(node.next, value, index - 1);
        return node;
    }

    void insertRec(int value, int index) {
        head = insert(head, value, index);
    }

    // Display
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }
}

public class insert2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList list = new LinkedList();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            list.insertLast(sc.nextInt());
        }

        System.out.print("Enter value to insert: ");
        int value = sc.nextInt();

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        list.insertRec(value, index);

        System.out.println("Linked List after insertion:");
        list.display();

        sc.close();
    }
}