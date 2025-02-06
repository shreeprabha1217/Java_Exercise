class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return findLength(slow,fast);
        }
        return 0;
    }
    public int findLength(Node slow,Node fast){
        int count=1;
        fast=fast.next;
        while(slow!=fast){
            fast=fast.next;
            count++;
        }
        return count;
    }
}
