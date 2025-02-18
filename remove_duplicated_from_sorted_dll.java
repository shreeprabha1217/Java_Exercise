class Solution {
    Node removeDuplicates(Node head) {
        Node temp1 = head;

        while (temp1 != null && temp1.next != null) { 
            Node temp2 = temp1.next;
            while (temp2 != null && temp2.data == temp1.data) {
                temp2 = temp2.next;
            }
            temp1.next = temp2;
            if (temp2 != null) {
                temp2.prev = temp1;
            }
            temp1 = temp1.next;
        }
        return head;
    }
}
