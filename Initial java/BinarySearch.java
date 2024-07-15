import java.util.Arrays;

public class BinarySearch {

    public static void bubbleSort(int[] a) {

        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }

        }
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i  = 0; i < n-1; i++) {
            int min_ind = i;
            for(int j = i+1; j < n;j++ ){
                if(arr[j] < arr[min_ind]){
                    min_ind = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[min_ind];
            arr[min_ind] = temp;
        }
    }

    public static void LinearSearch(int[] b, int data) {
        int f = b.length;
        for (int i = 0; i < f; i++) {
            if (b[i] == data) {
                System.out.println("index: " + i);
                break;
            }
        }
        
    }

    public static int binarySearch(int[] a, int n, int data) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == data) {
                return mid;
            } else if (a[mid] > data) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 5, 3, 63, 56,534,64,2,1,3,4,2,5 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

        // int[] a = { 9, 2, 5, 1, 7, 4, 8, 3, 6, 10 };
        // int n = a.length;

        // bubbleSort(a);

        // int data = 6;
        // int index = binarySearch(a, n, data);
        // if (index == -1) {
        // System.out.println("Element not found");
        // } else {
        // System.out.println("Element found at index: " + index);
        // }
    }
}
