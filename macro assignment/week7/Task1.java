// using java
// Create a class called Stack that implements the stack data structure. The class should have methods to push, pop, and peek elements, as well as to check if the stack is empty.

// public class Stack1 {

//     private int[] stack;
//     private int size;
//     private int top;
 
//     // Constructor
//     public Stack1(int size) {
//         this.size = size;
//         this.stack = new int[size];
//         this.top = -1;
//     }
 
//     // Push an element onto the stack
//     public void push(int element) {
//         if(top < size - 1) {
//             top++;
//             stack[top] = element;
//         }
//     }
 
//     // Pop an element from the stack
//     public int pop() {
//         if(top >= 0) {
//             int element = stack[top];
//             stack[top] = 0;
//             top--;
//             return element;
//         }
//         return 0;
//     }
 
//     // Peek the top element of the stack
//     public int peek() {
//         return stack[top];
//     }
 
//     // Check if the stack is empty
//     public boolean isEmpty() {
//         return top == -1;
//     }
// }
// class Task1{
//   public static void main(String args[]){
//     Stack<Integer> s=new Stack<Integer>();
//     s.push(1);
//     s.push(2);
//     System.out.println(s);
//   }
// }


public class Queuee {
    private int[] queue;
    private int head;
    private int tail;
    private int size;

    public Queuee(int size) {
        this.size = size;
        this.queue = new int[size];
        this.head = 0;
        this.tail = 0;
    }

    //method to enqueue an element
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full, cannot add element.");
        } else {
            queue[tail] = element;
            tail = (tail + 1) % size;
        }
    }

    //method to dequeue an element
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot remove element.");
            return -1;
        } else {
            int element = queue[head];
            head = (head + 1) % size;
            return element;
        }
    }
}
  class Task1{
    public static void main(String args[]){
      System.out.println("hi");
    }
  }