class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        if (head == null) return null;

        Node temp = head;

        while (head != null && head.data == x) {
            head = head.next;
            head.prev = null;
            
        }

        temp = head; 

        while (temp != null) {
            if (temp.data == x) {
                Node nextNode = temp.next;
                Node prevNode = temp.prev;

                if (nextNode != null) {
                    nextNode.prev = prevNode;
                }
                if (prevNode != null) {
                    prevNode.next = nextNode;
                }
                temp = nextNode; 
            } else {
                temp = temp.next;
            }
        }
        return head;
    }
}
