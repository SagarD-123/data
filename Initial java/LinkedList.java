import org.w3c.dom.Node;

/**
 * LinkedList
 */
public class LinkedList {

   static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static int findLowestValue(Node head) {
        int minValue = head.data;
        Node currentNode = head.next;
        while (currentNode != null) {
            if (currentNode.data < minValue) {
                minValue = currentNode.data;
            }
            currentNode = currentNode.next;
        }
        return minValue;
    }

    public static void main(String[] args) {
        Node firstnode = new Node(3);
        Node secondnode = new Node(4);
        Node thirdnode = new Node(5);
        Node forthnode = new Node(6);

        firstnode.next = secondnode;
        secondnode.next = thirdnode;
        thirdnode.next = forthnode;

        Node currentNode = firstnode;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> " );
            currentNode = currentNode.next;
            
        }
           System.out.println("null");

           int minValue = findLowestValue(firstnode);
           System.out.println("The lowest value is: " + minValue);
    }}

// Node node1 = new Node(3);
// Node node2 = new Node(5);
// Node node3 = new Node(13);
// Node node4 = new Node(2);
// ;
// node2.next = node3;
// node1.next = node2;
// node3.next = node4;
// node4.next = node1; // Circular link

// Node currentNode = node1;
// Node startNode = node1;
// System.out.print(currentNode.data + " -> ");
// currentNode = currentNode.next;

// while (currentNode != startNode) {
// System.out.print(currentNode.data + " -> ");
// currentNode = currentNode.next;
// }

// System.out.println("...");