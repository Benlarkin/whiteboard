public class Intersect {
    Node getIntersection(Node head1, Node head2) {
        Node resultHead = null;
        Node resultRunner = null;
        Node t1 = head1;
        // Traverse list1 and search each element of it in list2.
        // If the element is present in list 2, then insert the
        // element to result
        while (t1 != null) {
            if (isPresent(head2, t1.data)) {
                if (resultHead == null) {
                    resultHead = new Node(t1.data);
                    resultRunner = resultHead;
                } else {
                    resultRunner.next = new Node(t1.data);
                    resultRunner = resultRunner.next;
                    t1 = t1.next;
                }
            }
        }
        // no more elements in t1, return head of generated list
        return resultHead;
    }

    // traverse list and check if data is found
    boolean isPresent(Node head, int data) {
        Node t = head;
        while (t != null) {
            if (t.data == data) {
                return true;
            }
            t = t.next;
        }
        return false;
    }

    LinkedList getIntersection(Node head1, Node head2) {
        HashSet<Integer> hset = new HashSet<>();
        Node n1 = head1;
        Node n2 = head2;
        Node resultHead = null;
        Node resultRunner = null;

        // loop stores all the elements of list1 in hset
        while (n1 != null) {
            hset.add(n1.data);
            n1 = n1.next;
        }

        // For every element of list2 present in hset
        // loop inserts the element into the result
        while (n2 != null) {
            if (hset.contains(n2.data)) {
                if (resultHead == null) {
                    resultHead = new Node(t1.data);
                    resultRunner = resultHead;
                } else {
                    resultRunner.next = new Node(t1.data);
                    resultRunner = resultRunner.next;
                }
            }
            n2 = n2.next;
        }
        return resultHead;
    }
}