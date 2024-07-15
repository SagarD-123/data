import java.util.*;


public class ArrayListOperations {
    public static int smallestNum(int[] array){
        int smallest = Integer.MAX_VALUE;
        
        for(int i = 0; i < array.length; i++){
            if(array[i] <= smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int largestNum(int[] array){
        int largest = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] >= largest){
                largest = array[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();

        // list.add(11);
        // list.add(22);
        // list.add(33);

        // //viewing all elements
        // Iterator<Integer> iterator = list.iterator();
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        // //removing a perticular element

        // //by their index
        // list.remove(1);

        int arr[] = {5,4,6,8,9};
        System.out.println(smallestNum(arr));
        System.out.println(largestNum(arr));
    }
}
