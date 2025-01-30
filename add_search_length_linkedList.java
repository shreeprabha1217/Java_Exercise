class Node{
    int data;
    Node node;

    Node(int data1){
        this.data=data1;
        this.node=null;
    }

    Node(int data1,Node node1){
        this.data=data1;
        this.node=node1;
    }
};

public class LinkedList{
    private static Node convert2LinkedList(int[] arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.node=temp;
            mover=temp;
        }
        return head;
    }
    private static int lengthOfLink(Node head){
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.node;
            cnt++;
        }
        return cnt;
    }
    private static boolean checkIfPresent(Node head, int value){
        Node temp=head;
        while(temp!=null){
            if(temp.data==value){
                return true;
            }
            temp=temp.node;
        }
        return false;
    }
    public static void main(String[] args){
        int[] a={2,4,5,3,51};
        Node y=convert2LinkedList(a);
        System.out.println(lengthOfLink(y));
        System.out.println(checkIfPresent(y, 51));
    }
}
