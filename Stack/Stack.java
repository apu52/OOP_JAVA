import java.util.Scanner;

public class Stack {
    private int[] arr;    // Array to store stack elements
    private int top;      // Index of the top element in the stack
    private int capacity; // Maximum number of elements stack can hold

    // Constructor to initialize the stack with a given size
    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1; // Stack is initially empty
    }

    // Method to add an element to the stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
        System.out.println("Pushed " + x + " into the stack");
    }

    // Method to remove the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1; // Indicate that the stack is empty
        }
        return arr[top--];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Method to print the elements of the stack
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    // Main method with menu-driven interface
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();
        Stack stack = new Stack(size);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Push element");
            System.out.println("2. Pop element");
            System.out.println("3. Show stack elements");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter a number to push: ");
                    int numToPush = scanner.nextInt();
                    stack.push(numToPush);
                    break;

                case 2:
                    int poppedValue = stack.pop();
                    if (poppedValue != -1) {
                        System.out.println("Popped " + poppedValue + " from the stack");
                    }
                    break;

                case 3:
                    stack.printStack();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }
}
