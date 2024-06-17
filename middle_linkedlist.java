import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<>();
        System.out.println("Enter the size of linkedList: ");
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            int z=sc.nextInt();
            list.add(z);
        }
        System.out.println("Middle element is: ");
        int middle;
        if(size%2==0){
            middle=size/2;
            System.out.println(list.get(middle-1));
            System.out.println(list.get(middle));
        }
        else{
            middle=size/2;
            System.out.println(list.get(middle));
        }
    }
}
