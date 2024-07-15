import org.w3c.dom.Node;

public class doublyLinkedList {
    static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        
    }
    public static void main(String[] args) {
        Node node1 = new Node(3);
        Node node2 = new Node(4);

        node1.next = node2;
        node2.prev = node1;

        Node node3 = new Node(5);
        
        node2.next = node3;
        node3.prev = node2;

        Node node4 = new Node(6);
        
        node3.next = node4;
        node4.prev = node3;

        Node currentNode = node1;
        System.out.println("Forward: ");
        while (currentNode != null) {
            
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
         System.out.println("null");
        
        currentNode = node4;
        System.out.println("backward: ");
        System.out.print(" null ");
        while (currentNode != null) {
            
            System.out.print(currentNode.data + " <- ");
            currentNode = currentNode.prev;
            
        }
    }
}
