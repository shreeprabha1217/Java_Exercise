import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<>();
        LinkedList<Integer> list1=new LinkedList<> ();
        System.out.println("Enter the size of first list:");
        int size=sc.nextInt();
        System.out.println("Enter the size of second list: ");
        int size2=sc.nextInt();
        System.out.println("Enter the elements of first list: ");
        for(int i=0;i<size;i++){
            int item=sc.nextInt();
            list.add(item);
        }
        System.out.println("Enter the elements of second list: ");
        for(int i=0;i<size2;i++){
            int item2=sc.nextInt();
            list1.add(item2);
        }
        int merge_size=size+size2;
        LinkedList<Integer> merge_list=new LinkedList<>();
        for(int i=0;i<size;i++){
            int item5=list.get(i);
            merge_list.add(item5);
        }
        for(int i=0;i<size2;i++){
            int item4=list1.get(i);
            merge_list.add(item4); 
        }
        System.out.println("Merged Linked list is: ");
        for(int i=0;i<merge_size;i++){
            System.out.print(merge_list.get(i)+" ");
        }
    }
}
