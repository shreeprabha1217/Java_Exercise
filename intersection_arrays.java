import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] a={3,4,5,2,8};
        int[] b={7,4,5,3,9,12};
        int[] c=new int[10];
        int k=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                   c[k]=a[i];
                   k++;
                }
            }
        }
        System.out.println("Intersection of two arrays: ");
        for(int i=0;i<c.length;i++){
            if(c[i]!=0){
                System.out.print(c[i]+" ");
            }
        }
        
    }
}
