class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        if (head == null || head.next == null) {
        return head;
    }
        DLLNode last=null;
       while(head!=null){
           last=head.prev;
           head.prev=head.next;
           head.next=last;
           head=head.prev;
       }
       return last.prev;
    
    }
}
