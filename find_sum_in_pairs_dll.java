class Solution {
    public static Node findTail(Node head){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        return temp;
    }
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        Node left=head;
        Node right=findTail(head);
        ArrayList<ArrayList<Integer>> ds=new ArrayList<>();
        while(left.data<right.data){
            if(left.data+right.data==target){
                ArrayList<Integer> pair=new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                ds.add(pair);
                right=right.prev;
                left=left.next;
            }else if(left.data+right.data<target){
                left=left.next;
            }
            else
                right=right.prev;
        }
        return ds;
    }
}
        
