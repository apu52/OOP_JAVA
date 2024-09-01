import java.util.Scanner;

public class FibonacciSeries {

    
    public static void generateFibonacci(int n) {
        int first = 0, second = 1;
        System.out.print("Fibonacci series of length " + n + ": ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the length of the Fibonacci series: ");
        int n = scanner.nextInt();

        
        generateFibonacci(n);

        scanner.close(); 
    }
}
