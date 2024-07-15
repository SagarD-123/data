import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class deletion {
    public static void main(String[] args) {

        Integer[] deletion = {3,5,2,3,5,4,3};

        Arrays.sort(deletion,Comparator<T>.reverseOrder());
        System.out.println(Arrays.toString(deletion));
        // Scanner sc = new Scanner(System.in);
        // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        // System.out.println(Arrays.toString(arr));

        // Arrays.sort(arr,Comparator.reverseOrder());
        // System.out.println(Arrays.toString(arr));

        // int start = 0;
        // int end = arr.length;

        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[start] > arr[end]) {
        //         int temp = arr[start];
        //         arr[start] = arr[end];
        //         arr[end] = temp;
        //         start++;
        //         end--;
        //         if(start == end){
        //             break;
        //         }
        //         else if(start> end){
        //          break;
        //         }
        //     }
        //     else{
        //         break;
        //     }

        //     System.out.println(arr);
        // }
    }
}
// int indextodelete = sc.nextInt();
// System.out.println(Arrays.toString(arr));

// int[] afterarr = new int[arr.length-1];
// for (int i = 0,j = 0; i < arr.length; i++) {
// if(i != indextodelete){
// afterarr[j++] = arr[i];
// }
// }

// System.out.println(Arrays.toString(afterarr));
// int sum = 0;
// for(int i = 0; i < afterarr.length;i++){
// sum += afterarr[i];
// }

// System.out.println("So the avg is: "+ sum/afterarr.length);
