public class Main {
    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrixA.length;
        int sum1=0,sum2=0;

        for (int i = 0; i < rows; i++) {
            for(int j=0;j<rows;j++){
                if(i==j){
                    sum1+=matrixA[i][j];
                }
                if((i+j)==(rows-1)){
                    sum2+=matrixA[i][j];
                }
            }
        }
            

        System.out.println("Sum of diagonal elements: " + sum1);
    }
}
