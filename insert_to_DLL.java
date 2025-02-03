class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
         Node temp=head;
         Node insert=new Node(x);
        // Your code here
        if(head==null){
            return insert;
        }
        int cnt=0;
        while(temp!=null&&cnt<p){
            temp=temp.next;
            cnt++;
        }
        if(temp==null)
            return head;
        insert.next = temp.next;
        insert.prev = temp;  // Doubly Linked List update
        temp.next = insert;
        if (insert.next != null) {
            insert.next.prev = insert;
        }

        return head;
        
    }
}
