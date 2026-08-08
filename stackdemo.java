//basic stack program
/*import java.util.*;
public class stackdemo{
    static int top = -1;
    public static void push(int[] stack,int size,int value){
        if(top == size -1){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stack[top] = value;
        System.out.println(value+" pushed into the stack");
    }
    public static void pop(int[] stack){
        if(top == -1){
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(stack[top] +" popped from stack");
        top--;
    }
    public static void display(int[] stack){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        for(int i= top;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack size");
        int n = sc.nextInt();
        int[] stack = new int[n];
        while(true){
            System.out.println("\n1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("Enter choice");

            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter value:");
                    int value = sc.nextInt();
                    push(stack,n,value);
                    break;
                case 2:
                    pop(stack);
                    break;
                case 3:
                    display(stack);
                    break;
                case 4:
                    System.out.println("Program has ended");
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
    
}
 */


//celebrity code
/*import java.util.Scanner;

public class stackdemo {
    public static int findCelebrity(int[][] mat, int n) {

        for (int i = 0; i < n; i++) {

            boolean rowCheck = true;
            boolean colCheck = true;

            // Check row
            for (int j = 0; j < n; j++) {
                if (i != j && mat[i][j] == 1) {
                    rowCheck = false;
                    break;
                }
            }

            // Check column
            for (int j = 0; j < n; j++) {
                if (i != j && mat[j][i] == 0) {
                    colCheck = false;
                    break;
                }
            }

            if (rowCheck && colCheck) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        System.out.println("Enter the matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int ans = findCelebrity(mat, n);

        if (ans == -1)
            System.out.println("No Celebrity");
        else
            System.out.println("Celebrity is Person " + ans);

        sc.close();
    }
}*/

// Implementation of queue by using the stacks
/*import java.util.*;
public class stackdemo{
    static class myQueue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        public static void enqueue(int x){
            s1.push(x);
        }
        public static int dequeue(){
            if(s1.isEmpty() && s2.isEmpty()){
                return -1;
            }
            if(s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            return s2.pop();
        }
        public static int peek(){
            if(s1.isEmpty() && s2.isEmpty()){
                return -1;
            }
            if(s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            return s2.peek();
        }
        public static boolean isEmpty(){
            return s1.isEmpty() && s2.isEmpty();
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                String operation = sc.next();
                switch(operation){
                    case "enqueue":
                        int value = sc.nextInt();
                        enqueue(value);
                        break;
                    case "dequeue":
                        System.out.println(dequeue());
                        break;
                    case "peek":
                        System.out.println(peek());
                        break;
                    case "isEmpty":
                        System.out.println(isEmpty());
                        break;
                    default:System.out.println("Invalid operation");
                }
            }
            sc.close();
        }
    }
} */

//Implementing 2 stacks in a array
/*import java.util.*;
public class stackdemo{
    static int[] arr;
    static int top1,top2,n;
    public static void intialize(int size){
        n = size;
        arr = new int[n];
        top1 = -1;
        top2 = n;
    }
    public static void push1(int x){
        if(top1<top2-1){
            arr[++top1] = x;
        }else{
            System.out.println("Stack Overflow");
        }
    }
    public static void push2(int x){
        if(top1<top2 -1){
            arr[--top2] = x;
        }else{
            System.out.println("Stack Overflow");
        }
    }
    static int pop1(){
        if(top1>=0){
            return arr[top1--];
        }
        return -1;
    }
    static int pop2(){
        if(top2<n){
            return arr[top2++];
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        intialize(size);
        int operations = sc.nextInt();
        for(int i=0;i<operations;i++){
            String operation = sc.next();
            switch(operation){
                case "push1":
                    int x1 = sc.nextInt();
                    push1(x1);
                    break;
                case "push2":
                    int x2 = sc.nextInt();
                    push2(x2);
                    break;
                case "pop1":
                    System.out.println(pop1());
                    break;
                case "pop2":
                    System.out.println(pop2());
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        }
    }
}
*/
//Implementing stacks using queue
/*import java.util.*;

class MyStack {

    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    // Push element
    public void push(int x) {
        q.offer(x);

        int size = q.size();

        // Rotate the queue
        for (int i = 0; i < size - 1; i++) {
            q.offer(q.poll());
        }
    }

    // Pop element
    public int pop() {
        if (q.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return q.poll();
    }

    // Top element
    public int top() {
        if (q.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return q.peek();
    }

    // Check empty
    public boolean empty() {
        return q.isEmpty();
    }

    // Display stack
    public void display() {
        if (q.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.print("Stack (Top -> Bottom): ");
        for (int x : q) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

public class stackdemo{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MyStack stack = new MyStack();

        while (true) {

            System.out.println("\n===== STACK MENU =====");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top");
            System.out.println("4. Display");
            System.out.println("5. Check Empty");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter element to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    System.out.println(value + " pushed into stack.");
                    break;

                case 2:
                    int removed = stack.pop();
                    if (removed != -1)
                        System.out.println("Popped Element: " + removed);
                    break;

                case 3:
                    int top = stack.top();
                    if (top != -1)
                        System.out.println("Top Element: " + top);
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    if (stack.empty())
                        System.out.println("Stack is Empty");
                    else
                        System.out.println("Stack is Not Empty");
                    break;

                case 6:
                    System.out.println("Program Ended.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}*/

//infix to postfix
/*import java.util.*;
public class stackdemo{
    static int precedence(char ch){
        if(ch=='^') return 3;
        if(ch=='*' ||ch=='/') return 2;
        if(ch =='+'||ch=='-')return 1;
        return -1;
    }
    static String infixtopostfix(String exp){
        Stack<Character>stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                result.append(ch);
            }
            else if(ch=='('){
                stack.push(ch);
            }
            else if(ch==')'){
                while(!stack.isEmpty() && stack.peek() !='('){
                    result.append(stack.pop());
                }
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                while(!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)){
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        System.out.println(infixtopostfix(exp));
    }
}*/

//prefix to infix
/*import java.util.*;
class stackdemo{
    static boolean isOperator(char x){
        switch(x){
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '%':
             return true;
        }
        return false;
    }
    public static String convert(String str){
        Stack<String>stack = new Stack<>();
        int l = str.length();
        for(int i=l-1;i>=0;i--){
            char c = str.charAt(i);
            if(isOperator(c)){
                String op1 = stack.pop();
                String op2 = stack.pop();
                String temp = "("+op1+c+op2+")";
                stack.push(temp);
            }else{
                stack.push(c+"");
            }
        }
        return stack.pop();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        System.out.println("Infix: "+convert(exp));
    }
}*/

//PREFIX TO POSTFIX
/*import java.util.*;
public class stackdemo{
    static boolean isOperator(char ch){
    return ch=='+' ||ch == '-'||ch =='*'||
           ch == '/'||ch =='^';
    }
    static String prefixTopostfix(String exp){
        Stack<String>stack = new Stack<>();
        //ttraverse from right to left
        for(int i=exp.length()-1;i>=0;i--){
            char ch = exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push(String.valueOf(ch));
            }
            else if(isOperator(ch)){
                String op1 = stack.pop();
                String op2 = stack.pop();
                String temp = op1+op2+ch;
                stack.push(temp);
            }
        }
        return stack.peek();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String prefix = sc.nextLine();
        System.out.println(prefixTopostfix(prefix));
    }
}*/

