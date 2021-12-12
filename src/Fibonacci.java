import java.sql.SQLOutput;
import java.util.Scanner;

public class Fibonacci {

    //setting up storage/cache for memoisation in the form of an array
    // - memoisation is an optimization technique used
    // to speed up computer programs by storing the results 
    //of expensive function calls and returning the cached 
    //result when the same inputs occur again.
    
    private static long[]fibonacciStorage;
    public static void main(String[] args) {

        //limited to 92nd number
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Please enter the nth number of Fibonacci Sequence: ");
        n = scanner.nextInt();

        fibonacciStorage = new long[n+1];

        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " , ");
        }
    }

    private static long fibonacci(int n) {
        //states the base case to prevent infinite recursion (stack overflow)
        if (n<=1) {
            return n;
        }
        if(fibonacciStorage[n] !=0) {
            return fibonacciStorage[n];
        }
        //fibonacci nth number = nth-1 number + nth-2 number => formula: n = (n-1)+(n-2)
        long nthFibonacciNumber = (fibonacci(n-1) + fibonacci(n-2));
        fibonacciStorage[n] = nthFibonacciNumber;
        return nthFibonacciNumber;

    }

}
