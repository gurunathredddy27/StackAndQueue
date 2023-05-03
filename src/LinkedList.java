    public class LinkedList {
        Node head;
        Node tail;

        class Main1 {
            public static void main(String[] args) {

                LinkedList l = new LinkedList();
                l.add(10);
                l.add(20);
                l.add(39);
                l.add(40);
                l.print();

            }
        }

        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                head.previous = null;
                tail.next = null;
            } else {
                tail.next = newNode;
                newNode.previous = tail;
                tail = newNode;
                tail.next = null;
            }
        }

        public void print() {
            Node currentNode = head;
            System.out.println(" Linked List :");
            while (currentNode != null) {
                System.out.println(currentNode.data + "  ");
                currentNode = currentNode.next;
            }

        }
    }


