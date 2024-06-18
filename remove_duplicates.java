import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   int[] a={1,2,3,2,1,5};
	   Set<Integer> set=new HashSet<>();
	   for(int element: a){
	       set.add(element);
	   }
	   int[] duplicate=new int[set.size()];
	   int i=0;
	   for(int element: set){
	       duplicate[i++]=element;
	   }
		System.out.println("Unique array: ");
		for(int element: duplicate){
		    System.out.print(element+" ");
		}
	}
}
