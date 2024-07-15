// // public class main {
// //     public static void main(String[] args) {
// //         try {
// //             int[] arr = new int[2];
// //             System.out.println(arr[3]);//Out of Bound array error
// //         } catch (ArrayIndexOutOfBoundsException e) {
// //            System.out.println("Out of Bound array error");
// //         } catch (ArithmeticException e) {
// //             System.out.println("Arithmetic error");
// //         } finally{
// //             System.out.println("The code will be executed");
// //         }
        
// //     }
// // }

// package Exception;
// public class Exception {
//     public static void main(String[] args) {
//         try {
//             // Point a) Multiple catch blocks
//             int[] numbers = {1, 2, 3};
//             System.out.println(numbers[5]); // Trying to access out-of-bounds index
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Array index out of bounds exception occurred.");
//         } catch (ArithmeticException e) {
//             System.out.println("Arithmetic exception occurred.");
//         } catch (ArrayStoreException e) {
//             System.out.println("Some other exception occurred.");
//         }

//         try {
//             // Point b) try-catch-finally combination
//             int result = divide(10, 0); // Trying to divide by zero
//             System.out.println("Result of division: " + result);
//         } catch (ArithmeticException e) {
//             System.out.println("Cannot divide by zero.");
//         } finally {
//             System.out.println("Inside finally block.");
//         }

//         try {
//             // Point c) try-finally combination
//             int[] numbers = {1, 2, 3};
//             System.out.println(numbers[1]); // Accessing valid index
//         } finally {
//             System.out.println("Inside finally block.");
//         }

//         try {
//             // Point d) Nested try blocks
//             try {
//                 int[] array = new int[3];
//                 System.out.println(array[4]); // Trying to access out-of-bounds index
//             } catch (ArrayIndexOutOfBoundsException e) {
//                 System.out.println("Inner catch block: Array index out of bounds exception.");
//             }
//         } catch (ArithmeticException e) {
//             System.out.println("Outer catch block: Some other exception occurred.");
//         }
//     }

//     // Method to demonstrate throws keyword
//     public static int divide(int num1, int num2) throws ArithmeticException {
//         if (num2 == 0) {
//             throw new ArithmeticException("Cannot divide by zero.");
//         }
//         return num1 / num2;
//     }
// }
