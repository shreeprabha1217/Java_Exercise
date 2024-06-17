import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter number of columns: ");
        int cols=sc.nextInt();
        int data[][]=new int[rows][cols];
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[i].length;j++){
                data[i][j]=sc.nextInt();
            }
        }
        System.out.println("Let's rotate the matrix");
        int n=data.length;
        int[][] result=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               result[j][n-1-i]=data[i][j];
            }
            
        }
        System.out.println("Matrix rotation: ");
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                System.out.print(result[i][j]+" ");
            }
        }
        
    }
}
