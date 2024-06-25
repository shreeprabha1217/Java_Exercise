import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] a={1,31,5,9,8};
	    for(int i=1;i<a.length;i++){
	        int key=a[i];
	        int j=i-1;
	        while(j>=0&&a[j]>key){
	            a[j+1]=a[j];
	            j--;
	        }
	        a[j+1]=key;
	    }
	        System.out.println("Sorted algorithm is:");
	        for(int i=0;i<a.length;i++){
	            System.out.print(a[i]+" ");
	        }
	    
	}
}
