class Solution {
    public Node deleteNode(Node head, int x) {
        // code here
        Node temp=head;
        if(head==null){
            return null;
        }
        if (x == 1) {
            head = head.next;
            if (head != null) {
                head.prev = null; 
            }
            return head;
        }
        int cnt=1;
        while(temp!=null && cnt<x){
            temp=temp.next;
            cnt++;
        }
        if(temp==null)
            return head;
        
       if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        // Update previous node's next pointer
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }


        return head;
    }
}
