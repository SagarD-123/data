import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;
// import javax.swing.text.html.HTMLDocument.Iterator;
import java.util.LinkedList;
// import java.util.random;
import java.util.Random;
import java.util.Stack;
import java.util.Vector;

/**
 * Main
 */

//  class demo {
//     void print(){
//        System.out.println("this is sagar");
//     }
//     }
 
public class Main {

    public static void arrange(int[] A) {
        int temp = 0;
        int start = 0;
        int end = A.length - 1;
        for (int i = 0; i < A.length / 2; i++) {
            if (A[start] > A[end]) {
                temp = A[end];
                A[end] = A[start];
                A[start] = temp;
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        check ch = new check();
        try {
            Class.forName("NonExistentClass");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }
        ch.display();
        try {
            demo d = new demo();
            d.print();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }
        int a = 9;
        int b = 0;
        try {
            int c = a/b;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("error: " + e.getMessage());
        }
        // HashMap<String,Integer> A = new HashMap<String,Integer>();
        // A.put("sagar", 1);
        // A.put("rohit", 2);
        // A.put("dipak", 3);
        // System.out.println(A);

        // String a = A.get(1);
        // System.out.println(a);
        // Vector<String> vc = new Vector<>();

        // vc.add("sagar");
        // vc.add("rohit");
        // vc.addAll(0, vc);
        // System.out.println(vc);
        // Stack<String> stack = new Stack<>();
        // stack.push("lolo");
        // stack.push("hulul");
        // stack.push("dellulu");
        // stack.pop();
        
        // System.out.println(stack);
        // LinkedList<Integer> ds = new LinkedList<>();

        // ds.add(22);
        // ds.add(33);
        // ds.add(44);
        // ds.add(55);
        // ds.add(66);
        // System.out.println(ds);
        // ds.toArray();
        // System.out.println("After converting to integer: ");
        // for(Integer d : ds){
        //     System.out.println(d);
        // }
        // System.out.println(ds.lastIndexOf(66));
        // ArrayList<String> A = new ArrayList<String>();
        // A.add("Sagar");
        // A.add("rahul");

        // System.out.println(A);

        // Iterator<String> i = A.iterator();
        // while (i.hasNext()) {
        //     String element = i.next();
        //     System.out.println(element);
        // }

        // A.add(2, "dipak");
        // for (String element : A) {
        //     System.out.println(element);
        // }

        // System.out.println(A.contains("Sagar"));
    

        // ArrayList<String> Cloned = (ArrayList<String>) A.clone();
        // Iterator<String> f = Cloned.iterator();
        // while(i.hasNext()){
        // String element = f.next();
        // System.out.println(element);
        // }
        // System.out.println( A.size());
        // System.out.println(A.get(1));

        // System.out.println(A.size());
        // // Iterator<String> iterator = A.Iterator();
        // ListIterator<String> iterator = A.listIterator();

        // while(iterator.hasNext()){
        // String element = iterator.next();
        // System.out.println(element);
        // }
        // String integer = rd.nextLine();

        // System.out.println(integer);

        // int n = sc.nextInt();
        // Boolean[] arr1 = new Boolean[n];

        // for (int i = 0; i < arr1.length; i++) {

        // arr1[i] = rd.nextBoolean();
        // }

        // System.out.println(Arrays.toString(arr1));
        // int[] newarr = new int[arr1.length + 1];

        // arrange(arr1);
        // System.out.println(Arrays.toString(arr1));
    }
}// /**
 // * Main
 // */

// class demo{
// protected void display(){
// System.out.println("this is for non static static.");
// }

// }

// public class Main {
// protected static void print(){
// System.out.println("this is for static testing.");
// }
// public static void main(String[] args) {
// demo d = new demo();
// d.display();
// print();
// }
// }

// // import java.util.Scanner;

// // /**
// // * Main
// // */

// // public class Main {
// // static int sum = 0;
// // static double avg = 0;

// // public static double gut(int[] A, int n) {
// // for (int i = 0; i < A.length; i++) {
// // sum += A[i];
// // avg = sum / A.length;

// // }
// // return avg;
// // }

// // public static void main(String[] args) {
// // Scanner sc = new Scanner(System.in);
// // demo dm = new demo();
// // int[] arr = { 1, 2, 3, 4, 5, 6 };
// // System.out.println( Main.gut(arr, 6));
// // // System.out.println(gut(arr, 6));
// // }
// // }

// // // Scanner sc = new Scanner(System.in);

// // // int n = sc.nextInt();
// // // int[] A = new int[n];
// // // int temp = 0;
// // // int start = 0;
// // // int end = A.length;
// // // for(int i = 0 ; i < n ; i++){
// // // A[i] = sc.nextInt();

// // // }

// // // for(int i = 0 ; i < n ; i++){
// // // if(A[start] > A[end]){
// // // temp = A[end];
// // // A[end] = A[start];
// // // A[start] = temp;
// // // }
// // // System.out.println(A);
// // // for (int j = 0; j < n; j++) {
// // // System.out.println(A[j]);
// // // }
// // // // Scanner sc = new Scanner(System.in);
// // // // int t = 5;

// // // // while (t--> 0) {

// // // // int a = sc.nextInt();
// // // // float b = sc.nextFloat();
// // // // long c = sc.nextLong();
// // // // byte d = sc.nextByte();
// // // // String s = sc.nextLine();

// // // // System.out.println(a);
// // // // System.out.println(b);
// // // // System.out.println(c);
// // // // System.out.println(d);
// // // // System.out.println(s);

// // // }
// // // // String str = "123";
// // // // int intValue = Integer.parseInt(str);
// // // // System.out.println("this is converted in string to int value: " +
// // // intValue);

// // // }

// // // // User-defined exception
// // // class InsufficientFundsException extends Exception {
// // // public InsufficientFundsException(String message) {
// // // super("this is a InsufficientFundsException");
// // // }
// // // }

// // // // Bank account class
// // // class CheckingAccount {
// // // private double balance;

// // // // Constructor
// // // public CheckingAccount(double initialBalance) {
// // // balance = initialBalance;
// // // }

// // // // Method to withdraw funds
// // // public void withdraw(double amount) throws InsufficientFundsException {
// // // if (amount <= balance) {
// // // balance -= amount;
// // // System.out.println("Withdrawal successful. Remaining balance: " +
// balance);
// // // } else {
// // // throw new InsufficientFundsException("Insufficient funds to withdraw $"
// +
// // // amount);
// // // }
// // // }

// // // // Method to get balance
// // // public double getBalance() {
// // // return balance;
// // // }
// // // }

// // // // Main class
// // // public class Main {
// // // public static void main(String[] args) {
// // // CheckingAccount account = new CheckingAccount(1000.0);

// // // try {
// // // // Try to withdraw an amount
// // // account.withdraw(1500.0);
// // // } catch (InsufficientFundsException e) {
// // // // Catch the InsufficientFundsException
// // // System.out.println("Exception caught: " + e.getMessage());
// // // }

// // // // Display remaining balance
// // // System.out.println("Current Balance: $" + account.getBalance());
// // // }
// // // }
