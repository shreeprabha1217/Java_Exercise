import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] a={
		    {1,2,3},
		    {5,6,7}
		    
		};
		int[][] b={
		    {4,6,7},
		    {8,12,32},
		    {9,7,6}
		};
	    int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
	}
}
