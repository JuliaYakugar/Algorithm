package less_03;

public class MyList {
    private Node head;
    private Node tail;

    public void add(int value) {		// добавление в конец
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }

    public void revert() {
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;

            if (previous == null) {
                tail = currentNode;
            }
            if (next == null) {
                head = currentNode;
            }
            currentNode = next;
        }
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
			System.out.print(currentNode.value + " ");
			currentNode = currentNode.next;
        }
    }
}
