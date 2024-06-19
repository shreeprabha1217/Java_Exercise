import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] a={
		    {1,2,3},
		    {5,6,7},
		    {8,6,5}
		};
		int[][] b={
		    {4,6,7},
		    {8,12,32},
		    {5,3,21}
		};
	    int rows=a.length;
	    int cols=a[0].length;
	    int[][] sum=new int[rows][cols];
	    for(int i=0;i<rows;i++){
	        for(int j=0;j<cols;j++){
	            sum[i][j]=a[i][j]+b[i][j];
	        }
	    }
	    System.out.println("Addition: ");
	    for(int i=0;i<rows;i++){
	        for(int j=0;j<cols;j++){
	            System.out.print(sum[i][j]+" ");
	        }
	    }
	}
}
