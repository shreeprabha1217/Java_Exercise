import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<>();
        System.out.println("Enter the size of list");
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            int z=sc.nextInt();
            list.add(z);
        }
        System.out.println("Reversing the strig");
        for(int i=size-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
