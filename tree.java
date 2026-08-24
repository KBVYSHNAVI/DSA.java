//first runtime input tree program
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class tree{
        static Scanner sc = new Scanner(System.in);
        static Node createTree(){
            System.out.print("Enter node value");
            int value = sc.nextInt();
            Node root = new Node(value);
            return root;
        }
    public static void main(String[] args){
        Node root = createTree();
        System.out.println("Root = "+root.data);
    }
}*/

//creation of left and right children
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
       System.out.print("Enter root value: ");
       int value = sc.nextInt();
       Node root = new Node(value);
       System.out.println("Enter left child of "+value+":");
       int leftvalue = sc.nextInt();
       root.left = new Node(leftvalue);
       System.out.println("Enter the right child "+value+":");
       int rightvalue = sc.nextInt();
       root.right = new Node(rightvalue);
       return root;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Node root = createTree();
        System.out.println("Root: "+root.data);
        System.out.println("Left: "+root.left.data);
        System.out.println("Right: "+root.right.data);
    }
}*/

//creation of nodes with structures
/*import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class tree {

    static Scanner sc = new Scanner(System.in);

    static Node createTree() {

        System.out.print("Enter root value: ");
        int value = sc.nextInt();

        Node root = new Node(value);

        System.out.print("Enter left child of " + value + ": ");
        int leftvalue = sc.nextInt();
        root.left = new Node(leftvalue);

        System.out.print("Enter right child of " + value + ": ");
        int rightvalue = sc.nextInt();
        root.right = new Node(rightvalue);

        return root;
    }

    static void display(Node root) {

        System.out.println();
        System.out.println("Binary Tree:");
        System.out.println();

        System.out.println("       " + root.data);
        System.out.println("      / \\");
        System.out.println("     " + root.left.data + "   " + root.right.data);
    }

    public static void main(String[] args) {

        Node root = createTree();

        display(root);
    }
}*/

//tree runtime input using recursion
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter value:(-1 for no node):");
        int value = sc.nextInt();
        if(value == -1){
            return null;
        }
        Node root = new Node(value);
        System.out.println("Enter left child  of "+value);
        root.left = createTree();
        System.out.println("Enter right child of "+ value);
        root.right = createTree();
        return root;
    }
    static void display(Node root,int space){
        if(root == null) return;
        space = space+5;//increase disteance between levels
        display(root.right,space);//display right subtree first
        System.out.println();//print current node
        for(int i=5;i<space;i++){
            System.out.print(" ");
        }
        System.out.println(root.data);
        display(root.left,space);//display left subtree
    }
    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("Tree created successfully");
        display(root,0);
    }

}*/

//recursion on trees
//preorder -->root left right
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter value: ");
        int value = sc.nextInt();
        if(value == -1){
            return null;
        }
        Node root = new Node(value);
        System.out.println("Enter left child of "+value);
        root.left = createTree();
        System.out.println("Enter right child of "+value);
        root.right = createTree();

        return root;
    }
    static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    static void display(Node root,int space){
        if(root == null) return;
        space = space+5;
        display(root.right,space);
        System.out.println();
        for(int i=5;i<space;i++){
            System.out.print(" ");
        }
        System.out.print(root.data);
        display(root.left,space);
    }
    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("\nTree");
        display(root,0);
        System.out.println("\nPreorder: ");
        preorder(root);
    }
}*/

//inorder -->left root right
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter value: ");
        int value = sc.nextInt();
        if(value == -1) return null;
        Node root = new Node(value);
        System.out.println("Enter left child "+value);
        root.left = createTree();
        System.out.println("Enter right child of "+value);
        root.right = createTree();
        return root;
    }
    static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    static void display(Node root,int space){
        if(root == null)return;
        space = space+5;
        display(root.right,space);
        System.out.println();
        for(int i=5;i<space;i++){
            System.out.print(" ");
        }
        System.out.println(root.data);
        display(root.left,space);
    }
    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("\nTree");
        display(root,0);
        System.out.println("\n\nInorder...");
        inorder(root);
    }
}*/

//Postorder --> left,right,root
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter a value");
        int value = sc.nextInt();
        if(value == -1)return null;
        Node root = new Node(value);
        System.out.println("Enter left child : "+value);
        root.left = createTree();
        System.out.println("Enter right child : "+value);
        root.right = createTree();
        return root;
    }
    static void postorder(Node root){
        if(root == null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data+" ");
    }
     static void display(Node root,int space){
        if(root == null)return;
        space = space+5;
        display(root.right,space);
        System.out.println();
        for(int i=5;i<space;i++){
            System.out.print(" ");
        }
        System.out.println(root.data);
        display(root.left,space);
    }
    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("\nTree");
        display(root,0);
        System.out.println("Postorder");
        postorder(root);

    }
}*/

//levelorder
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter value");
        int value = sc.nextInt();
        if(value == -1)return null;
        Node root = new Node(value);
        System.out.println("Enter left child: "+value);
        root.left = createTree();
        System.out.println("Enter right child: "+value);
        root.right = createTree();
        return root;
    }
    static void levelorder(Node root){
        if(root == null) return;
        Queue<Node>queue = new LinkedList<>();
        queue.add(root);//add root to queue
        while(!queue.isEmpty()){
            //remove front node;
            Node current = queue.remove();
            //print current Node
            System.out.print(current.data+" ");
            //add left child
            if(current.left != null){
                queue.add(current.left);
            }
            //add right child
            if(current.right != null){
                queue.add(current.right);
            }
        }
    }
    public static void main(String[] args){
        Node root = createTree();
        System.out.print("\nLevel Order Traversal: ");
        levelorder(root);
    }
}*/

//count total nodes
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null; 
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter value ");
        int value = sc.nextInt();
        if(value == -1){
            return null;
        }
        Node root = new Node(value);
        System.out.println("Enter left child " + value );
        root.left = createTree();
        System.out.println("Enter right child of "+value);
        root.right = createTree();
        return root;
    }
    static int countNodes(Node root){
        if(root == null) return 0;
        return 1+countNodes(root.left) + countNodes(root.right);
    }
    static void display(Node root,int space){
        if(root == null)return;
        space = space+5;
        display(root.right,space);
        System.out.println();
        for(int i=5;i<space;i++){
            System.out.print(" ");
        }
        System.out.println(root.data);
        display(root.left,space);
    }
    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("\nTree");
        display(root,0);
        System.out.println("\nNumber of nodes: "+countNodes(root));
    }
}*/

//sum of all nodes
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null; 
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter value ");
        int value = sc.nextInt();
        if(value == -1){
            return null;
        }
        Node root = new Node(value);
        System.out.println("Enter left child " + value );
        root.left = createTree();
        System.out.println("Enter right child of "+value);
        root.right = createTree();
        return root;
    }
    static int sumnodes(Node root){
        if(root == null){
            return 0;
        }
        return root.data+sumnodes(root.left)+sumnodes(root.right);
    }
    static void display(Node root,int space){
        if(root == null)return;
        space = space+5;
        display(root.right,space);
        System.out.println();
        for(int i=5;i<space;i++){
            System.out.print(" ");
        }
        System.out.println(root.data);
        display(root.left,space);
    }
    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("\nTree");
        display(root,0);
        System.out.println("\nSum of nodes: "+sumnodes(root));
    }
}*/

//find maximum element
//sum of all nodes
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null; 
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter value ");
        int value = sc.nextInt();
        if(value == -1){
            return null;
        }
        Node root = new Node(value);
        System.out.println("Enter left child " + value );
        root.left = createTree();
        System.out.println("Enter right child of "+value);
        root.right = createTree();
        return root;
    }
    static int maxima(Node root){
        if(root == null) return Integer.MIN_VALUE;
        int leftmax = maxima(root.left);
        int rightmax = maxima(root.right);
        return Math.max(root.data,Math.max(leftmax,rightmax));
    }
    static void display(Node root,int space){
        if(root == null)return;
        space = space+5;
        display(root.right,space);
        System.out.println();
        for(int i=5;i<space;i++){
            System.out.print(" ");
        }
        System.out.print(root.data);
        display(root.left,space);
    }
    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("\nTree");
        display(root,0);
        System.out.println("\nMaximum element: "+maxima(root));
    }
}*/

//minimum element
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter a value");
        int value = sc.nextInt();
        if(value == -1){
            return null;
        }
        Node root = new Node(value);
        System.out.println("Enter left child of  "+value);
        root.left = createTree();
        System.out.println("Enter right child of "+value);
        root.right = createTree();
        return root;
    }
    static int minimum(Node root){
        if(root == null) return Integer.MAX_VALUE;
        int leftmin = minimum(root.left);
        int rightmin = minimum(root.right);
        return Math.min(root.data,Math.min(leftmin,rightmin));
    }
    public static void main(String[] args){
        Node root = createTree();
        System.out.println("Minimum element: "+minimum(root));

    }
}*/

//count leaf nodes
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter value");
        int value = sc.nextInt();
        if(value == -1){
            return null;
        }
        Node root = new Node(value);
        System.out.println("Enter left child of "+value);
        root.left = createTree();
        System.out.println("Enter right child of "+value);
        root.right = createTree();
        return root;
    }
    static void display(Node root){
        if(root == null)return;
        System.out.println(root.data);
        if(root.left != null){
            System.out.println(root.data+"->Left->"+root.left.data);
        }if(root.right!= null){
            System.out.println(root.data+"->Right->"+root.right.data);
        }
        display(root.left);
        display(root.right);
    }
    static int countleaf(Node root){
        if(root == null){
            return 0;
        }
        //if current node has no children
        if(root.left == null && root.right == null){
            return 1;
        }
        return countleaf(root.left)+countleaf(root.right);
    }
    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("Tree: ");
        display(root);
        System.out.println("Count of leaf nodes is: "+countleaf(root));
    }
}

*/

//count non leaf nodes
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter value");
        int value = sc.nextInt();
        if(value == -1){
            return null;
        }
        Node root = new Node(value);
        System.out.println("Enter left child of "+value);
        root.left = createTree();
        System.out.println("Enter right child of "+value);
        root.right = createTree();
        return root;
    }
    static void display(Node root){
        if(root == null)return;
        System.out.println(root.data);
        if(root.left != null){
            System.out.println(root.data+"->Left->"+root.left.data);
        }if(root.right!= null){
            System.out.println(root.data+"->Right->"+root.right.data);
        }
        display(root.left);
        display(root.right);
    }
    static int countnonleaf(Node root){
        if(root == null){
            return 0;
        }
        //if current node has no children
        if(root.left == null && root.right == null){
            return 0;
        }
        return 1+countnonleaf(root.left)+countnonleaf(root.right);
    }
    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("Tree: ");
        display(root);
        System.out.println("Count of  non leaf nodes is: "+countnonleaf(root));
    }
}*/

//height of a tree
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter value");
        int value = sc.nextInt();
        if(value == -1){
            return null;
        }
        Node root = new Node(value);
        System.out.println("Enter left child of "+value);
        root.left = createTree();
        System.out.println("Enter right child of "+value);
        root.right = createTree();
        return root;
    }
    static void display(Node root){
        if(root == null)return;
        System.out.println(root.data);
        if(root.left != null){
            System.out.println(root.data+"->Left->"+root.left.data);
        }if(root.right!= null){
            System.out.println(root.data+"->Right->"+root.right.data);
        }
        display(root.left);
        display(root.right);
    }
    static int height(Node root){
        if(root == null){
            return -1;
        }
        int leftheigh = height(root.left);
        int rightheigh = height(root.right);
        return 1+Math.max(leftheigh,rightheigh);
    }
    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("Tree: ");
        display(root);
        System.out.println("Height of the binary tree is.....: "+height(root));
    }
}
*/


//depth of a tree
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter value");
        int value = sc.nextInt();
        if(value == -1){
            return null;
        }
        Node root = new Node(value);
        System.out.println("Enter left child of "+value);
        root.left = createTree();
        System.out.println("Enter right child of "+value);
        root.right = createTree();
        return root;
    }
    static void display(Node root){
        if(root == null)return;
        System.out.println(root.data);
        if(root.left != null){
            System.out.println(root.data+"->Left->"+root.left.data);
        }if(root.right!= null){
            System.out.println(root.data+"->Right->"+root.right.data);
        }
        display(root.left);
        display(root.right);
    }
    static int depth(Node root){
        if(root == null) return 0;
        int leftdeep = depth(root.left);
        int rightdeep = depth(root.right);
        return 1+Math.max(leftdeep,rightdeep);
    }
    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("Tree: ");
        display(root);
        System.out.println("Depth of Binary tree is....: "+depth(root));
    }
}*/

//searching for an leemnet
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter value: ");
        int value = sc.nextInt();
        if(value == -1 ) return null;
        Node root = new Node(value);
        System.out.println("Enter left child of "+value);
        root.left = createTree();
        System.out.println("Enter right child of "+value);
        root.right = createTree();
        return root;
    }
    static void display(Node root){
        if(root == null ) return;
        System.out.println(root.data);
        if(root.left != null){
            System.out.println(root.data+"->Left->"+root.left.data);
        }
        if(root.right != null){
            System.out.println(root.data+"->Right->"+root.right.data);
        }
        display(root.left);
        display(root.right);
    }
    static boolean  searching(Node root,int key){
        if(root == null)return false;
        //element found
        if(root.data == key)return true;
        //search in left suntree
        boolean left = searching(root.left,key);
        if(left){
            return true;
        }
        return searching(root.right,key);
    }
    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("Tree");
        display(root);
        System.out.println("Enter key to search");
        int key = sc.nextInt();
        if(searching(root,key)){
            System.out.println("Element found");
        }else{
            System.out.println("Element is not found");
        }
    }
}
*/

//count nodes with even values
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter value: ");
        int value = sc.nextInt();
        if(value == -1 ) return null;
        Node root = new Node(value);
        System.out.println("Enter left child of "+value);
        root.left = createTree();
        System.out.println("Enter right child of "+value);
        root.right = createTree();
        return root;
    }
    static void display(Node root){
        if(root == null ) return;
        System.out.println(root.data);
        if(root.left != null){
            System.out.println(root.data+"->Left->"+root.left.data);
        }
        if(root.right != null){
            System.out.println(root.data+"->Right->"+root.right.data);
        }
        display(root.left);
        display(root.right);
    }
    static int counteven(Node root){
        if(root == null) return 0;
        int count = 0;
        if(root.data % 2==0){
            count = 1;
        }
        return count+counteven(root.left)+counteven(root.right);
        
    }
    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("Tree");
        display(root);
        System.out.println("Even nodes in a binary tree is "+counteven(root));
    }
}*/

//count nodes with odd values
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter value: ");
        int value = sc.nextInt();
        if(value == -1 ) return null;
        Node root = new Node(value);
        System.out.println("Enter left child of "+value);
        root.left = createTree();
        System.out.println("Enter right child of "+value);
        root.right = createTree();
        return root;
    }
    static void display(Node root){
        if(root == null ) return;
        System.out.println(root.data);
        if(root.left != null){
            System.out.println(root.data+"->Left->"+root.left.data);
        }
        if(root.right != null){
            System.out.println(root.data+"->Right->"+root.right.data);
        }
        display(root.left);
        display(root.right);
    }
    static int countodd(Node root){
        if(root == null) return 0;
        int count = 0;
        if(root.data % 2!=0){
            count = 1;
        }
        return count+countodd(root.left)+countodd(root.right);
        
    }
    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("Tree");
        display(root);
        System.out.println("Even nodes in a binary tree is "+countodd(root));
    }
}
*/

//sum of leaf nodes
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter value: ");
        int value = sc.nextInt();
        if(value == -1 ) return null;
        Node root = new Node(value);
        System.out.println("Enter left child of "+value);
        root.left = createTree();
        System.out.println("Enter right child of "+value);
        root.right = createTree();
        return root;
    }
    static void display(Node root){
        if(root == null ) return;
        System.out.println(root.data);
        if(root.left != null){
            System.out.println(root.data+"->Left->"+root.left.data);
        }
        if(root.right != null){
            System.out.println(root.data+"->Right->"+root.right.data);
        }
        display(root.left);
        display(root.right);
    }
    static int sumleaf(Node root){
        if(root == null)return 0;
        if(root.left == null && root.right == null){
            return root.data;
        }
        return sumleaf(root.left)+sumleaf(root.right);
    }
    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("Tree");
        display(root);
        System.out.println("Sum of leaf nodes "+sumleaf(root));
    }
}
*/

//print all leaf nodes
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter value: ");
        int value = sc.nextInt();
        if(value == -1 ) return null;
        Node root = new Node(value);
        System.out.println("Enter left child of "+value);
        root.left = createTree();
        System.out.println("Enter right child of "+value);
        root.right = createTree();
        return root;
    }
    static void display(Node root){
        if(root == null ) return;
        System.out.println(root.data);
        if(root.left != null){
            System.out.println(root.data+"->Left->"+root.left.data);
        }
        if(root.right != null){
            System.out.println(root.data+"->Right->"+root.right.data);
        }
        display(root.left);
        display(root.right);
    }
    static void printleaf(Node root){
        if(root == null)return ;
        if(root.left == null && root.right == null){
            System.out.println( root.data);
            return;
        }
        printleaf(root.left);
        printleaf(root.right);
        
    }
    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("Tree");
        display(root);
        System.out.println("Leaf nodes: ");
        printleaf(root);
    }
}

*/

//both printing and counting leaf nodes
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter value: ");
        int value = sc.nextInt();
        if(value == -1 ) return null;
        Node root = new Node(value);
        System.out.println("Enter left child of "+value);
        root.left = createTree();
        System.out.println("Enter right child of "+value);
        root.right = createTree();
        return root;
    }
    static void display(Node root){
        if(root == null ) return;
        System.out.println(root.data);
        if(root.left != null){
            System.out.println(root.data+"->Left->"+root.left.data);
        }
        if(root.right != null){
            System.out.println(root.data+"->Right->"+root.right.data);
        }
        display(root.left);
        display(root.right);
    }
    static int countAndPrintLeafNodes(Node root) {

    if (root == null) {
        return 0;
    }

    // Leaf node
    if (root.left == null && root.right == null) {
        System.out.println(root.data);
        return 1;
    }

    return countAndPrintLeafNodes(root.left)
         + countAndPrintLeafNodes(root.right);
}
    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("Tree");
        display(root);
        System.out.println("Leaf nodes:");
        int count = countAndPrintLeafNodes(root);
        System.out.println("Number of leaf nodes = " + count);
    }
}
*/

//sum of leaft leaves
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter value: ");
        int value = sc.nextInt();
        if(value == -1 ) return null;
        Node root = new Node(value);
        System.out.println("Enter left child of "+value);
        root.left = createTree();
        System.out.println("Enter right child of "+value);
        root.right = createTree();
        return root;
    }
    static void display(Node root){
        if(root == null ) return;
        System.out.println(root.data);
        if(root.left != null){
            System.out.println(root.data+"->Left->"+root.left.data);
        }
        if(root.right != null){
            System.out.println(root.data+"->Right->"+root.right.data);
        }
        display(root.left);
        display(root.right);
    }
    static int  sumleftleaf(Node root){
        if(root == null)return 0;
        int sum = 0;
        //checking whether left side is a leaf or not 
        if(root.left !=null && root.left.left == null && root.left.right == null){
            sum+=root.left.data;
        }
        sum += sumleftleaf(root.left);
        sum += sumleftleaf(root.right);
        return sum;
        
    }
    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("Tree");
        display(root);
        System.out.println("Sum of leaft leaf nodes: "+sumleftleaf(root));
    }
}*/

//print all nodes at agiven level
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter value: ");
        int value = sc.nextInt();
        if(value == -1 ) return null;
        Node root = new Node(value);
        System.out.println("Enter left child of "+value);
        root.left = createTree();
        System.out.println("Enter right child of "+value);
        root.right = createTree();
        return root;
    }
    static void display(Node root){
        if(root == null ) return;
        System.out.println(root.data);
        if(root.left != null){
            System.out.println(root.data+"->Left->"+root.left.data);
        }
        if(root.right != null){
            System.out.println(root.data+"->Right->"+root.right.data);
        }
        display(root.left);
        display(root.right);
    }
    static void printNodesAtLevel(Node root, int level) {

    if (root == null) {
        return;
    }

    // We reached the required level
    if (level == 0) {
        System.out.print(root.data + " ");
        return;
    }

    printNodesAtLevel(root.left, level - 1);
    printNodesAtLevel(root.right, level - 1);
}
    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("Tree");
        display(root);
        int level = sc.nextInt();
        System.out.println("Nodes at level "+level+": ");
        printNodesAtLevel(root,level);
    }
}
*/


//number of nodes ata given level(count)
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter value: ");
        int value = sc.nextInt();
        if(value == -1 ) return null;
        Node root = new Node(value);
        System.out.println("Enter left child of "+value);
        root.left = createTree();
        System.out.println("Enter right child of "+value);
        root.right = createTree();
        return root;
    }
    static void display(Node root){
        if(root == null ) return;
        System.out.println(root.data);
        if(root.left != null){
            System.out.println(root.data+"->Left->"+root.left.data);
        }
        if(root.right != null){
            System.out.println(root.data+"->Right->"+root.right.data);
        }
        display(root.left);
        display(root.right);
    }
    static int countNodesatlevel(Node root,int level){
        if(root == null)return 0;
        //reached the required level
        if(level ==0){
            return 1;
        }
        return countNodesatlevel(root.left,level-1)
               +countNodesatlevel(root.right,level - 1);
    }
    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("Tree");
        display(root);
        int level = sc.nextInt();
        System.out.println("Count of Nodes at level "+level+": ");
        System.out.println(countNodesatlevel(root,level));
    }
}
*/

//Diameter of a binary tree
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter value: ");
        int value = sc.nextInt();
        if(value == -1 ) return null;
        Node root = new Node(value);
        System.out.println("Enter left child of "+value);
        root.left = createTree();
        System.out.println("Enter right child of "+value);
        root.right = createTree();
        return root;
    }
    static void display(Node root){
        if(root == null ) return;
        System.out.println(root.data);
        if(root.left != null){
            System.out.println(root.data+"->Left->"+root.left.data);
        }
        if(root.right != null){
            System.out.println(root.data+"->Right->"+root.right.data);
        }
        display(root.left);
        display(root.right);
    }
    static int height(Node root){
        if(root == null){
            return -1;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
    static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftheigh = height(root.left);
        int rightheigh = height(root.right);
        //diameter passing through curr node
        int currdia = leftheigh + rightheigh +2;
        int leftdia = diameter(root.left);
        int rightdia = diameter(root.right);
        return Math.max(currdia,Math.max(leftdia,rightdia));
    }
    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("Tree");
        display(root);
        System.out.println("Diameter of a node");
        System.out.println(diameter(root));
    }
}
*/

//print longest path tooo
/*import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class tree {

    static Scanner sc = new Scanner(System.in);

    // Variables to store diameter and longest path
    static int diameter = 0;
    static List<Integer> diameterPath = new ArrayList<>();

    // Create binary tree
    static Node createTree() {

        System.out.print("Enter value (-1 for no node): ");
        int value = sc.nextInt();

        if (value == -1) {
            return null;
        }

        Node root = new Node(value);

        System.out.println("Enter left child of " + value);
        root.left = createTree();

        System.out.println("Enter right child of " + value);
        root.right = createTree();

        return root;
    }

    // Display tree
    static void display(Node root) {

        if (root == null) {
            return;
        }

        System.out.println(root.data);

        if (root.left != null) {
            System.out.println(root.data + " -> Left -> " + root.left.data);
        }

        if (root.right != null) {
            System.out.println(root.data + " -> Right -> " + root.right.data);
        }

        display(root.left);
        display(root.right);
    }

    // Find longest path from current node to a leaf
    static List<Integer> findPath(Node root) {

        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> leftPath = findPath(root.left);
        List<Integer> rightPath = findPath(root.right);

        // Find the longer path
        List<Integer> currentPath = new ArrayList<>();

        currentPath.add(root.data);

        if (leftPath.size() > rightPath.size()) {
            currentPath.addAll(leftPath);
        } else {
            currentPath.addAll(rightPath);
        }

        // Create path passing through current node
        List<Integer> fullPath = new ArrayList<>();

        // Left path in reverse order
        for (int i = leftPath.size() - 1; i >= 0; i--) {
            fullPath.add(leftPath.get(i));
        }

        // Current node
        fullPath.add(root.data);

        // Right path
        for (int value : rightPath) {
            fullPath.add(value);
        }

        // Calculate diameter in edges
        int currentDiameter = fullPath.size() - 1;

        // Update maximum diameter
        if (currentDiameter > diameter) {
            diameter = currentDiameter;
            diameterPath = fullPath;
        }

        return currentPath;
    }

    public static void main(String[] args) {

        System.out.println("Create Binary Tree");

        Node root = createTree();

        System.out.println("\nTree:");
        display(root);

        // Find diameter and path
        findPath(root);

        System.out.println("\nDiameter = " + diameter);

        System.out.print("Longest Path = ");

        for (int i = 0; i < diameterPath.size(); i++) {

            System.out.print(diameterPath.get(i));

            if (i < diameterPath.size() - 1) {
                System.out.print(" -> ");
            }
        }

        System.out.println();
    }
}
    */

//identical trees
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter value: ");
        int value = sc.nextInt();
        if(value == -1 ) return null;
        Node root = new Node(value);
        System.out.println("Enter left child of "+value);
        root.left = createTree();
        System.out.println("Enter right child of "+value);
        root.right = createTree();
        return root;
    }
    static void display(Node root){
        if(root == null ) return;
        System.out.println(root.data);
        if(root.left != null){
            System.out.println(root.data+"->Left->"+root.left.data);
        }
        if(root.right != null){
            System.out.println(root.data+"->Right->"+root.right.data);
        }
        display(root.left);
        display(root.right);
    }
    static boolean identical(Node root1,Node root2){
        //both trees are empty
        if(root1 == null && root2 == null){
            return true;
        }
        //one is empty and other is not
        if(root1 == null || root2 == null){
            return false;
        }
        //values are different
        if(root1.data != root2.data){
            return false;
        }
        return identical(root1.left,root2.left) && identical(root1.right,root2.right);
    }
    public static void main(String[] args) {
        System.out.println("Create First Binary tree");
        Node root1 = createTree();
        System.out.println("First tree: ");
        display(root1);
        System.out.println("Create second binary tree: ");
        Node root2 = createTree();
        System.out.println("Second tree: ");
        display(root2);
        if(identical(root1,root2)){
            System.out.println("Both trees are identical");
        }else{
            System.out.println("Both trees are not identical");
        }

    }
}*/

//balanced tree
/*mport java.nio.channels.AsynchronousByteChannel;
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter a value");
        int value = sc.nextInt();
        if(value == -1) return null;
        Node root = new Node(value);
        System.out.println("Enter left child"+value);
        root.left = createTree();
        System.out.println("Enter right child"+value);
        root.right = createTree();
        return root;

    }
    static int height(Node root){
        if(root == null)return 0;
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        return 1+Math.max(leftheight,rightheight); 
    }
    static boolean isbalanced(Node root){
        if(root==null)return true;

        int leftheight = height(root.left);
        int rightheight = height(root.right);
        System.out.println("----------------------");
        System.out.println("Node : "+root.data);
        System.out.println("Left Height: "+leftheight);
        System.out.println("Right Height: "+rightheight);
        System.out.println("---------------------");
        if(Math.abs(leftheight - rightheight)>1){
            return false;
        }
        return isbalanced(root.left) && isbalanced(root.right);

    }
    static void display(Node root){
        if(root == null)return;
        System.out.println(root.data);
        if(root.left != null){
            System.out.println(root.data+"->Left->"+root.left.data);
            return;
        }
        if(root.right != null){
            System.out.println(root.data+"->right->"+root.right.data);
            return;
        }
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("Tree: ");
        display(root);
        if(isbalanced(root)){
            System.out.println("Balanced root");
        }else{
            System.out.println("Not a balanced treee");
        }
    }
}


*/

//mirror of a binary tree
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter a value");
        int value = sc.nextInt();
        if(value == -1)return null;
        Node root = new Node(value);
        System.out.println("Enter left child"+value);
        root.left = createTree();
        System.out.println("eneter right child"+value);
        root.right = createTree();
        return root;
    }
    static Node mirror(Node root){
        if(root == null)return null;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
        return root;
    }
    public void display(Node root){
        if(root == null )return;
        System.out.println(root.data);
        if(root.left != null){
            System.out.println(root.data+"->Left->"+root.left.data);
        }
        if(root.right != null){
            System.out.println(root.data+"->Right->"+root.right.data);
        }
        display(root.left);
        display(root.right);
    }
    public  void main(String[] args) {
        Node root = createTree();
        System.out.println("Original treee");
        display(root);
        mirror(root);
        System.out.println("Mirror Tree");
        display(root);

    }
}*/


//left view
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter a value: ");
        int value = sc.nextInt();
        if(value==-1)return null;
        Node root = new Node(value);
        System.out.println("Enter left child: "+value);
        root.left = createTree();
        System.out.println("Enter right child "+value);
        root.right = createTree();
        return root;
    }
    static void leftview(Node root){
        if(root == null)return;
        Queue<Node>q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Node current = q.poll();
                if(i==0){
                    System.out.println(current.data);
                }
                if(current.left != null){
                    q.add(current.left);
                }
                if(current.right != null){
                    q.add(current.right);
                }
            }
        }
    }
    static void display(Node root){
        if(root == null)return;
        System.out.println(root.data);
        if(root.left != null){
            System.out.println(root.data+"->Left->"+root.left.data);
        }
        if(root.right != null){
            System.out.println(root.data+"->Right->"+root.right.data);
        }
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("Tree: ");
        display(root);
        System.out.println("Left View");
        leftview(root);
    }
}*/

//right view
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter value: ");
        int value = sc.nextInt();
        if(value == -1)return null;
        Node root = new Node(value);
        System.out.println("Enter left child");
        root.left = createTree();
        System.out.println("Enter right child");
        root.right = createTree();
        return root;
    }
    static void rightview(Node root){
        if(root == null) return;
        Queue<Node>q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Node current = q.poll();
                if(i==size-1){
                    System.out.println(current.data+" ");
                }
                if(current.left != null){
                    q.add(current.left);
                }
                if(current.right != null){
                    q.add(current.right);
                }
            }
        }
    }
    static void display(Node root){
        if(root == null)return;
        System.out.println(root.data);
        if(root.left != null){
            System.out.println(root.data+"->Left->"+root.left.data);
        }
        if(root.right != null){
            System.out.println(root.data+"->Right->"+root.right.data);
        }
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("Tree: ");
        display(root);
        System.out.println("Right View: ");
        rightview(root);
    }
}*/


//top view
/*import java.util.*;

class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class tree {

    static Scanner sc = new Scanner(System.in);

    // Create Binary Tree
    static Node createTree() {

        System.out.println("Enter a value:");
        int value = sc.nextInt();

        // -1 means no node
        if (value == -1)
            return null;

        Node root = new Node(value);

        System.out.println("Enter left child of " + value);
        root.left = createTree();

        System.out.println("Enter right child of " + value);
        root.right = createTree();

        return root;
    }

    // Pair class: stores Node + Horizontal Distance
    static class Pair {

        Node node;
        int hd;

        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    // Display Tree
    static void display(Node root) {

        if (root == null)
            return;

        System.out.println(root.data);

        if (root.left != null) {
            System.out.println(
                root.data + " -> Left -> " + root.left.data
            );
        }

        if (root.right != null) {
            System.out.println(
                root.data + " -> Right -> " + root.right.data
            );
        }

        display(root.left);
        display(root.right);
    }

    // Top View
    static void topView(Node root) {

        if (root == null)
            return;

        // Queue stores Node + Horizontal Distance
        Queue<Pair> q = new LinkedList<>();

        // TreeMap stores HD -> Node data
        // TreeMap automatically sorts HD
        TreeMap<Integer, Integer> map = new TreeMap<>();

        // Root has horizontal distance 0
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {

            Pair p = q.poll();

            Node current = p.node;
            int hd = p.hd;

            // Store only the first node at this HD
            if (!map.containsKey(hd)) {
                map.put(hd, current.data);
            }

            // Left child -> HD - 1
            if (current.left != null) {
                q.add(new Pair(current.left, hd - 1));
            }

            // Right child -> HD + 1
            if (current.right != null) {
                q.add(new Pair(current.right, hd + 1));
            }
        }

        // Print Top View
        System.out.println("Top View:");

        for (int value : map.values()) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {

        Node root = createTree();

        System.out.println("\nOriginal Tree:");
        display(root);

        System.out.println();

        topView(root);

        sc.close();
    }
}*/


//bottom view
/*import java.util.*;

class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class tree {

    static Scanner sc = new Scanner(System.in);

    // Create Binary Tree
    static Node createTree() {

        System.out.println("Enter a value:");
        int value = sc.nextInt();

        // -1 means no node
        if (value == -1)
            return null;

        Node root = new Node(value);

        System.out.println("Enter left child of " + value);
        root.left = createTree();

        System.out.println("Enter right child of " + value);
        root.right = createTree();

        return root;
    }

    // Pair class
    // Stores Node + Horizontal Distance
    static class Pair {

        Node node;
        int hd;

        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    // Display Tree
    static void display(Node root) {

        if (root == null)
            return;

        System.out.println(root.data);

        if (root.left != null) {
            System.out.println(
                root.data + " -> Left -> " + root.left.data
            );
        }

        if (root.right != null) {
            System.out.println(
                root.data + " -> Right -> " + root.right.data
            );
        }

        display(root.left);
        display(root.right);
    }

    // Bottom View
    static void bottomView(Node root) {

        if (root == null)
            return;

        Queue<Pair> q = new LinkedList<>();

        TreeMap<Integer, Integer> map = new TreeMap<>();

        // Root has HD = 0
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {

            Pair p = q.poll();

            Node current = p.node;
            int hd = p.hd;

            // For Bottom View,
            // always replace the previous node
            map.put(hd, current.data);

            // Left child -> HD - 1
            if (current.left != null) {
                q.add(new Pair(current.left, hd - 1));
            }

            // Right child -> HD + 1
            if (current.right != null) {
                q.add(new Pair(current.right, hd + 1));
            }
        }

        System.out.println("Bottom View:");

        for (int value : map.values()) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {

        Node root = createTree();

        System.out.println("\nOriginal Tree:");
        display(root);

        System.out.println();

        bottomView(root);

        sc.close();
    }
} */

//lowest common ancestor
/*import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter a value");
        int value = sc.nextInt();
        if(value == -1)return null;
        Node root = new Node(value);
        System.out.println("Enter left child");
        root.left = createTree();
        System.out.println("Enter right child");
        root.right = createTree();
        return root;
    }
    static Node lca(Node root,int p,int q){
        if(root==null){
            return null;
        }
        if(root.data == p || root.data ==q){
            return root;

        }
        Node left = lca(root.left,p,q);
        Node right = lca(root.right,p,q);
        if(left != null && right != null){
            return root;
        }
        if(left != null){
            return left;
        }
        return right;
    }
    static void display(Node root){
        if(root == null)return;
        System.out.println(root.data);
        if(root.left != null){
            System.out.println(root.data+"->Left->"+root.left.data);
        }
        if(root.right != null){
            System.out.println(root.right+"->Right->"+root.right.data);
        }
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("Tree: ");
        display(root);
        System.out.println("Enter first node::::");
        int p = sc.nextInt();
        System.out.println("Enter second node::::");
        int q = sc.nextInt();
        Node result = lca(root,p,q);
        if(result != null){
            System.out.println("LCA of"+p+"and"+q+"="+result.data);
        }else{
            System.out.println("LCA not found");
        }
    }
}*/

//PATH SUM
/*import java.util.*;

class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class tree {

    static Scanner sc = new Scanner(System.in);

    // Create Binary Tree
    static Node createTree() {

        System.out.println("Enter a value:");
        int value = sc.nextInt();

        // -1 means no node
        if(value == -1)
            return null;

        Node root = new Node(value);

        System.out.println("Enter left child of " + value);
        root.left = createTree();

        System.out.println("Enter right child of " + value);
        root.right = createTree();

        return root;
    }

    // Display Tree
    static void display(Node root) {

        if(root == null)
            return;

        System.out.println(root.data);

        if(root.left != null) {
            System.out.println(
                root.data + " -> Left -> " + root.left.data
            );
        }

        if(root.right != null) {
            System.out.println(
                root.data + " -> Right -> " + root.right.data
            );
        }

        display(root.left);
        display(root.right);
    }

    // Check Path Sum
    static boolean hasPathSum(Node root, int targetSum) {

        // Tree is empty
        if(root == null)
            return false;

        // Subtract current node value
        targetSum = targetSum - root.data;

        // Check if current node is leaf
        if(root.left == null && root.right == null) {

            return targetSum == 0;
        }

        // Search left or right subtree
        return hasPathSum(root.left, targetSum) ||
               hasPathSum(root.right, targetSum);
    }

    public static void main(String[] args) {

        Node root = createTree();

        System.out.println("\nOriginal Tree:");
        display(root);

        System.out.println("\nEnter target sum:");
        int targetSum = sc.nextInt();

        if(hasPathSum(root, targetSum)) {

            System.out.println(
                "Path Sum exists"
            );

        } else {

            System.out.println(
                "Path Sum does not exist"
            );
        }

        sc.close();
    }
} */


//path sum
/*import java.util.*;

class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class tree {

    static Scanner sc = new Scanner(System.in);

    // Create Binary Tree
    static Node createTree() {

        System.out.println("Enter a value:");
        int value = sc.nextInt();

        // -1 means no node
        if(value == -1)
            return null;

        Node root = new Node(value);

        System.out.println("Enter left child of " + value);
        root.left = createTree();

        System.out.println("Enter right child of " + value);
        root.right = createTree();

        return root;
    }

    // Display Tree
    static void display(Node root) {

        if(root == null)
            return;

        System.out.println(root.data);

        if(root.left != null) {
            System.out.println(
                root.data + " -> Left -> " + root.left.data
            );
        }

        if(root.right != null) {
            System.out.println(
                root.data + " -> Right -> " + root.right.data
            );
        }

        display(root.left);
        display(root.right);
    }

    // Check Path Sum
    static boolean hasPathSum(Node root, int targetSum) {

        // Tree is empty
        if(root == null)
            return false;

        // Subtract current node value
        targetSum = targetSum - root.data;

        // Check if current node is leaf
        if(root.left == null && root.right == null) {

            return targetSum == 0;
        }

        // Search left or right subtree
        return hasPathSum(root.left, targetSum) ||
               hasPathSum(root.right, targetSum);
    }

    public static void main(String[] args) {

        Node root = createTree();

        System.out.println("\nOriginal Tree:");
        display(root);

        System.out.println("\nEnter target sum:");
        int targetSum = sc.nextInt();

        if(hasPathSum(root, targetSum)) {

            System.out.println(
                "Path Sum exists"
            );

        } else {

            System.out.println(
                "Path Sum does not exist"
            );
        }

        sc.close();
    }
}*/

