public class FibonacciSeries {
    static int count = 0;
    static int n = 20; // Number of terms in the Fibonacci series
    public static void main(String[] args) {
        // generateFibonacci(n);
        // int prev1 = 1;
        // int prev2 = 0;
        // System.out.println("Fibonacci Series using Recursion:");
        // generateFibonacciUsingRecurrsion(1,0);
     System.out.println(generateFibonacciNth(n));
        // System.out.println("\nFibonacci Series up to " + n + " terms using Iteration:");

    }

    public static void generateFibonacciUsingRecurrsion(int prev1,int  prev2) {
        
     
        if (count <= 19) {
            System.out.print(prev2 + " ");
            int sum = prev1 + prev2; // Sum
            prev2 = prev1;
            prev1 = sum;
            count+=1;
            generateFibonacciUsingRecurrsion(prev1,prev2);
        }
    }

    public static int generateFibonacciNth(int n){

        if(n<=1){
            return n;
        }
        else {
            return generateFibonacciNth(n-1) + generateFibonacciNth(n-2);
        }

    }

    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
