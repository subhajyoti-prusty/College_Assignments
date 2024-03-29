package AD;

public class D6Q2 {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // adding node at first (before head)
    public void addFirst(int data) {
        // Step1 = create new node
        Node newNode = new Node(data);
        size++;
        // Check if lickedlist is empty
        if (head == null) {
            head = tail = newNode;// if linkedlist is empty then head and tail is same as the new node
            return;
        }
        // Step2 = newNode next = head
        newNode.next = head;
        // Step3 = head = nowNode
        head = newNode;
    }

    public void addLast(int data) {
        // create new node
        Node newNode = new Node(data);// step-1
        size++;
        if (head == null) {
            head = tail = newNode;// if linkedlist is empty then head and tail is same as the new node
            return;
        }
        tail.next = newNode; // assineing the vale of tail.next to the data a newNode
        tail = newNode;// declaring the data of newNode as tail

    }

    public void addmiddle(int idx, int data) {
        // if i have to add in first index
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int count = 0;

        while (count < idx - 1) {
            temp = temp.next;
            count++;
        }
        // When my count= idx-1 then the temp is previous value
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        D6Q2 ll = new D6Q2();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addmiddle(2, 5);
    }
}
